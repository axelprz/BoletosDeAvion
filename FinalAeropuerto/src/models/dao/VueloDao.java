package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Vuelo;
import models.conexion.Conexion;

public class VueloDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List<Vuelo> obtenerVuelosDelDia(String dia) {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT v.id_vuelo, v.numero_vuelo, o.nombre, d.lugar, v.duracion, v.precio, h.hora, ds.dia "
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
                        rs.getInt("hora")
                );
                vuelos.add(vuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vuelos;
    }
}
