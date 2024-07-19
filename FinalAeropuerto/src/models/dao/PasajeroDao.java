
package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Pasajero;
import models.Reserva;
import models.Usuario;
import models.conexion.Conexion;

public class PasajeroDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarPasajero(Pasajero pasajero){
        String sql = "INSERT INTO pasajeros (nombre, apellido, id_tipo_documento, numero_documento, id_nacionalidad, id_asiento, fecha_nacimiento, id_reserva)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getTipoDocumento());
            ps.setString(4, pasajero.getNumeroDocumento());
            ps.setInt(5, pasajero.getNacionalidad());
            ps.setInt(6, pasajero.getIdAsiento());
            ps.setString(7, pasajero.getFechaNacimiento());
            ps.setInt(8, pasajero.getIdReserva());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public Pasajero buscarPasajero(Pasajero pasajero){
        String sql = "SELECT * FROM pasajeros WHERE (numero_documento = ?)";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNumeroDocumento());
            rs = ps.executeQuery();
            
            if(rs.next()){
                pasajero.setIdPasajero(rs.getInt("id_pasajero"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pasajero;
    }
    
    public List<Pasajero> buscarPasajerosPorReserva(Reserva reserva){
        String sql = "SELECT * FROM pasajeros WHERE id_reserva = ?";
        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdReserva());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Pasajero pasajero = new Pasajero(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("id_tipo_documento"),
                        rs.getString("numero_documento"),
                        rs.getInt("id_nacionalidad"),
                        rs.getInt("id_asiento"),
                        rs.getString("fecha_nacimiento")
                );
                pasajeros.add(pasajero);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pasajeros;
    }
}
