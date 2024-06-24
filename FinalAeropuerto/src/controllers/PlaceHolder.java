
package controllers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PlaceHolder {
    public static Object[] placeHolderEmail(JTextField txtEmail, JPasswordField txtPassword) {
        if (txtEmail.getText().equals("Nombre de Usuario o Email...")) {
            txtEmail.setText("");
            txtEmail.setForeground(new Color(250, 250, 250));
        }
        if (String.valueOf(txtPassword.getPassword()).equals("")) {
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153, 153, 153));
        }
        return new Object[] { txtEmail, txtPassword };
    }

    public static Object[] placeHolderPassword(JPasswordField txtPassword, JTextField txtEmail) {
        if (String.valueOf(txtPassword.getPassword()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(new Color(250, 250, 250));
        }
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Nombre de Usuario o Email...");
            txtEmail.setForeground(new Color(153, 153, 153));
        }
        return new Object[] { txtPassword, txtEmail };
    }
    
    public static Object[] placeHolderPassword2(JPasswordField txtPassword, JPasswordField txtPasswordConfirmada) {
        if (String.valueOf(txtPassword.getPassword()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(new Color(250, 250, 250));
        }
        if (String.valueOf(txtPasswordConfirmada.getPassword()).equals("")) {
            txtPasswordConfirmada.setText("**********");
            txtPasswordConfirmada.setForeground(new Color(153, 153, 153));
        }
        return new Object[] { txtPassword, txtPasswordConfirmada };
    }
    
    public static Object[] placeHolderRegistroNombre(JTextField txtNombre, JTextField txtApellido, JTextField txtNombreUsuario, 
            JTextField txtEmail, JTextField txtTelefono, JPasswordField txtPassword){
        if(txtNombre.getText().equals("Nombre")){
            txtNombre.setText("");
            txtNombre.setForeground(new Color(250,250,250));
        }
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(153,153,153));
        }
        if(txtNombreUsuario.getText().equals("")){
            txtNombreUsuario.setText("Nombre de Usuario");
            txtNombreUsuario.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().equals("")){
            txtEmail.setText("Email");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Telefono (opcional)");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).equals("")){
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtNombre, txtApellido, txtNombreUsuario, txtEmail, txtTelefono, txtPassword };
    }
    
    public static Object[] placeHolderRegistroApellido(JTextField txtApellido, JTextField txtNombre, JTextField txtNombreUsuario, 
            JTextField txtEmail, JTextField txtTelefono, JPasswordField txtPassword){
        if(txtApellido.getText().equals("Apellido")){
            txtApellido.setText("");
            txtApellido.setForeground(new Color(250,250,250));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtNombreUsuario.getText().equals("")){
            txtNombreUsuario.setText("Nombre de Usuario");
            txtNombreUsuario.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().equals("")){
            txtEmail.setText("Email");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Telefono (opcional)");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).equals("")){
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtApellido, txtNombre, txtNombreUsuario, txtEmail, txtTelefono, txtPassword };
    }
    
    public static Object[] placeHolderRegistroNombreUsuario(JTextField txtNombreUsuario, JTextField txtNombre, JTextField txtApellido, 
            JTextField txtEmail, JTextField txtTelefono, JPasswordField txtPassword){
        if(txtNombreUsuario.getText().equals("Nombre de Usuario")){
            txtNombreUsuario.setText("");
            txtNombreUsuario.setForeground(new Color(250,250,250));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().equals("")){
            txtEmail.setText("Email");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Telefono (opcional)");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).equals("")){
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtNombreUsuario, txtNombre, txtApellido, txtEmail, txtTelefono, txtPassword };
    }
    
    public static Object[] placeHolderRegistroEmail(JTextField txtEmail, JTextField txtNombre, JTextField txtApellido, 
            JTextField txtNombreUsuario, JTextField txtTelefono, JPasswordField txtPassword){
        if(txtEmail.getText().equals("Email")){
            txtEmail.setText("");
            txtEmail.setForeground(new Color(250,250,250));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(153,153,153));
        }
        if(txtNombreUsuario.getText().equals("")){
            txtNombreUsuario.setText("Nombre de Usuario");
            txtNombreUsuario.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Telefono (opcional)");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).equals("")){
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtEmail, txtNombre, txtApellido, txtNombreUsuario, txtTelefono, txtPassword };
    }
    
    public static Object[] placeHolderRegistroTelefono(JTextField txtTelefono, JTextField txtNombre, JTextField txtApellido, 
            JTextField txtNombreUsuario, JTextField txtEmail, JPasswordField txtPassword){
        if(txtTelefono.getText().equals("Telefono (opcional)")){
            txtTelefono.setText("");
            txtTelefono.setForeground(new Color(250,250,250));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(153,153,153));
        }
        if(txtNombreUsuario.getText().equals("")){
            txtNombreUsuario.setText("Nombre de Usuario");
            txtNombreUsuario.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().equals("")){
            txtEmail.setText("Email");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(String.valueOf(txtPassword.getPassword()).equals("")){
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtTelefono, txtNombre, txtApellido, txtNombreUsuario, txtEmail, txtPassword };
    }
    
    public static Object[] placeHolderRegistroPassword(JPasswordField txtPassword, JTextField txtNombre, JTextField txtApellido, 
            JTextField txtNombreUsuario, JTextField txtEmail, JTextField txtTelefono){
        if(String.valueOf(txtPassword.getPassword()).equals("**********")){
            txtPassword.setText("");
            txtPassword.setForeground(new Color(250,250,250));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(153,153,153));
        }
        if(txtNombreUsuario.getText().equals("")){
            txtNombreUsuario.setText("Nombre de Usuario");
            txtNombreUsuario.setForeground(new Color(153,153,153));
        }
        if(txtEmail.getText().equals("")){
            txtEmail.setText("Email");
            txtEmail.setForeground(new Color(153,153,153));
        }
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Telefono (opcional)");
            txtTelefono.setForeground(new Color(153,153,153));
        }
        return new Object[] { txtPassword, txtNombre, txtApellido, txtNombreUsuario, txtEmail, txtTelefono };
    }
    
    public static Object[] placeHolderRegistroCodigo(JTextField txtCodigo) {
        if (txtCodigo.getText().equals("Código de verificación")) {
            txtCodigo.setText("");
            txtCodigo.setForeground(new Color(250, 250, 250));
        }
        return new Object[] {txtCodigo};
    }
}
