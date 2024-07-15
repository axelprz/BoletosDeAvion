package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Usuario;
import models.conexion.ImageUploader;
import models.dao.UsuarioDao;
import views.PanelIniciarSesion;
import views.PanelRegistro;

public class RegistroController implements ActionListener, MouseListener {

    private final PanelRegistro views;
    private Usuario us;
    private final UsuarioDao usDao;
    private String codigo;

    public RegistroController(PanelRegistro views, Usuario us, UsuarioDao usDao) {
        this.views = views;
        this.us = us;
        this.usDao = usDao;
        views.txtNombre.addMouseListener(this);
        views.txtApellido.addMouseListener(this);
        views.txtNombreUsuario.addMouseListener(this);
        views.txtEmail.addMouseListener(this);
        views.txtTelefono.addMouseListener(this);
        views.txtPassword.addMouseListener(this);
        views.txtCodigo.addMouseListener(this);
        views.btnRegistrarse.addActionListener(this);
        views.btnConfirmarCodigo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarse) {
            if (views.txtNombre.getText().equals("")
                    || views.txtNombre.getText().equals("Nombre")
                    || views.txtApellido.getText().equals("")
                    || views.txtApellido.getText().equals("Apellido")
                    || views.txtNombreUsuario.getText().equals("")
                    || views.txtNombreUsuario.getText().equals("Nombre de Usuario")
                    || views.txtEmail.getText().equals("")
                    || views.txtEmail.getText().equals("Email")
                    || String.valueOf(views.txtPassword.getPassword()).equals("")
                    || String.valueOf(views.txtPassword.getPassword()).equals("**********")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            } else {
                if (Validator.isValidEmail(views.txtEmail.getText())) {
                    if (Validator.isValidPassword(String.valueOf(views.txtPassword.getPassword()))) {
                        String nombre = Validator.validateAndFormatName(views.txtNombre.getText());
                        String apellido = Validator.validateAndFormatName(views.txtApellido.getText());
                        if (nombre != null) {
                            if (apellido != null) {
                                us = usDao.buscarUsuario(views.txtNombreUsuario.getText());
                                if (us.getNombreUsuario() == null) {
                                    if (Validator.isValidPhoneNumber(views.txtTelefono.getText())
                                            || views.txtTelefono.getText().equals("Telefono (opcional)")) {
                                        views.txtNombre.setEnabled(false);
                                        views.txtApellido.setEnabled(false);
                                        views.txtNombreUsuario.setEnabled(false);
                                        views.txtEmail.setEnabled(false);
                                        views.txtPassword.setEnabled(false);
                                        views.txtTelefono.setEnabled(false);
                                        views.btnRegistrarse.setVisible(false);
                                        views.txtCodigo.setVisible(true);
                                        views.btnConfirmarCodigo.setVisible(true);
                                        views.jSeparatorCodigo.setVisible(true);
                                        this.codigo = GeneradorCodigosEmail.enviarCorreo(views.txtEmail.getText(), true);
                                        JOptionPane.showMessageDialog(null, "Ingrese el código de verificación que le enviamos");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Introduce un telefono válido");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El nombre de usuario seleccionado ya existe, ingresa uno nuevo");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Introduce un apellido válido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Introduce un nombre válido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña debe contener: \n 8 caracteres como minimo \n 1 número \n 1 caracter especial");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Introduce un email válido");
                }
            }
        } else if (e.getSource() == views.btnConfirmarCodigo) {
            if (views.txtCodigo.getText() != null && views.txtCodigo.getText().equals(this.codigo)) {
                us.setNombre(views.txtNombre.getText());
                us.setApellido(views.txtApellido.getText());
                us.setNombreUsuario(views.txtNombreUsuario.getText());
                us.setEmail(views.txtEmail.getText());

                if (views.txtTelefono.getText().equals("")
                        || views.txtTelefono.getText().equals("Telefono (opcional)")) {
                    us.setTelefono("");
                } else {
                    us.setTelefono(views.txtTelefono.getText());
                }

                us.setContrasena(String.valueOf(views.txtPassword.getPassword()));
                
                ImageUploader.crearImagenPerfilPorDefecto(us);

                if (usDao.registrar(us)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                    PanelIniciarSesion login = new PanelIniciarSesion();
                    views.dispose();
                    login.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código Incorrecto");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.txtNombre) {
            Object[] components = PlaceHolder.placeHolderRegistroNombre(views.txtNombre, views.txtApellido,
                    views.txtNombreUsuario, views.txtEmail, views.txtTelefono,
                    views.txtPassword);
            views.txtNombre = (JTextField) components[0];
            views.txtApellido = (JTextField) components[1];
            views.txtNombreUsuario = (JTextField) components[2];
            views.txtEmail = (JTextField) components[3];
            views.txtTelefono = (JTextField) components[4];
            views.txtPassword = (JPasswordField) components[5];
        } else if (e.getSource() == views.txtApellido) {
            Object[] components = PlaceHolder.placeHolderRegistroApellido(views.txtApellido, views.txtNombre,
                    views.txtNombreUsuario, views.txtEmail, views.txtTelefono,
                    views.txtPassword);
            views.txtApellido = (JTextField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtNombreUsuario = (JTextField) components[2];
            views.txtEmail = (JTextField) components[3];
            views.txtTelefono = (JTextField) components[4];
            views.txtPassword = (JPasswordField) components[5];
        } else if (e.getSource() == views.txtNombreUsuario) {
            Object[] components = PlaceHolder.placeHolderRegistroNombreUsuario(views.txtNombreUsuario, views.txtNombre,
                    views.txtApellido, views.txtEmail, views.txtTelefono,
                    views.txtPassword);
            views.txtNombreUsuario = (JTextField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtApellido = (JTextField) components[2];
            views.txtEmail = (JTextField) components[3];
            views.txtTelefono = (JTextField) components[4];
            views.txtPassword = (JPasswordField) components[5];
        } else if (e.getSource() == views.txtEmail) {
            Object[] components = PlaceHolder.placeHolderRegistroEmail(views.txtEmail, views.txtNombre,
                    views.txtApellido, views.txtNombreUsuario, views.txtTelefono,
                    views.txtPassword);
            views.txtEmail = (JTextField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtApellido = (JTextField) components[2];
            views.txtNombreUsuario = (JTextField) components[3];
            views.txtTelefono = (JTextField) components[4];
            views.txtPassword = (JPasswordField) components[5];
        } else if (e.getSource() == views.txtTelefono) {
            Object[] components = PlaceHolder.placeHolderRegistroTelefono(views.txtTelefono, views.txtNombre,
                    views.txtApellido, views.txtNombreUsuario, views.txtEmail,
                    views.txtPassword);
            views.txtTelefono = (JTextField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtApellido = (JTextField) components[2];
            views.txtNombreUsuario = (JTextField) components[3];
            views.txtEmail = (JTextField) components[4];
            views.txtPassword = (JPasswordField) components[5];
        } else if (e.getSource() == views.txtPassword) {
            Object[] components = PlaceHolder.placeHolderRegistroPassword(views.txtPassword, views.txtNombre,
                    views.txtApellido, views.txtNombreUsuario, views.txtEmail,
                    views.txtTelefono);
            views.txtPassword = (JPasswordField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtApellido = (JTextField) components[2];
            views.txtNombreUsuario = (JTextField) components[3];
            views.txtEmail = (JTextField) components[4];
            views.txtTelefono = (JTextField) components[5];
        } else if (e.getSource() == views.txtCodigo) {
            Object[] components = PlaceHolder.placeHolderRegistroCodigo(views.txtCodigo);
            views.txtCodigo = (JTextField) components[0];
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
