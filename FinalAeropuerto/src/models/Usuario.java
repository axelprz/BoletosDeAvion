package models;

public class Usuario extends Persona {
    private int idUsuario; 
    private String nombreUsuario;
    private String email;
    private String contrasena;
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("id_usuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", email=").append(email);
        sb.append(", contrasena=").append(contrasena);
        sb.append('}');
        return sb.toString();
    }
    
}