/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sharonhasegawa
 */
public class ClienteDAO implements DAO<Cliente> {
    private final String stmtSelectById = "SELECT * FROM cliente WHERE id = ?";
    private final String stmtSelectAll = "SELECT * FROM cliente";
    private final String stmtInsert = "INSERT INTO cliente (cpf, nome, sobrenome) VALUES(?, ?, ?)";
    private final String stmtUpdate = "UPDATE cliente SET cpf = ?, nome = ?, sobrenome = ? WHERE id = ?";
    private final String stmtDelete = "DELETE FROM cliente WHERE id = ?";

    @Override
    public Cliente get(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtSelectById);
            stmt.setLong(1, id);
            
            res = stmt.executeQuery();
            
            if (!res.next()) {
                return null;
            }
            
            String cpf = res.getString("cpf");
            String nome = res.getString("nome");
            String sobrenome = res.getString("sobrenome");

            Cliente cliente = new Cliente(id, cpf, nome, sobrenome);
            return cliente;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar um cliente: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public List<Cliente> getLista() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(stmtSelectAll);
            res = stmt.executeQuery();
            
            if (!res.next()) {
                return null;
            }
            
            List<Cliente> clientes = new ArrayList();
            
            do {
                Long id = res.getLong("id");
                String cpf = res.getString("cpf");
                String nome = res.getString("nome");
                String sobrenome = res.getString("sobrenome");
                
                Cliente cliente = new Cliente(id, cpf, nome, sobrenome);
                clientes.add(cliente);
            } while (res.next());
            
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar a lista de clientes: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void insere(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtInsert, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSobrenome());
            
            stmt.execute();
            res = stmt.getGeneratedKeys();
            res.next();
            
            long id = res.getLong(1);
            cliente.setId(id);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir um cliente: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void atualiza(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtUpdate);
            
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSobrenome());
            stmt.setLong(4, cliente.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar um cliente: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void deleta(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmtPedidosDoCliente = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            // verificar se o cliente tem pedidos
            String query = "SELECT pedido.id, nome "
                    + "FROM cliente INNER JOIN pedido "
                    + "ON cliente.id = pedido.id_cliente "
                    + "WHERE cliente.id = ?";
            
            stmtPedidosDoCliente = conn.prepareStatement(query);
            stmtPedidosDoCliente.setLong(1, cliente.getId());
            res = stmtPedidosDoCliente.executeQuery();
            
            if (res.next()) {
                throw new RuntimeException("O cliente não pode ser excluído porque ele tem pedidos registrados.");
            }
            
            stmt = conn.prepareStatement(stmtDelete);
            stmt.setLong(1, cliente.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir um cliente: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }
}
