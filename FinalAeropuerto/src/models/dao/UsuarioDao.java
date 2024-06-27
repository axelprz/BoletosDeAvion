
package models.dao;

import java.sql.*;
import javax.swing.JOptionPane;
import models.Usuario;
import models.conexion.Conexion;

public class UsuarioDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(Usuario us){
        String sql = "INSERT INTO usuarios (nombre, apellido, nombre_usuario, email, contrasena, telefono) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getApellido());
            ps.setString(3, us.getNombreUsuario());
            ps.setString(4, us.getEmail());
            ps.setString(5, us.getContrasena());
            ps.setString(6, us.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public Usuario iniciarSesion(String nombreUsuario, String contrasena){
        String sql = "SELECT * FROM usuarios WHERE (nombre_usuario = ? OR email = ?) AND contrasena = ?";
        Usuario us = new Usuario();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, nombreUsuario);
            ps.setString(3, contrasena);
            rs = ps.executeQuery();
            
            if(rs.next()){
                us.setIdUsuario(rs.getInt("id_usuario"));
                us.setNombre(rs.getString("nombre"));
                us.setApellido(rs.getString("apellido"));
                us.setNombreUsuario(rs.getString("nombre_usuario"));
                us.setEmail(rs.getString("email"));
                us.setContrasena(rs.getString("contrasena"));
                us.setTelefono(rs.getString("telefono"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
    public Usuario buscarUsuario(String nombreUsuario){
        String sql = "SELECT * FROM usuarios WHERE (nombre_usuario = ? OR email = ?)";
        Usuario us = new Usuario();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, nombreUsuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                us.setIdUsuario(rs.getInt("id_usuario"));
                us.setNombre(rs.getString("nombre"));
                us.setApellido(rs.getString("apellido"));
                us.setNombreUsuario(rs.getString("nombre_usuario"));
                us.setEmail(rs.getString("email"));
                us.setContrasena(rs.getString("contrasena"));
                us.setTelefono(rs.getString("telefono"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
    public boolean cambiarContrasena(Usuario us){
        String sql = "UPDATE usuarios SET contrasena = ? WHERE id_usuario = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getContrasena());
            ps.setInt(2, us.getIdUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
