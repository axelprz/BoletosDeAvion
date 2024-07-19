package models;

import java.util.List;

public class Reserva {
    private int idReserva;
    private Usuario usuario;
    private Vuelo vuelo;
    private String estado;
    private String fechaReserva;
    private List<Pasajero> pasajeros;
    private int totalPagar;
    private int idVuelo;

    public Reserva(){}
    
    public Reserva(Usuario usuario, Vuelo vuelo, String estado, String fechaReserva, List<Pasajero> pasajeros, int totalPagar) {
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.pasajeros = pasajeros;
        this.totalPagar = totalPagar;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
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
        sb.append(", totalPagar=").append(totalPagar);
        sb.append('}');
        return sb.toString();
    }
    
}
