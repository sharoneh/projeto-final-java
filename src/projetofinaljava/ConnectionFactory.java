package projetofinaljava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        Properties props = getLocalProperties();

        String dbName = props.getProperty("database_name");
        String dbUser = props.getProperty("database_user");
        String dbPassword = props.getProperty("database_password");

        String url = "jdbc:mysql://localhost:3306/" + dbName + "?zeroDateTimeBehavior=CONVERT_TO_NULL";
        return DriverManager.getConnection(url, dbUser, dbPassword);
    }
    
    public static Properties getLocalProperties() {
        Properties props = new Properties();
	InputStream inputStream;

        try {
            inputStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("resources/config.properties");

            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new FileNotFoundException("Arquivo de definição de propriedades não encontrado em `src/resources/config.properties`.");
            }

            return props;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao buscar os dados do arquivo de propriedades: " + e.getMessage());
        }
    }
    
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }
    
    public static void closeStatement(PreparedStatement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a SQL Statement: " + e.getMessage());
        }
    }
    
    public static void closeResultSet(ResultSet res) {
        try {
            if (res != null && !res.isClosed()) {
                res.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar SQL ResultSet: " + e.getMessage());
        }
    }
    
    public static void close(ResultSet res, PreparedStatement stmt, Connection conn) {
        closeResultSet(res);
        closeStatement(stmt);
        closeConnection(conn);
    }
}
