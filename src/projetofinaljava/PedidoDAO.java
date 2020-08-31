/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sharonhasegawa
 */
public class PedidoDAO implements DAO<Pedido> {
    private final String stmtSelectById = "SELECT * FROM pedido WHERE id = ?";
    
    private final String stmtSelectAll = "SELECT pedido.id, id_cliente, cliente.cpf, cliente.nome, cliente.sobrenome, data "
            + "FROM pedido INNER JOIN cliente "
            + "ON id_cliente = cliente.id";
    
    private final String stmtInsert = "INSERT INTO pedido (id_cliente, data) VALUES(?, ?)";
    private final String stmtUpdate = "UPDATE pedido SET id_cliente = ?, data = ? WHERE id = ?";
    private final String stmtDelete = "DELETE FROM pedido WHERE id = ?";

    @Override
    public Pedido get(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        ClienteDAO clienteDao = new ClienteDAO();
        ItemDoPedidoDAO itemPedidoDao = new ItemDoPedidoDAO();
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtSelectById);
            stmt.setLong(1, id);
            
            res = stmt.executeQuery();
            
            if (!res.next()) {
                return null;
            }
            
            long idCliente = res.getLong("id_cliente");
            LocalDate data = res.getDate("data").toLocalDate();
            
            List<ItemDoPedido> itens = itemPedidoDao.getLista(id);
            
            Cliente cliente = clienteDao.get(idCliente);
            Pedido pedido = new Pedido(id, data, cliente, itens);
            
            return pedido;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar um pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public List<Pedido> getLista() {
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
            
            List<Pedido> pedidos = new ArrayList();
            
            do {
                Long id = res.getLong("id");
                LocalDate data = res.getDate("data").toLocalDate();
                
                Long idCliente = res.getLong("id_cliente");
                String cpf = res.getString("cpf");
                String nome = res.getString("nome");
                String sobrenome = res.getString("sobrenome");
                
                Cliente cliente = new Cliente(idCliente, cpf, nome, sobrenome);
                
                Pedido pedido = new Pedido(id, data, cliente, null);
                pedidos.add(pedido);
            } while (res.next());
            
            return pedidos;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar a lista de pedidos: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void insere(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtInsert, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, pedido.getCliente().getId());
            stmt.setDate(2, Date.valueOf(pedido.getData()));
            
            stmt.execute();
            res = stmt.getGeneratedKeys();
            res.next();
            
            long id = res.getLong(1);
            pedido.setId(id);
            
            List<ItemDoPedido> itens = pedido.getItens();
            if (!itens.isEmpty()) {
                ItemDoPedidoDAO itemDao = new ItemDoPedidoDAO();
                
                for (ItemDoPedido item : itens) {
                    itemDao.insere(id, item);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir um pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void atualiza(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtUpdate);
            
            stmt.setLong(1, pedido.getCliente().getId());
            stmt.setDate(2, Date.valueOf(pedido.getData()));
            stmt.setLong(3, pedido.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar um pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void deleta(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtDelete);
            stmt.setLong(1, pedido.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir um pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }
    
}
