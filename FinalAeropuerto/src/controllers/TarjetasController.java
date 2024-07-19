package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Pago;
import models.Reserva;
import models.Usuario;
import models.dao.PagoDao;
import models.dao.ReservaDao;
import views.PanelInicio;
import views.PanelPagos;
import views.PanelTarjetas;

public class TarjetasController implements ActionListener {

    private PanelTarjetas views;
    private Reserva reserva;
    private ReservaDao reservaDao;
    private Pago pago;
    private PagoDao pagoDao;
    private Usuario us;
    private PanelPagos viewAnterior;

    public TarjetasController(PanelTarjetas views, Reserva reserva, Usuario us, PanelPagos viewAnterior) {
        this.views = views;
        this.reserva = reserva;
        this.pago = new Pago();
        this.pagoDao = new PagoDao();
        this.us = us;
        this.viewAnterior = viewAnterior;
        this.reservaDao = new ReservaDao();
        this.views.btnCerrar.addActionListener(this);
        this.views.btnPagar.addActionListener(this);
        formatearCalendarioFechaVencimiento();
    }

    private void formatearCalendarioFechaVencimiento() {
        FutureDateValidator futureDateValidator = new FutureDateValidator(views.dcFechaVencimiento);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnCerrar) {
            views.dispose();
        }
        if (e.getSource() == views.btnPagar) {
            if (Validator.isValidCreditCardNumber(views.txtNumeroTarjeta.getText())) {
                if (Validator.validateAndFormatName(views.txtNombre.getText()) != null
                        && Validator.validateAndFormatName(views.txtApellido.getText()) != null) {
                    if (Validator.isValidCVV(views.txtCVV.getText())) {
                        if (Validator.isValidDocumentNumber(views.txtDni.getText())) {
                            pago.setIdReserva(reserva.getIdReserva());
                            pago.setIdMetodoPago(views.cbTipoTarjeta.getSelectedIndex() + 1);
                            pago.setMonto(reserva.getTotalPagar());
                            if (pagoDao.registrarPago(pago)) {
                                JOptionPane.showMessageDialog(null, "Espere un momento...");
                                GeneradorCodigosEmail.enviarCorreoPago(us.getEmail());
                                if (reservaDao.completarReserva(reserva)) {
                                    JOptionPane.showMessageDialog(null, "Gracias por comprar su boleto, su reserva esta confirmada");
                                    PanelInicio inicio = new PanelInicio(us);
                                    inicio.setVisible(true);
                                    viewAnterior.dispose();
                                    views.dispose();
                                } else{
                                    JOptionPane.showMessageDialog(null, "Error al completar su reserva");
                                }
                            } else{
                                JOptionPane.showMessageDialog(null, "Error al registrar su pago");
                            }
                        } else{
                            JOptionPane.showMessageDialog(null, "Ingrese un número de documento válido");
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Ingrese un CVV válido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre y/o apellido válido");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un numero de tarjeta válido");
            }
        }
    }
}
