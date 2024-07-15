
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import models.Usuario;
import models.Vuelo;
import models.dao.VueloDao;
import views.PanelReservarVuelo;
import views.PanelVuelos;

public class VuelosController implements ActionListener, MouseListener {
    PanelVuelos views;
    Usuario us;
    VueloDao vueloDao;
    private List<Vuelo> vuelos = new ArrayList();
    private List<JButton> botones = new ArrayList();
    private int paginador = 0;
    private int maxPaginas;

    public VuelosController(PanelVuelos views, Usuario us, VueloDao vueloDao) {
        this.views = views;
        this.us = us;
        this.vueloDao = vueloDao;
        this.vuelos = vueloDao.obtenerTodosLosVuelos();
        this.botones = Arrays.asList(views.btnLugar1, views.btnLugar2, views.btnLugar3, views.btnLugar4, views.btnLugar5, views.btnLugar6,
                views.btnLugar7,views.btnLugar8);
        views.btnAnterior.addActionListener(this);
        views.btnBuscar.addActionListener(this);
        views.btnLugar1.addActionListener(this);
        views.btnLugar2.addActionListener(this);
        views.btnLugar3.addActionListener(this);
        views.btnLugar4.addActionListener(this);
        views.btnLugar5.addActionListener(this);
        views.btnLugar6.addActionListener(this);
        views.btnLugar7.addActionListener(this);
        views.btnLugar8.addActionListener(this);
        views.btnMenu.addActionListener(this);
        views.btnPagos.addActionListener(this);
        views.btnPerfil.addActionListener(this);
        views.btnReservas.addActionListener(this);
        views.btnSiguiente.addActionListener(this);
        views.txtBuscar.addMouseListener(this);
        calcularPaginas();
        llenarBotones();
    }
    
    private void calcularPaginas(){
        maxPaginas = (int) Math.ceil((double) vuelos.size() / 8);
        views.lblPaginador.setText((paginador+1) + " - " + maxPaginas);
    }
    
    private void llenarBotones(){
        int i = (paginador * 8);
        for(JButton boton: botones){
            try{
                boton.setVisible(true);
                boton.setIcon(new ImageIcon(vuelos.get(i).getImagenDestino()));
            }catch(Exception e){
                boton.setVisible(false);
            }
            i++;
        }
    }
    
    private void llenarBotonesBusqueda(){
        int i = (paginador * 8);
        for(JButton boton: botones){
            if(i < (vuelos.size() / 2)){
                boton.setVisible(true);
                boton.setIcon(new ImageIcon(vuelos.get(i).getImagenDestino()));
            }else{
                boton.setVisible(false);
            }
            i++;
        }
    }
    
    private Vuelo obtenerVuelo(int boton){
        Vuelo vuelo = this.vuelos.get(boton + (8 * paginador));
        
        return vuelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnMenu){
            BotonesInicio.btnPerfil(us, views);
        }
        else if(e.getSource() == views.btnPerfil){
            BotonesInicio.btnPerfil(us, views);
        }
        else if(e.getSource() == views.btnPagos){
            BotonesInicio.btnPagos(us, views);
        }
        else if(e.getSource() == views.btnReservas){
            BotonesInicio.btnReservas(us, views);
        }
        else if(e.getSource() == views.btnSiguiente){
            if(paginador+1 < maxPaginas){
                paginador++;
                calcularPaginas();
                llenarBotones();
            }
        }
        else if(e.getSource() == views.btnAnterior){
            if(paginador > 0){
                paginador--;
                calcularPaginas();
                llenarBotones();
            }
        }
        else if(e.getSource() == views.btnBuscar){
            String buscar = views.txtBuscar.getText();
            this.vuelos = vueloDao.obtenerVuelosPorNombreONacionalidad(2, buscar);
            paginador = 0;
            calcularPaginas();
            llenarBotonesBusqueda();
        }
        else if(e.getSource() == views.btnLugar1){
            Vuelo vuelo = obtenerVuelo(0);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar2){
            Vuelo vuelo = obtenerVuelo(1);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar3){
            Vuelo vuelo = obtenerVuelo(2);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar4){
            Vuelo vuelo = obtenerVuelo(3);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar5){
            Vuelo vuelo = obtenerVuelo(4);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar6){
            Vuelo vuelo = obtenerVuelo(5);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar7){
            Vuelo vuelo = obtenerVuelo(6);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        else if(e.getSource() == views.btnLugar8){
            Vuelo vuelo = obtenerVuelo(7);
            PanelReservarVuelo reservarVuelo = new PanelReservarVuelo(vuelo, us);
            reservarVuelo.setVisible(true);
            this.views.dispose();
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.txtBuscar){
            Object[] components = PlaceHolder.placeHolderVueloBusqueda(views.txtBuscar);
            views.txtBuscar = (JTextField) components[0];
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
