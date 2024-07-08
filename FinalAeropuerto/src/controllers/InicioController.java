
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import models.Usuario;
import models.Vuelo;
import models.dao.VueloDao;
import views.PanelInicio;
import views.PanelPerfil;

public class InicioController implements ActionListener {
    PanelInicio views;
    Usuario us;
    VueloDao vuelDao;
    List<Vuelo> vuelos = new ArrayList<>();
    List<JLabel> lblsLugares = new ArrayList<>();
    List<JLabel> lblsHoras = new ArrayList<>();

    public InicioController(PanelInicio views, Usuario us, VueloDao vuelDao) {
        this.views = views;
        this.us = us;
        this.vuelDao = vuelDao;
        views.btnPerfil.addActionListener(this);
        lblsLugares = Arrays.asList(views.lblLugar1, views.lblLugar2, views.lblLugar3, views.lblLugar4, views.lblLugar5,
            views.lblLugar6, views.lblLugar7, views.lblLugar8, views.lblLugar9, views.lblLugar10, views.lblLugar11, views.lblLugar12, 
            views.lblLugar13, views.lblLugar14, views.lblLugar15);
        lblsHoras = Arrays.asList(views.lblHora1, views.lblHora2, views.lblHora3, views.lblHora4, views.lblHora5, views.lblHora6,
            views.lblHora7, views.lblHora8, views.lblHora9, views.lblHora10, views.lblHora11, views.lblHora12, views.lblHora13,
            views.lblHora14, views.lblHora15);
        limpiarVuelos();
        mostrarVuelosDiarios();
    }
    
    private void mostrarVuelosDiarios(){
        String dia = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        vuelos = vuelDao.obtenerVuelosDelDia(dia);
        int i = 0;
        for(Vuelo vuelo : vuelos){
            lblsLugares.get(i).setText(vuelo.getDestino());
            lblsHoras.get(i).setText(vuelo.getHora() + "AM" + " - " + calcularHorario(vuelo.getHora(), vuelo.getDuracion()));
            i++;
        }
        i = 1;
        if(vuelos.size() == 14){
            while(i <= 1){
                (lblsLugares.get(lblsLugares.size() - i)).setVisible(false);
                (lblsHoras.get(lblsHoras.size() - i)).setVisible(false);
                i++;
            }
        }
        if(vuelos.size() == 10){
            while(i <= 5){
                (lblsLugares.get(lblsLugares.size() - i)).setVisible(false);
                (lblsHoras.get(lblsHoras.size() - i)).setVisible(false);
                i++;
            }
        }
        if(vuelos.size() == 9){
            while(i <= 6){
                (lblsLugares.get(lblsLugares.size() - i)).setVisible(false);
                (lblsHoras.get(lblsHoras.size() - i)).setVisible(false);
                i++;
            }
        }
    }
    
    private void limpiarVuelos(){
        for(JLabel lbl: lblsLugares){
            lbl.setText("");
        }
        for(JLabel lbl: lblsHoras){
            lbl.setText("");
        }
    }
    
    private String calcularHorario(int hora, int duracion){
        int resultado = hora + duracion;
        if(resultado <= 11){
            return resultado + "AM";
        }
        if(resultado > 11 & resultado < 24){
            return resultado + "PM";
        }
        if(resultado > 23){
            if((resultado - 24) < 12){
                return (resultado - 24) + "AM";
            }
            if((resultado - 24) > 12){
                return (resultado - 24) + "PM";
            }
        }
        return null;
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
