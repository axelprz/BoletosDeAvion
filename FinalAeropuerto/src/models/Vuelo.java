package models;

public class Vuelo {
    private String origen;
    private String destino;
    private String horario;
    private String aerolinea;
    private double precio;

    public Vuelo(String origen, String destino, String horario, String aerolinea, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        this.aerolinea = aerolinea;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
