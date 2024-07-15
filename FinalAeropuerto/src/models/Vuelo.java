package models;

public class Vuelo {
    private int idVuelo;
    private String numeroVuelo;
    private String origen;
    private String destino;
    private byte[] imagenDestino;
    private int duracion;
    private int precio; 
    private String dia;
    private int hora;

    public Vuelo(){
        
    }
    
    public Vuelo(int idVuelo, String numeroVuelo, String origen, String destino, int duracion, int precio, String dia, int hora, byte[] imagenDestino) {
        this.idVuelo = idVuelo;
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.precio = precio;
        this.dia = dia;
        this.hora = hora;
        this.imagenDestino = imagenDestino;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public byte[] getImagenDestino() {
        return imagenDestino;
    }

    public void setImagenDestino(byte[] imagenDestino) {
        this.imagenDestino = imagenDestino;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("idVuelo=").append(idVuelo);
        sb.append(", numeroVuelo=").append(numeroVuelo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", imagenDestino=").append(imagenDestino);
        sb.append(", duracion=").append(duracion);
        sb.append(", precio=").append(precio);
        sb.append(", dia=").append(dia);
        sb.append(", hora=").append(hora);
        sb.append('}');
        return sb.toString();
    }
}
