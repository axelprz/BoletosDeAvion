
package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Reserva;
import models.Usuario;
import models.conexion.Conexion;

public class ReservaDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarReserva(Reserva reserva){
        String sql = "INSERT INTO reservas (id_usuario, id_vuelo, fecha_reserva, total_pagar)"
                + "VALUES (?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getUsuario().getIdUsuario());
            ps.setInt(2, reserva.getVuelo().getIdVuelo());
            ps.setString(3, reserva.getFechaReserva());
            ps.setInt(4, reserva.getTotalPagar());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public Reserva buscarReserva(Usuario us){
        String sql = "SELECT * FROM reservas WHERE id_usuario = ? AND id_estado = 1";
        Reserva reserva = new Reserva();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getIdUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setIdVuelo(rs.getInt("id_vuelo"));
                reserva.setTotalPagar(rs.getInt("total_pagar"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return reserva;
    }
    
    public List<Reserva> buscarReservaCompletada(Usuario us){
        String sql = "SELECT * FROM reservas WHERE id_usuario = ? AND id_estado = 2";
        List<Reserva> reservas = new ArrayList<>();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getIdUsuario());
            rs = ps.executeQuery();
            
            while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setIdVuelo(rs.getInt("id_vuelo"));
                reserva.setTotalPagar(rs.getInt("total_pagar"));
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return reservas;
    }
    
    public List<Reserva> buscarReservaCancelada(Usuario us){
        String sql = "SELECT * FROM reservas WHERE id_usuario = ? AND id_estado = 3";
        List<Reserva> reservas = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getIdUsuario());
            rs = ps.executeQuery();
            
            while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setIdVuelo(rs.getInt("id_vuelo"));
                reserva.setTotalPagar(rs.getInt("total_pagar"));
                
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return reservas;
    }
    
    public boolean cancelarReserva(Reserva reserva){
        String sql = "UPDATE reservas SET id_estado = 3 WHERE id_reserva = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdReserva());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
        return true;
    }
    
    public boolean completarReserva(Reserva reserva){
        String sql = "UPDATE reservas SET id_estado = 2 WHERE id_reserva = ?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdReserva());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
        return true;
    }
}
