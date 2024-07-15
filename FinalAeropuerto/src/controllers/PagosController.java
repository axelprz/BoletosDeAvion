
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Usuario;
import views.PanelPagos;

public class PagosController implements ActionListener {

    private PanelPagos views;
    private Usuario us;

    public PagosController(PanelPagos views, Usuario us) {
        this.views = views;
        this.us = us;
        views.btnCerrar.addActionListener(this);
        views.btnMenu.addActionListener(this);
        views.btnPerfil.addActionListener(this);
        views.btnReservas.addActionListener(this);
        views.btnVuelos.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnCerrar){
            BotonesInicio.btnCerrar(views);
        }
        else if(e.getSource() == views.btnMenu){
            BotonesInicio.btnInicio(us, views);
        }
        else if(e.getSource() == views.btnReservas){
            BotonesInicio.btnReservas(us, views);
        }
        else if(e.getSource() == views.btnVuelos){
            BotonesInicio.btnVuelos(us, views);
        }
        else if(e.getSource() == views.btnPerfil){
            BotonesInicio.btnPerfil(us, views);
        }
    }
    
}
