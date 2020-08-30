/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

import org.junit.Test;
import projetofinaljava.ConnectionFactory;

/**
 *
 * @author sharonhasegawa
 */
public class TestaConexao {
    @Test
    public void testaConexao() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            assertEquals(true, conn.isValid(0));
            System.out.println("Conexão realizada com sucesso!");
            
            stmt = conn.prepareStatement("SHOW TABLES");
            res = stmt.executeQuery();
            
            String dbName = ConnectionFactory.getLocalProperties().getProperty("database_name");
            
            System.out.println("\nTabelas no banco de dados `"+ dbName +"`: ");
            while(res.next()) {
               System.out.println(res.getString(1));
            }
        } catch (SQLException e) {
            fail("Ocorreu um erro com a conexão ao banco de dados: " + e.getMessage());
        } finally {
            ConnectionFactory.close(res, null, conn);
        }
    }
}
