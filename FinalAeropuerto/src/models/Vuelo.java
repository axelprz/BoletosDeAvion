package models;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Vuelo {
    private int idVuelo;
    private String numeroVuelo;
    private String origen;
    private String destino;
    private int duracion; //en minutos
    private BigDecimal precio; 
    private String dia;
    private LocalTime hora;

    public Vuelo(int idVuelo, String numeroVuelo, String origen, String destino, int duracion, BigDecimal precio, String dia, LocalTime hora) {
        this.idVuelo = idVuelo;
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.precio = precio;
        this.dia = dia;
        this.hora = hora;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("idVuelo=").append(idVuelo);
        sb.append(", numeroVuelo=").append(numeroVuelo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", duracion=").append(duracion);
        sb.append(", precio=").append(precio);
        sb.append(", dia=").append(dia);
        sb.append(", hora=").append(hora);
        sb.append('}');
        return sb.toString();
    }
    
}
