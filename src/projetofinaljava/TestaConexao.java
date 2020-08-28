/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sharonhasegawa
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/teste?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            res = stmt.executeQuery("select name, last_name from users");
            // Usar PreparedStatement para evitar SQL injection
            // class ConnectionFactory
            
            while (res.next()) {
                String name = res.getString("name");
                String lastName = res.getString("name");
                System.out.println(name + " " + lastName);
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro com a conexão ao banco de dados: " + e.getMessage());
        } finally {
            closeResultSet(res);
            closeStatement(stmt);
            closeConnection(conn);
        }
    }
    
    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void closeStatement(Statement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void closeResultSet(ResultSet res) {
        try {
            res.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
