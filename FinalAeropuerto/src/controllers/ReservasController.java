package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import models.Pasajero;
import models.Reserva;
import models.Usuario;
import models.Vuelo;
import models.dao.PasajeroDao;
import models.dao.ReservaDao;
import models.dao.VueloDao;
import views.PanelInfoReserva;
import views.PanelInicio;
import views.PanelPagos;
import views.PanelReservas;

public class ReservasController implements ActionListener {

    private PanelReservas views;
    private Usuario us;
    private ReservaDao reservaDao;
    private Reserva reserva;
    private Vuelo vuelo;
    private VueloDao vueloDao;
    private List<Pasajero> pasajeros;
    private PasajeroDao pasajeroDao;
    private List<JLabel> lblPasajeros;
    private List<Reserva> reservasCanceladas;
    private List<Reserva> reservasCompletadas;
    private List<JLabel> lblReservasCanceladas;
    private List<JLabel> lblReservasCompletadas;
    private List<JLabel> lblNombres;
    private List<JLabel> lblDocumentos;
    private List<JButton> btnInfoReservasCanceladas;
    private List<JButton> btnInfoReservasCompletadas;

    public ReservasController(PanelReservas views, Usuario us, ReservaDao reservaDao) {
        this.views = views;
        this.us = us;
        this.reservaDao = reservaDao;
        this.reserva = new Reserva();
        this.vuelo = new Vuelo();
        this.vueloDao = new VueloDao();
        this.pasajeros = new ArrayList<>();
        this.pasajeroDao = new PasajeroDao();
        this.reservasCanceladas = new ArrayList<>();
        this.reservasCompletadas = new ArrayList<>();
        this.lblNombres = Arrays.asList(views.lblNombre1, views.lblNombre2, views.lblNombre3, views.lblNombre4, views.lblNombre5);
        this.lblDocumentos = Arrays.asList(views.lblDni1, views.lblDni2, views.lblDni3, views.lblDni4, views.lblDni5);
        this.lblReservasCompletadas = Arrays.asList(views.lblReservaCompletada1, views.lblReservaCompletada2, views.lblReservaCompletada3);
        this.lblReservasCanceladas = Arrays.asList(views.lblReservaCancelada1, views.lblReservaCancelada2, views.lblReservaCancelada3);
        this.btnInfoReservasCanceladas = Arrays.asList(views.btnInfo4, views.btnInfo5, views.btnInfo6);
        this.btnInfoReservasCompletadas = Arrays.asList(views.btnInfo1, views.btnInfo2, views.btnInfo3);
        this.reservasCanceladas = reservaDao.buscarReservaCancelada(us);
        this.reservasCompletadas = reservaDao.buscarReservaCompletada(us);
        this.lblPasajeros = Arrays.asList(views.lbl3, views.lbl4, views.lbl5, views.lbl6, views.lbl7);
        views.btnCancelar.addActionListener(this);
        views.btnCerrar.addActionListener(this);
        views.btnPagar.addActionListener(this);
        views.btnMenu.addActionListener(this);
        views.btnPagos.addActionListener(this);
        views.btnPerfil.addActionListener(this);
        views.btnVuelos.addActionListener(this);
        views.btnInfo1.addActionListener(this);
        views.btnInfo2.addActionListener(this);
        views.btnInfo3.addActionListener(this);
        views.btnInfo4.addActionListener(this);
        views.btnInfo5.addActionListener(this);
        views.btnInfo6.addActionListener(this);
        actualizarLongitudReservas();
        mostrarReservas(reservasCanceladas, lblReservasCanceladas);
        mostrarReservas(reservasCompletadas, lblReservasCompletadas);
        mostrarBotonesReservaCancelada();
        mostrarBotonesReservaCompletada();
        llenarCampos();
    }

    public void llenarCampos() {
        this.reserva = reservaDao.buscarReserva(us);
        this.vuelo = vueloDao.buscarVueloPorReserva(reserva);
        this.pasajeros = pasajeroDao.buscarPasajerosPorReserva(reserva);

        String origen = vuelo.getOrigen();
        String destino = vuelo.getDestino();
        int totalPagar = reserva.getTotalPagar();
        String dia = vuelo.getDia();
        int hora = vuelo.getHora();
        int duracion = vuelo.getDuracion();

        if (vuelo.getDestino() != null) {
            views.lbl1.setVisible(true);
            views.lbl2.setVisible(true);
            views.lblGuion1.setVisible(true);
            views.lblGuion2.setVisible(true);
            views.lblOrigen.setText(origen);
            views.lblDestino.setText(destino);
            views.lblPrecio.setText("$" + totalPagar);
            views.lblFechaSalida.setText(dia + " " + hora + "AM");
            views.lblFechaLlegada.setText(calcularFechaYHoraLlegada(dia, hora, duracion));
            for (int i = 0; i < pasajeros.size(); i++) {
                this.lblPasajeros.get(i).setVisible(true);
                this.lblNombres.get(i).setText(pasajeros.get(i).getNombre() + " " + pasajeros.get(i).getApellido());
                this.lblDocumentos.get(i).setText(pasajeros.get(i).getNumeroDocumento());
            }
            views.btnCancelar.setVisible(true);
            views.btnPagar.setVisible(true);
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
            return dias[diaIndice] + " " + suma + "AM";
        }
        if (suma < 24) {
            return dias[diaIndice] + " " + suma + "PM";
        }
        if (suma >= 24 && (suma - 24) < 12) {
            return (dias[diaIndice + 1]) + " " + (suma - 24) + "AM";
        }
        if (suma >= 24 && (suma - 24) >= 12) {
            return (dias[diaIndice + 1]) + " " + (suma - 24) + "PM";
        }
        return null;
    }
    
    public void actualizarLongitudReservas(){
        while (reservasCanceladas.size() > 3) {
            reservasCanceladas.remove(0);
        }
        while (reservasCompletadas.size() > 3) {
            reservasCompletadas.remove(0);
        }
    }

    public void mostrarReservas(List<Reserva> reservas, List<JLabel> lblReservas) {
        for (int i = 0; i < reservas.size(); i++) {
            this.vuelo = vueloDao.buscarVueloPorReserva(reservas.get(i));

            String origen = vuelo.getOrigen();
            String destino = vuelo.getDestino();
            String dia = vuelo.getDia();
            int hora = vuelo.getHora();

            lblReservas.get(i).setVisible(true);
            lblReservas.get(i).setText(dia + " " + hora + "AM |     " + origen + "          -          " + destino);
        }
    }

    public void cancelarReserva() {
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cancelar su reserva", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            if (this.reservaDao.cancelarReserva(reserva)) {
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito");
                this.reservasCanceladas = reservaDao.buscarReservaCancelada(us);
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al cancelar la reserva");
            }
        }
        PanelInicio inicio = new PanelInicio(us);
        inicio.setVisible(true);
        views.dispose();
    }
    
    public void mostrarBotonesReservaCancelada(){
        for (int i = 0; i < reservasCanceladas.size(); i++) {
            btnInfoReservasCanceladas.get(i).setVisible(true);
        }
    }
    
    public void mostrarBotonesReservaCompletada(){
        for (int i = 0; i < reservasCompletadas.size(); i++) {
            btnInfoReservasCompletadas.get(i).setVisible(true);
        }
    }
    
    public void botonesInfoReservaCancelada(int indice){
        vuelo = vueloDao.buscarVueloPorReserva(reservasCanceladas.get(indice));
        String destino = vuelo.getDestino();
        String origen = vuelo.getOrigen();
        String fechaSalida = vuelo.getDia() + " " + vuelo.getHora() + "AM";
        String fechaLlegada = calcularFechaYHoraLlegada(vuelo.getDia(), vuelo.getHora(), vuelo.getDuracion());
        String precio = "$" + reservasCanceladas.get(indice).getTotalPagar();
        String numeroVuelo = vuelo.getNumeroVuelo();
        PanelInfoReserva info = new PanelInfoReserva(destino, origen, fechaSalida, fechaLlegada, precio, numeroVuelo);
        info.setVisible(true);
    }
    
    public void botonesInfoReservaCompletada(int indice){
        vuelo = vueloDao.buscarVueloPorReserva(reservasCompletadas.get(indice));
        String destino = vuelo.getDestino();
        String origen = vuelo.getOrigen();
        String fechaSalida = vuelo.getDia() + " " + vuelo.getHora() + "AM";
        String fechaLlegada = calcularFechaYHoraLlegada(vuelo.getDia(), vuelo.getHora(), vuelo.getDuracion());
        String precio = "$" + reservasCompletadas.get(indice).getTotalPagar();
        String numeroVuelo = vuelo.getNumeroVuelo();
        PanelInfoReserva info = new PanelInfoReserva(destino, origen, fechaSalida, fechaLlegada, precio, numeroVuelo);
        info.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnCerrar) {
            BotonesInicio.btnCerrarLogin(views);
        } else if (e.getSource() == views.btnMenu) {
            BotonesInicio.btnInicio(us, views);
        } else if (e.getSource() == views.btnPagos) {
            BotonesInicio.btnPagos(us, views);
        } else if (e.getSource() == views.btnPerfil) {
            BotonesInicio.btnPerfil(us, views);
        } else if (e.getSource() == views.btnVuelos) {
            BotonesInicio.btnVuelos(us, views);
        } else if (e.getSource() == views.btnCancelar) {
            cancelarReserva();
            mostrarReservas(reservasCanceladas, lblReservasCanceladas);
        } else if (e.getSource() == views.btnPagar){
            PanelPagos pagos = new PanelPagos(us);
            pagos.setVisible(true);
            views.dispose();
        } else if(e.getSource() == views.btnInfo1){
            botonesInfoReservaCompletada(0);
        } else if(e.getSource() == views.btnInfo2){
            botonesInfoReservaCompletada(1);
        } else if(e.getSource() == views.btnInfo3){
            botonesInfoReservaCompletada(2);
        } else if(e.getSource() == views.btnInfo4){
            botonesInfoReservaCancelada(0);
        } else if(e.getSource() == views.btnInfo5){
            botonesInfoReservaCancelada(1);
        } else if(e.getSource() == views.btnInfo6){
            botonesInfoReservaCancelada(2);
        }
    }

}
