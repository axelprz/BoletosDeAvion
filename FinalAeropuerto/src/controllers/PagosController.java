
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Reserva;
import models.Usuario;
import models.Vuelo;
import models.dao.ReservaDao;
import models.dao.VueloDao;
import views.PanelPagos;
import views.PanelTarjetas;

public class PagosController implements ActionListener {

    private PanelPagos views;
    private Usuario us;
    private ReservaDao reservaDao;
    private Reserva reserva;
    private Vuelo vuelo;
    private VueloDao vueloDao;

    public PagosController(PanelPagos views, Usuario us) {
        this.views = views;
        this.us = us;
        this.reservaDao = new ReservaDao();
        this.vuelo = new Vuelo();
        this.vueloDao = new VueloDao();
        this.reserva = new Reserva();
        views.btnSonido.addActionListener(this);
        views.btnCerrar.addActionListener(this);
        views.btnMenu.addActionListener(this);
        views.btnPerfil.addActionListener(this);
        views.btnReservas.addActionListener(this);
        views.btnVuelos.addActionListener(this);
        views.btnMastercard.addActionListener(this);
        views.btnVisa.addActionListener(this);
        views.btnNaranjaX.addActionListener(this);
        views.btnSeleccionar.addActionListener(this);
        llenarComboBoxReservas();
    }
    
    private void llenarComboBoxReservas(){
        this.reserva = reservaDao.buscarReserva(us);
        this.vuelo = vueloDao.buscarVueloPorReserva(reserva);
        
        if(vuelo.getDestino() != null){
            views.cbReserva.addItem(vuelo.getOrigen()+ " - " + vuelo.getDestino());
        }else{
            JOptionPane.showMessageDialog(null, "No tiene reservas pendientes");
        }
    }
    
    private void llenarCampos(){
        this.reserva = reservaDao.buscarReserva(us);
        this.vuelo = vueloDao.buscarVueloPorReserva(reserva);
        String dia = vuelo.getDia();
        int hora = vuelo.getHora();
        int duracion = vuelo.getDuracion();
        
        if(vuelo.getDestino() != null){
            views.lblOrigenDestino.setVisible(true);
            views.lblOrigenDestino.setText(vuelo.getDestino());
            views.lblSalida.setVisible(true);
            views.lblSalida.setText(vuelo.getDia() + "         -           " + vuelo.getHora() + "AM");
            views.lblLlegada.setVisible(true);
            views.lblLlegada.setText(calcularFechaYHoraLlegada(dia, hora, duracion));
            views.lblPrecio.setVisible(true);
            views.lblPrecio.setText("$" + reserva.getTotalPagar());
        }else{
            JOptionPane.showMessageDialog(null, "Error al llenar los campos");
        }
    }
    
    public String calcularFechaYHoraLlegada(String dia, int hora, int duracion) {
        int suma = hora + duracion;
        int diaIndice = 0;
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equals(dia)) {
                diaIndice = i;
            }
        }
        if (suma < 12) {
            return dias[diaIndice] + "         -           " + suma + "AM";
        }
        if (suma < 24) {
            return dias[diaIndice] + "         -           " + suma + "PM";
        }
        if (suma >= 24 && (suma - 24) < 12) {
            return (dias[diaIndice + 1]) + "         -           " + (suma - 24) + "AM";
        }
        if (suma >= 24 && (suma - 24) >= 12) {
            return (dias[diaIndice + 1]) + "         -           " + (suma - 24) + "PM";
        }
        return null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnCerrar){
            BotonesInicio.btnCerrarLogin(views);
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
        else if(e.getSource() == views.btnSonido){
            BotonesInicio.btnSonido();
        }
        else if(e.getSource() == views.btnSeleccionar){
            if(views.cbReserva.getSelectedIndex() == 1){
                views.cbReserva.setEnabled(false);
                llenarCampos();
                views.btnMastercard.setEnabled(true);
                views.btnVisa.setEnabled(true);
                views.btnNaranjaX.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Ahora seleccione su método de pago");
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar su reserva");
            }
        }
        else if(e.getSource() == views.btnMastercard || e.getSource() == views.btnVisa || e.getSource() == views.btnNaranjaX){
            PanelTarjetas tarjetas = new PanelTarjetas(reserva, us, views);
            tarjetas.setVisible(true);
        }
    }
    
}
