package models;

import java.util.Date;

public class Pasajero extends Persona {
    private String codigoAsiento;

    public Pasajero(String nombre, String apellido, int tipoDocumento, String numeroDocumento, int nacionalidad, String codigoAsiento, Date fechaNacimiento) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, nacionalidad, fechaNacimiento);
        this.codigoAsiento = codigoAsiento;
    }
    
    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAciento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }
    
}
