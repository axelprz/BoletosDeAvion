package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Usuario;
import models.dao.UsuarioDao;
import views.PanelNewPassword;

public class NewPasswordController implements ActionListener, MouseListener {

    private final PanelNewPassword views;
    private Usuario us;
    private final UsuarioDao usDao;
    private String codigo;

    public NewPasswordController(PanelNewPassword views, Usuario us, UsuarioDao usDao) {
        this.views = views;
        this.us = us;
        this.usDao = usDao;
        views.txtEmail.addMouseListener(this);
        views.txtPassword.addMouseListener(this);
        views.txtCodigoVerificacion.addMouseListener(this);
        views.txtPasswordConfirmada.addMouseListener(this);
        views.btnConfirmarEmail.addActionListener(this);
        views.btnConfirmarPassword.addActionListener(this);
        views.btnConfirmarCodigo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnConfirmarEmail) {
            if (views.txtEmail.getText().equals("")
                    || views.txtEmail.getText().equals("Nombre de Usuario o Email...")) {
                JOptionPane.showMessageDialog(null, "Ingrese su correo");
            } else {
                String email = views.txtEmail.getText();
                us = usDao.buscarUsuario(email);
                if (us.getEmail() != null) {
                    this.codigo = GeneradorCodigosEmail.enviarCorreo(us.getEmail(), false);
                    if (this.codigo != null) {
                        JOptionPane.showMessageDialog(null, "Ingrese el código de verificación que le enviamos");
                        views.txtEmail.setEnabled(false);
                        views.txtCodigoVerificacion.setVisible(true);
                        views.btnConfirmarEmail.setVisible(false);
                        views.btnConfirmarCodigo.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "No pudimos encontrar su usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el correo o usuario ingresado");
                }
            }
        } else if (e.getSource() == views.btnConfirmarCodigo) {
            if (views.txtCodigoVerificacion.getText() != null && views.txtCodigoVerificacion.getText().equals(codigo)) {
                views.txtEmail.setVisible(false);
                views.txtCodigoVerificacion.setVisible(false);
                views.txtPassword.setVisible(true);
                views.txtPasswordConfirmada.setVisible(true);
                views.btnConfirmarCodigo.setVisible(false);
                views.btnConfirmarPassword.setVisible(true);
                JOptionPane.showMessageDialog(null, "Correo verificado, ahora cambie su contraseña");
            } else {
                JOptionPane.showMessageDialog(null, "Código Incorrecto");
            }
        } else if (e.getSource() == views.btnConfirmarPassword) {
            if (!(String.valueOf(views.txtPassword.getPassword()).equals("**********"))
                    && !(String.valueOf(views.txtPassword.getPassword()).equals(""))) {
                if (Validator.isValidPassword(String.valueOf(views.txtPassword.getPassword()))) {
                    if (String.valueOf(views.txtPassword.getPassword()).equals(String.valueOf(views.txtPasswordConfirmada.getPassword()))) {
                        us.setContrasena(String.valueOf(views.txtPassword.getPassword()));
                        if (usDao.cambiarContrasena(us)) {
                            JOptionPane.showMessageDialog(null, "Contraseña modificada");
                            views.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo modificar la contraseña");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseñas distintas");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña debe contener: \n 8 caracteres como minimo \n 1 número \n 1 caracter especial");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la nueva contraseña");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.txtEmail) {
            Object[] components = PlaceHolder.placeHolderEmail(views.txtEmail, views.txtPassword);
            views.txtEmail = (JTextField) components[0];
            views.txtPassword = (JPasswordField) components[1];
        } else if (e.getSource() == views.txtPassword) {
            Object[] components = PlaceHolder.placeHolderPassword2(views.txtPassword, views.txtPasswordConfirmada);
            views.txtPassword = (JPasswordField) components[0];
            views.txtPasswordConfirmada = (JPasswordField) components[1];
        } else if (e.getSource() == views.txtPasswordConfirmada) {
            Object[] components = PlaceHolder.placeHolderPassword2(views.txtPasswordConfirmada, views.txtPassword);
            views.txtPasswordConfirmada = (JPasswordField) components[0];
            views.txtPassword = (JPasswordField) components[1];
        } else if (e.getSource() == views.txtCodigoVerificacion) {
            Object[] components = PlaceHolder.placeHolderRegistroCodigo(views.txtCodigoVerificacion);
            views.txtCodigoVerificacion = (JTextField) components[0];
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
