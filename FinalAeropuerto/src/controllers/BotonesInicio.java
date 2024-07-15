
package controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.Usuario;
import views.PanelInicio;
import views.PanelPagos;
import views.PanelPerfil;
import views.PanelReservas;
import views.PanelVuelos;

public class BotonesInicio {
    public static void btnPerfil(Usuario us, JFrame view){
        PanelPerfil perfil = new PanelPerfil(us);
        perfil.setVisible(true);
        view.dispose();
    }
    
    public static void btnVuelos(Usuario us, JFrame view){
        PanelVuelos vuelos = new PanelVuelos(us);
        vuelos.setVisible(true);
        view.dispose();
    }
    
    public static void btnReservas(Usuario us, JFrame view){
        PanelReservas reservas = new PanelReservas();
        reservas.setVisible(true);
        view.dispose();
    }
    
    public static void btnPagos(Usuario us, JFrame view){
        PanelPagos pagos = new PanelPagos(us);
        pagos.setVisible(true);
        view.dispose();
    }
    
    public static void btnInicio(Usuario us, JFrame view){
        PanelInicio inicio = new PanelInicio(us);
        inicio.setVisible(true);
        view.dispose();
    }
    
    public static void btnCerrar(JFrame view){
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            System.exit(0);
        }
    }
}
