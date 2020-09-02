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
 * @author levyc
 */ 
public class ProdutoDAO implements DAO<Produto> {

    private final String stmtSelectById = "SELECT * FROM produto WHERE id = ?";
    private final String stmtSelectAll = "SELECT * FROM produto";
    private final String stmtInsert = "INSERT INTO produto(descricao) VALUES(?)";
    private final String stmtUpdate = "UPDATE produto SET descricao = ? WHERE id = ?";
    private final String stmtDelete = "DELETE FROM produto WHERE id = ?";

    @Override
    public Produto get(long id) {
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

            String descricao = res.getString("descricao");

            Produto produto = new Produto(id, descricao);
            return produto;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar um cliente: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public List<Produto> getLista() {
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

            List<Produto> produtos = new ArrayList();

            do {
                long id = res.getLong("id");
                String descricao = res.getString("descricao");

                Produto produto = new Produto(id, descricao);
                produtos.add(produto);
            } while (res.next());

            return produtos;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar a lista de produtos: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void insere(Produto produto) {
        if (produto.getDescricao().isEmpty()) {
            throw new RuntimeException("O campo descrição é obrigatório.");
        }
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtInsert, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, produto.getDescricao());
            
            
            stmt.execute();
            res = stmt.getGeneratedKeys();
            res.next();
            
            long id = res.getLong(1);
            produto.setId(id);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir um produto: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void atualiza(Produto produto) {
        if (produto.getDescricao().isEmpty()) {
            throw new RuntimeException("O campo descrição é obrigatório.");
        }
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtUpdate);
            
            stmt.setString(1, produto.getDescricao());            
            stmt.setLong(2, produto.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar um produto: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void deleta(Produto produto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtDelete);
            stmt.setLong(1, produto.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

}
