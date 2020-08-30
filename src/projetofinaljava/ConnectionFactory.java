package projetofinaljava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        Properties props = getProperties();

        String dbName = props.getProperty("database_name");
        String dbUser = props.getProperty("database_user");
        String dbPassword = props.getProperty("database_password");

        String url = "jdbc:mysql://localhost:3306/" + dbName + "?useTimezone=true&serverTimezone=UTC";
        return DriverManager.getConnection(url, dbUser, dbPassword);
    }
    
    public static Properties getProperties() {
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
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }
    
    public static void closeStatement(Statement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a SQL Statement: " + e.getMessage());
        }
    }
    
    public static void closeResultSet(ResultSet res) {
        try {
            res.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar SQL ResultSet: " + e.getMessage());
        }
    }
}
