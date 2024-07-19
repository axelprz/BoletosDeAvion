package models;

public class Pago {
    private int idPago;
    private int idReserva;
    private int idMetodoPago;
    private int monto;

    public Pago() {
    }

    public Pago(int idPago, int idReserva, int idMetodoPago, int monto) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.idMetodoPago = idMetodoPago;
        this.monto = monto;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pago{");
        sb.append("idPago=").append(idPago);
        sb.append(", idReserva=").append(idReserva);
        sb.append(", idMetodoPago=").append(idMetodoPago);
        sb.append(", monto=").append(monto);
        sb.append('}');
        return sb.toString();
    }
    
}
