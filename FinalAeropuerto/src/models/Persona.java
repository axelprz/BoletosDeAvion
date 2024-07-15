
package models;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private int nacionalidad;
    private Date fechaNacimiento;
    private int tipoDocumento;
    private String numeroDocumento;

    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido, int tipoDocumento, String numeroDocumento, int nacionalidad, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", telefono=").append(telefono);
        sb.append(", nacionalidad=").append(nacionalidad);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", tipoDocumento=").append(tipoDocumento);
        sb.append(", numeroDocumento=").append(numeroDocumento);
        sb.append('}');
        return sb.toString();
    }
    
}
