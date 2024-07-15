
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.PanelIniciarSesion;
import views.PanelRYI;
import views.PanelRegistro;

public class PanelRYIController implements ActionListener{
    private final PanelRYI views;

    public PanelRYIController(PanelRYI views) {
        this.views = views;
        views.btnLogin.addActionListener(this);
        views.btnRegistrarse.addActionListener(this);
        views.btnCerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnLogin){
            PanelIniciarSesion login = new PanelIniciarSesion();
            login.setVisible(true);
            views.dispose();
        }
        else if(e.getSource() == views.btnRegistrarse){
            PanelRegistro registro = new PanelRegistro();
            registro.setVisible(true);
            views.dispose();
        }
        else if(e.getSource() == views.btnCerrar){
            BotonesInicio.btnCerrar(views);
        }
    }
}
