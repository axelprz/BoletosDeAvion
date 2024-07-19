package models;

public class Pasajero extends Persona {
    private int idAsiento;
    private int idPasajero;
    private int idReserva;

    public Pasajero(){}
    
    public Pasajero(String nombre, String apellido, int tipoDocumento, String numeroDocumento, int nacionalidad, int idAsiento, String fechaNacimiento) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, nacionalidad, fechaNacimiento);
        this.idAsiento = idAsiento;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }
    
    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    
}
