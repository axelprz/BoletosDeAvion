
package controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.Usuario;
import models.conexion.ImageUploader;
import models.dao.UsuarioDao;
import views.PanelPerfil;

public class PerfilController implements ActionListener, MouseListener {
    private final PanelPerfil views;
    private Usuario us;
    private final UsuarioDao usDao;
    private String codigo;

    public PerfilController(PanelPerfil views, Usuario us, UsuarioDao usDao) {
        this.views = views;
        this.us = us;
        this.usDao = usDao;
        views.txtCodigo.addMouseListener(this);
        views.txtPassword.addMouseListener(this);
        views.txtPasswordConfirmada.addMouseListener(this);
        views.txtTelefono.addMouseListener(this);
        views.btnCambiarPassword.addActionListener(this);
        views.btnCambiarTelefono.addActionListener(this);
        views.btnConfirmarCodigo.addActionListener(this);
        views.btnConfirmarPassword.addActionListener(this);
        views.btnConfirmarTelefono.addActionListener(this);
        views.btnSonido.addActionListener(this);
        views.btnMenu.addActionListener(this);
        views.btnVuelos.addActionListener(this);
        views.btnPagos.addActionListener(this);
        views.btnReservas.addActionListener(this);
        views.btnSeleccionarImagen.addActionListener(this);
        views.btnCerrar.addActionListener(this);
        mostrarDatosUsuario();
        cargarImagenPerfil();
    }
    
    private void mostrarDatosUsuario(){
        views.lblNombreApellido.setText(this.us.getNombre() + " " + this.us.getApellido());
        views.lblNombreUsuario.setText(this.us.getNombreUsuario());
        views.lblEmail.setText(this.us.getEmail());
        views.lblTelefono.setText(this.us.getTelefono());
    }
    
    private void seleccionarImagen(){
        String Ruta = "";
        
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(views);
        
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            Ruta = jFileChooser.getSelectedFile().getPath();
            ImageUploader.subirImagenPerfil(Ruta, us);
            us = usDao.buscarUsuario(us.getNombreUsuario());
            cargarImagenPerfil();
            
            JOptionPane.showMessageDialog(views, "Imagen cargada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void cargarImagenPerfil(){
        Image mImage = new ImageIcon(us.getImagenPerfil()).getImage();
        ImageIcon mIcon = new ImageIcon(mImage.getScaledInstance(views.lblImagenPerfil.getWidth(), views.lblImagenPerfil.getHeight(), Image.SCALE_SMOOTH));
        views.lblImagenPerfil.setIcon(mIcon);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnMenu){
            BotonesInicio.btnInicio(us, views);
        }
        else if(e.getSource() == views.btnVuelos){
            BotonesInicio.btnVuelos(us, views);
        }
        else if(e.getSource() == views.btnPagos){
            BotonesInicio.btnPagos(us, views);
        }
        else if(e.getSource() == views.btnReservas){
            BotonesInicio.btnReservas(us, views);
        }
        else if(e.getSource() == views.btnSeleccionarImagen){
            seleccionarImagen();
        }
        else if(e.getSource() == views.btnCambiarPassword){
            views.btnCambiarPassword.setEnabled(false);
            views.txtCodigo.setVisible(true);
            views.jSeparator1.setVisible(true);
            views.btnConfirmarCodigo.setVisible(true);
            this.codigo = GeneradorCodigosEmail.enviarCorreo(us.getEmail(), false);
            JOptionPane.showMessageDialog(null, "Espere un momento..");
            JOptionPane.showMessageDialog(null, "Ingrese el código que le enviamos a su correo");
        }
        else if(e.getSource() == views.btnConfirmarCodigo){
            if(views.txtCodigo.getText().equals(this.codigo)){
                views.txtCodigo.setVisible(false);
                views.jSeparator1.setVisible(false);
                views.txtPassword.setVisible(true);
                views.jSeparator2.setVisible(true);
                views.txtPasswordConfirmada.setVisible(true);
                views.jSeparator3.setVisible(true);
                views.btnConfirmarCodigo.setVisible(false);
                views.btnConfirmarPassword.setVisible(true);
                JOptionPane.showMessageDialog(null, "Ahora ingrese y confirme su nueva contraseña");
            }else{
                JOptionPane.showMessageDialog(null, "Código incorrecto");
            }
        }
        else if(e.getSource() == views.btnConfirmarPassword){
            if(Validator.isValidPassword(String.valueOf(views.txtPassword.getPassword()))){
                if(String.valueOf(views.txtPassword.getPassword()).equals(String.valueOf(views.txtPasswordConfirmada.getPassword()))){
                    us.setContrasena(String.valueOf(views.txtPassword.getPassword()));
                    JOptionPane.showMessageDialog(null, "Contraseña modificada con éxito");
                    views.txtCodigo.setText("");
                    views.txtPassword.setText("");
                    views.txtPasswordConfirmada.setText("");
                    views.txtPassword.setVisible(false);
                    views.txtPasswordConfirmada.setVisible(false);
                    views.btnConfirmarPassword.setVisible(false);
                    views.jSeparator2.setVisible(false);
                    views.jSeparator3.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La contraseña debe contener: \n 8 caracteres como minimo \n 1 número \n 1 caracter especial");
            }
        }
        else if(e.getSource() == views.btnCambiarTelefono){
            views.btnCambiarTelefono.setEnabled(false);
            views.txtTelefono.setVisible(true);
            views.jSeparator4.setVisible(true);
            views.btnConfirmarTelefono.setVisible(true);
            JOptionPane.showMessageDialog(null, "Ahora ingrese su nuevo número de teléfono");
        }
        else if(e.getSource() == views.btnConfirmarTelefono){
            if(Validator.isValidPhoneNumber(views.txtTelefono.getText())){
                us.setTelefono(views.txtTelefono.getText());
                JOptionPane.showMessageDialog(null, "Teléfono modificado con éxito");
                views.lblTelefono.setText(us.getTelefono());
                views.txtTelefono.setText("");
                views.txtTelefono.setVisible(false);
                views.jSeparator4.setVisible(false);
                views.btnConfirmarTelefono.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un número de teléfono válido");
            }
        }
        else if(e.getSource() == views.btnCerrar){
            BotonesInicio.btnCerrarLogin(views);
        }
        else if(e.getSource() == views.btnSonido){
            BotonesInicio.btnSonido();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.txtCodigo){
            Object[] components = PlaceHolder.placeHolderRegistroCodigo(views.txtCodigo);
            views.txtCodigo = (JTextField) components[0];
        }
        else if(e.getSource() == views.txtPassword){
            Object[] components = PlaceHolder.placeHolderPassword2(views.txtPassword, views.txtPasswordConfirmada);
            views.txtPassword = (JPasswordField) components[0];
            views.txtPasswordConfirmada = (JPasswordField) components[1];
        }
        else if(e.getSource() == views.txtPasswordConfirmada){
            Object[] components = PlaceHolder.placeHolderPassword2(views.txtPasswordConfirmada, views.txtPassword);
            views.txtPasswordConfirmada = (JPasswordField) components[0];
            views.txtPassword = (JPasswordField) components[1];
        }
        else if(e.getSource() == views.txtTelefono){
            Object[] components = PlaceHolder.placeHolderRegistroTelefono(views.txtTelefono);
            views.txtTelefono = (JTextField) components[0];
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
