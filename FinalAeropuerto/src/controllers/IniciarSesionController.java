
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
import views.PanelIniciarSesion;
import views.PanelInicio;
import views.PanelNewPassword;

public class IniciarSesionController implements ActionListener, MouseListener {
    private final PanelIniciarSesion views;
    private Usuario us;
    private final UsuarioDao usDao;

    public IniciarSesionController(PanelIniciarSesion views, Usuario us, UsuarioDao usDao) {
        this.views = views;
        this.us = us;
        this.usDao = usDao;
        views.txtEmail.addMouseListener(this);
        views.txtPass.addMouseListener(this);
        views.btnCambiarPass.addActionListener(this);
        views.btnIniciarSesion.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnCambiarPass){
            PanelNewPassword cambiarPass = new PanelNewPassword();
            cambiarPass.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnIniciarSesion){
            if (views.txtEmail.getText().equals("") || String.valueOf(views.txtPass.getPassword()).equals("") ||
                    views.txtEmail.getText().equals("Nombre de Usuario o Email...") || String.valueOf(views.txtPass.getPassword()).equals("**********")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            } else {
                String email = views.txtEmail.getText();
                String password = String.valueOf(views.txtPass.getPassword());
                us = usDao.iniciarSesion(email, password);
                if (us.getEmail() != null) {
                    PanelInicio inicio = new PanelInicio();
                    inicio.setVisible(true);
                    this.views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrecta");
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.txtEmail){
            Object[] components = Funciones.placeHolderEmail(views.txtEmail, views.txtPass);
            views.txtEmail = (JTextField) components[0];
            views.txtPass = (JPasswordField) components[1];
        }
        else if(e.getSource() == views.txtPass){
            Object[] components = Funciones.placeHolderPassword(views.txtPass, views.txtEmail);
            views.txtPass = (JPasswordField) components[0];
            views.txtEmail = (JTextField) components[1];
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
