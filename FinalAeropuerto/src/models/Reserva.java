package models;

import java.util.List;

public class Reserva {
    private Usuario usuario;
    private Vuelo vuelo;
    private List<Pasajero> pasajeros;
    private String estado;

    public Reserva(Usuario usuario, Vuelo vuelo, List<Pasajero> pasajeros, String estado) {
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.pasajeros = pasajeros;
        this.estado = estado;
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

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
