
package controllers;

import javax.swing.JFrame;
import models.Usuario;
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
        PanelPagos pagos = new PanelPagos();
        pagos.setVisible(true);
        view.dispose();
    }
}
