package models;

import java.util.Date;
import java.util.List;

public class Reserva {
    private int idReserva;
    private Usuario usuario;
    private Vuelo vuelo;
    private int estado;
    private Date fechaReserva;
    private List<Pasajero> pasajeros;

    public Reserva(Usuario usuario, Vuelo vuelo, int estado, Date fechaReserva){
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
    }
    
    public Reserva(int idReserva, Usuario usuario, Vuelo vuelo, int estado, Date fechaReserva, List<Pasajero> pasajeros) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.pasajeros = pasajeros;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("idReserva=").append(idReserva);
        sb.append(", usuario=").append(usuario);
        sb.append(", vuelo=").append(vuelo);
        sb.append(", estado=").append(estado);
        sb.append(", fechaReserva=").append(fechaReserva);
        sb.append(", pasajeros=").append(pasajeros);
        sb.append('}');
        return sb.toString();
    }
    
}
