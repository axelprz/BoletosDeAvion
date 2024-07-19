package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Reserva;
import models.Vuelo;
import models.conexion.Conexion;

public class VueloDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Vuelo> obtenerVuelosDelDia(String dia) {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT v.id_vuelo, v.numero_vuelo, o.nombre, d.lugar, d.imagen, v.duracion, v.precio, h.hora, ds.dia "
                + "FROM vuelos v "
                + "JOIN origen_vuelos o ON v.id_origen = o.id_origen "
                + "JOIN destino_vuelos d ON v.id_destino = d.id_destino "
                + "JOIN horario_vuelos h ON v.id_horario = h.id_horario "
                + "JOIN dias ds ON h.id_dia = ds.id_dia "
                + "WHERE v.id_origen = 2 AND ds.dia = ?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, dia);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vuelo vuelo = new Vuelo(
                        rs.getInt("id_vuelo"),
                        rs.getString("numero_vuelo"),
                        rs.getString("nombre"),
                        rs.getString("lugar"),
                        rs.getInt("duracion"),
                        rs.getInt("precio"),
                        rs.getString("dia"),
                        rs.getInt("hora"),
                        rs.getBytes("imagen")
                );
                vuelos.add(vuelo);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return vuelos;
    }

    public List<Vuelo> obtenerTodosLosVuelos() {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT "
                + "v.id_vuelo, "
                + "v.numero_vuelo, "
                + "o.nombre AS origen, "
                + "d.lugar AS destino, "
                + "d.imagen, "
                + "v.duracion, "
                + "v.precio, "
                + "h.hora, "
                + "ds.dia "
                + "FROM "
                + "vuelos v "
                + "JOIN origen_vuelos o ON v.id_origen = o.id_origen "
                + "JOIN destino_vuelos d ON v.id_destino = d.id_destino "
                + "JOIN horario_vuelos h ON v.id_horario = h.id_horario "
                + "JOIN dias ds ON h.id_dia = ds.id_dia "
                + "WHERE v.id_vuelo BETWEEN 99 AND 148";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vuelo vuelo = new Vuelo(
                        rs.getInt("id_vuelo"),
                        rs.getString("numero_vuelo"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getInt("duracion"),
                        rs.getInt("precio"),
                        rs.getString("dia"),
                        rs.getInt("hora"),
                        rs.getBytes("imagen")
                );
                vuelos.add(vuelo);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return vuelos;
    }

    public List<Vuelo> obtenerVuelosPorNombreONacionalidad(int idProvincia, String destino) {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT v.id_vuelo, v.numero_vuelo, o.nombre AS origen, d.lugar AS destino, d.imagen, "
                + "v.duracion, v.precio, h.hora, ds.dia "
                + "FROM vuelos v "
                + "JOIN origen_vuelos o ON v.id_origen = o.id_origen "
                + "JOIN destino_vuelos d ON v.id_destino = d.id_destino "
                + "JOIN horario_vuelos h ON v.id_horario = h.id_horario "
                + "JOIN dias ds ON h.id_dia = ds.id_dia "
                + "WHERE v.id_origen = ? "
                + "AND (d.lugar = ? OR EXISTS (SELECT 1 FROM nacionalidades n WHERE d.id_pais = n.id_nacionalidad AND n.nombre = ?))";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProvincia);
            ps.setString(2, destino);
            ps.setString(3, destino);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vuelo vuelo = new Vuelo(
                        rs.getInt("id_vuelo"),
                        rs.getString("numero_vuelo"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getInt("duracion"),
                        rs.getInt("precio"),
                        rs.getString("dia"),
                        rs.getInt("hora"),
                        rs.getBytes("imagen")
                );
                vuelos.add(vuelo);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return vuelos;
    }
    
    public Vuelo buscarVueloPorNacionalidadYDia(int idProvincia, String destino, String dia) {
        String sql = "SELECT v.id_vuelo, v.numero_vuelo, o.nombre AS origen, d.lugar AS destino, d.imagen, "
                   + "v.duracion, v.precio, h.hora, ds.dia "
                   + "FROM vuelos v "
                   + "JOIN origen_vuelos o ON v.id_origen = o.id_origen "
                   + "JOIN destino_vuelos d ON v.id_destino = d.id_destino "
                   + "JOIN horario_vuelos h ON v.id_horario = h.id_horario "
                   + "JOIN dias ds ON h.id_dia = ds.id_dia "
                   + "WHERE v.id_origen = ? "
                   + "AND (d.lugar = ? OR EXISTS (SELECT 1 FROM nacionalidades n WHERE d.id_pais = n.id_nacionalidad AND n.nombre = ?)) "
                   + "AND ds.dia = ?";
        Vuelo vuelo = new Vuelo();

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProvincia);
            ps.setString(2, destino);
            ps.setString(3, destino);
            ps.setString(4, dia);
            rs = ps.executeQuery();

            if (rs.next()) {
                vuelo.setNumeroVuelo(rs.getString("numero_vuelo"));
                vuelo.setIdVuelo(rs.getInt("id_vuelo"));
                vuelo.setNumeroVuelo(rs.getString("numero_vuelo"));
                vuelo.setOrigen(rs.getString("origen"));
                vuelo.setDestino(rs.getString("destino"));
                vuelo.setDuracion(rs.getInt("duracion"));
                vuelo.setPrecio(rs.getInt("precio"));
                vuelo.setDia(rs.getString("dia"));
                vuelo.setHora(rs.getInt("hora"));
                vuelo.setImagenDestino(rs.getBytes("imagen"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return vuelo;
    }

    public Vuelo buscarVueloPorReserva(Reserva reserva) {
        String sql = "SELECT v.id_vuelo, v.numero_vuelo, o.nombre AS origen, d.lugar AS destino, d.imagen, "
                + "v.duracion, v.precio, h.hora, ds.dia "
                + "FROM vuelos v "
                + "JOIN origen_vuelos o ON v.id_origen = o.id_origen "
                + "JOIN destino_vuelos d ON v.id_destino = d.id_destino "
                + "JOIN horario_vuelos h ON v.id_horario = h.id_horario "
                + "JOIN dias ds ON h.id_dia = ds.id_dia "
                + "WHERE v.id_vuelo = ? ";
        Vuelo vuelo = new Vuelo();

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdVuelo());
            rs = ps.executeQuery();

            if (rs.next()) {
                vuelo.setNumeroVuelo(rs.getString("numero_vuelo"));
                vuelo.setIdVuelo(rs.getInt("id_vuelo"));
                vuelo.setNumeroVuelo(rs.getString("numero_vuelo"));
                vuelo.setOrigen(rs.getString("origen"));
                vuelo.setDestino(rs.getString("destino"));
                vuelo.setDuracion(rs.getInt("duracion"));
                vuelo.setPrecio(rs.getInt("precio"));
                vuelo.setDia(rs.getString("dia"));
                vuelo.setHora(rs.getInt("hora"));
                vuelo.setImagenDestino(rs.getBytes("imagen"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return vuelo;
    }
}
