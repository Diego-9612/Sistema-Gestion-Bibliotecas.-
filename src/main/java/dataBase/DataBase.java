package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Guerrero
 */
public class DataBase {

    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/sistemagestionbiblioteca?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private final String USER = "root";
    private final String PASSWORD = "96122325463";

    public void connect() throws SQLException {

        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void disconnect() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()){
                conexion.close();
            }
        }

    }

}
