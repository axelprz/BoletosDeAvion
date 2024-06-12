package models;

import java.util.Date;

public class Pasajero extends Persona {

    public Pasajero(String nombre, String apellido, String telefono, String nacionalidad, Date fechaNacimiento, 
            String tipoDocumento, String numeroDocumento) {
        super(nombre, apellido, telefono, nacionalidad, fechaNacimiento, tipoDocumento, numeroDocumento);
    }
}
