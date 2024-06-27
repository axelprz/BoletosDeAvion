
package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    public Connection getConexion(){
        try {
            String db = "jdbc:mysql://localhost:3306/boletos_avion?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","agustin123");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}
