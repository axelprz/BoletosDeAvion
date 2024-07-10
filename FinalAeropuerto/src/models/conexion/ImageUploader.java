package models.conexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageUploader {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection connection = null;
        PreparedStatement statement = null;
        FileInputStream inputStream = null;
        String[] imagenes = {"Paris.png", "NuevaYork.png", "Roma.png", "Tokio.png", "Londres.png", "Sidney.png", "RioDeJaneiro.png", "Bangkok.png", 
            "Barcelona.png", "Pekin.png", "LosAngeles.png", "Estambul.png", "Kioto.png", "Atenas.png", "MachuPicchu.png", "ElCairo.png", 
            "Berlin.png", "Amsterdam.png", "HongKong.png", "Venecia.png", "SanFrancisco.png", "Lisboa.png", "Toronto.png", "Moscu.png", "Santiago.png", 
            "Praga.png", "Dubrovnik.png", "BuenosAires.png", "CiudadDeMexico.png", "Seul.png", "SaoPaulo.png", "Helsinki.png", "Viena.png", "Varsovia.png",
            "Mumbai.png", "Jerusalen.png", "Lima.png", "SanPetersburgo.png", "Cartagena.png", "Cusco.png", "Dubai.png", "Vancouver.png", "Marrakech.png", 
            "Reykjavik.png", "Hanoi.png", "Melbourne.png", "CapeTown.png", "Auckland.png", "Nairobi.png", "Mendoza.png"};

        for (int i = 0; i < 50; i++) {
            try {
                connection = conexion.getConexion();

                if (connection != null) {
                    String sql = "UPDATE destino_vuelos SET imagen = ? WHERE id_destino = ?";
                    statement = connection.prepareStatement(sql);

                    // Ruta a la imagen
                    String filePath = "C:/BoletosDeAvion/FinalAeropuerto/src/img/lugares/" + imagenes[i];
                    File image = new File(filePath);
                    inputStream = new FileInputStream(image);

                    statement.setBlob(1, inputStream);
                    statement.setInt(2, i+1);

                    int row = statement.executeUpdate();
                    if (row > 0) {
                        System.out.println("Imagen cargada correctamente.");
                    } else {
                        System.out.println("No se actualizó ninguna fila.");
                    }
                } else {
                    System.out.println("Conexión a la base de datos fallida.");
                }
            } catch (FileNotFoundException | SQLException e) {
            } finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (IOException | SQLException e) {
                }
            }
        }
    }
}
