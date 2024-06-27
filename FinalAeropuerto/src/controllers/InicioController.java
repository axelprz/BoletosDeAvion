
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Usuario;
import views.PanelInicio;
import views.PanelPerfil;

public class InicioController implements ActionListener {
    PanelInicio views;
    Usuario us;

    public InicioController(PanelInicio views, Usuario us) {
        this.views = views;
        this.us = us;
        views.btnPerfil.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnPerfil){
            PanelPerfil perfil = new PanelPerfil(this.us);
            perfil.setVisible(true);
            views.dispose();
        }
    }
    
}
