package models;

import java.time.LocalDateTime;
import java.util.List;

public class Reserva {
    private int idReserva;
    private int idUsuario;
    private int idVuelo;
    private String estado;
    private LocalDateTime fechaReserva;
    private List<Integer> idPasajeros;

    public Reserva(int idReserva, int idUsuario, int idVuelo, String estado, LocalDateTime fechaReserva, List<Integer> idPasajeros) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.idVuelo = idVuelo;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.idPasajeros = idPasajeros;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public List<Integer> getIdPasajeros() {
        return idPasajeros;
    }

    public void setIdPasajeros(List<Integer> idPasajeros) {
        this.idPasajeros = idPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("idReserva=").append(idReserva);
        sb.append(", idUsuario=").append(idUsuario);
        sb.append(", idVuelo=").append(idVuelo);
        sb.append(", estado=").append(estado);
        sb.append(", fechaReserva=").append(fechaReserva);
        sb.append(", idPasajeros=").append(idPasajeros);
        sb.append('}');
        return sb.toString();
    }
    
}
