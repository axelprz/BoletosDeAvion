
package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Pago;
import models.conexion.Conexion;

public class PagoDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarPago(Pago pago){
        String sql = "INSERT INTO pagos (id_reserva, id_metodo_pago, monto) "
                + "VALUES (?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdReserva());
            ps.setInt(2, pago.getIdMetodoPago());
            ps.setInt(3, pago.getMonto());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
