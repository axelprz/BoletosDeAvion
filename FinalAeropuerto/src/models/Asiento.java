
package models;

public class Asiento {
    private int idAsiento;
    private String codigo;
    private String clase;
    private int precio;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int idAsiento, String codigo, String clase, int precio, boolean ocupado) {
        this.idAsiento = idAsiento;
        this.codigo = codigo;
        this.clase = clase;
        this.precio = precio;
        this.ocupado = ocupado;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asiento{");
        sb.append("idAsiento=").append(idAsiento);
        sb.append(", codigo=").append(codigo);
        sb.append(", clase=").append(clase);
        sb.append(", precio=").append(precio);
        sb.append(", ocupado=").append(ocupado);
        sb.append('}');
        return sb.toString();
    }
    
}
