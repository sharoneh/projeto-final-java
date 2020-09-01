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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sharonhasegawa
 */
public class ItemDoPedidoDAO {
    private final String stmtSelectById = ""
            + "SELECT id_pedido, id_produto, produto.descricao, quantidade "
            + "FROM item_do_pedido INNER JOIN produto "
            + "ON item_do_pedido.id_produto = produto.id "
            + "WHERE id_pedido = ?";
    
    private final String stmtSelectList = ""
            + "SELECT id_pedido, id_produto, produto.descricao, quantidade "
            + "FROM item_do_pedido INNER JOIN produto "
            + "ON item_do_pedido.id_produto = produto.id "
            + "WHERE id_pedido = ? "
            + "ORDER BY id_pedido;";
    
    private final String stmtInsert = ""
            + "INSERT INTO item_do_pedido "
            + "(id_pedido, id_produto, quantidade) "
            + "VALUES(?, ?, ?)";
    
    private final String stmtUpdate = ""
            + "UPDATE item_do_pedido "
            + "SET id_produto = ?, quantidade = ? "
            + "WHERE id_pedido = ?";
    
    private final String stmtDelete = ""
            + "DELETE FROM item_do_pedido "
            + "WHERE id_pedido = ? "
            + "AND id_produto = ?";

    public ItemDoPedido get(long idPedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtSelectById);
            stmt.setLong(1, idPedido);
            
            res = stmt.executeQuery();
            
            if (!res.next()) {
                return null;
            }
            
            long idProduto = res.getLong("id_produto");
            String descricao = res.getString("descricao");
            long quantidade = res.getLong("quantidade");
            
            Produto produto = new Produto(idProduto, descricao);
            ItemDoPedido item = new ItemDoPedido(quantidade, produto);
            
            return item;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar um item do pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }
    
    public List<ItemDoPedido> getLista(long idPedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtSelectList);
            stmt.setLong(1, idPedido);
            
            res = stmt.executeQuery();
            
            if (!res.next()) {
                return null;
            }
            
            List<ItemDoPedido> itens = new ArrayList();
            
            do {
                Long idProduto = res.getLong("id_produto");
                String descricao = res.getString("descricao");
                Long quantidade = res.getLong("quantidade");
                
                Produto produto = new Produto(idProduto, descricao);
                ItemDoPedido item = new ItemDoPedido(quantidade, produto);
                
                itens.add(item);
            } while (res.next());
            
            return itens;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar a lista de itens de um pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    public void insere(long idPedido, ItemDoPedido item) {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtInsert);
            stmt.setLong(1, idPedido);
            stmt.setLong(2, item.getProduto().getId());
            stmt.setLong(3, item.getQuantidade());
            
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir um item do pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(null, stmt, conn);
        }
    }

    public void atualiza(long idPedido, ItemDoPedido item) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtUpdate);
            
            stmt.setLong(1, item.getProduto().getId());
            stmt.setLong(2, item.getQuantidade());
            stmt.setLong(3, idPedido);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar um item do pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    public void deleta(long idPedido, ItemDoPedido item) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            
            stmt = conn.prepareStatement(stmtDelete);
            stmt.setLong(1, idPedido);
            stmt.setLong(2, item.getProduto().getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir um item do pedido: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }
    
}
