package models;

public class Pago {
    private double monto;
    private String metodoPago;
    private String estado;

    public Pago(double monto, String metodoPago, String estado) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
