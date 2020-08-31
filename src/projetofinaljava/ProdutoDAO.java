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

// git add . ->  git commit -m "atualizacao dao produto" -> git push   
public class ProdutoDAO implements DAO <Produto>{
    
    private final String stmtSelectById = "SELECT * FROM produto WHERE id = ?";
    private final String stmtSelectAll = "SELECT * FROM produto";
    private final String stmtInsert = "INSERT INTO cliente (cpf, nome, sobrenome) VALUES(?, ?, ?)";
    private final String stmtUpdate = "UPDATE cliente SET cpf = ?, nome = ?, sobrenome = ? WHERE id = ?";
    private final String stmtDelete = "DELETE FROM cliente WHERE ID = ?";

    @Override
    public Produto get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
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
            
            List<Produto> produto = new ArrayList();
            
            do {
                Long id = res.getLong("id");
                String descricao = res.getString("descricao");                
                
                Produto produto = new Produto(id, descricao);
                produto.add(produto);
            } while (res.next());
            
            return produto;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar a lista de produtos: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, stmt, conn);
        }
    }

    @Override
    public void insere(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualiza(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleta(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
