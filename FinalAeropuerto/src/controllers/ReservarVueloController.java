package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.Pasajero;
import models.Reserva;
import models.Usuario;
import models.Vuelo;
import models.dao.PasajeroDao;
import models.dao.ReservaDao;
import models.dao.VueloDao;
import views.PanelReservarVuelo;
import views.PanelReservas;
import views.PanelSeleccionAciento;

public class ReservarVueloController implements ActionListener, MouseListener {

    private PanelReservarVuelo views;
    private PasajeroDao pasDao;
    private Usuario us;
    private VueloDao vueloDao;
    private Vuelo vuelo;
    private List<Vuelo> vuelos;
    private List<JComponent> filaPasajero;
    private int cantidadBoletos;
    private List<Pasajero> pasajeros;
    private List<JLabel> nombreApellidoPasajeros;
    private List<JLabel> asientoPasajeros;
    private List<JButton> eliminarPasajeros;
    private int totalAsientos = 0;

    public ReservarVueloController(PanelReservarVuelo views, PasajeroDao pasDao, Usuario us, VueloDao vueloDao, Vuelo vuelo) {
        this.views = views;
        this.pasDao = pasDao;
        this.us = us;
        this.vueloDao = vueloDao;
        this.vuelo = vuelo;
        this.views.btnConfirmar.addActionListener(this);
        this.views.btnCerrar.addActionListener(this);
        this.views.btnSeleccionarAsiento.addActionListener(this);
        this.views.btnReservar.addActionListener(this);
        this.views.btnGuardarPasajero.addActionListener(this);
        this.views.txtNombre.addMouseListener(this);
        this.views.txtApellido.addMouseListener(this);
        this.views.txtNumeroDocumento.addMouseListener(this);
        this.views.btnConfirmarReserva.addActionListener(this);
        this.filaPasajero = Arrays.asList(views.PanelPasajero1, views.PanelPasajero2, views.PanelPasajero3, views.PanelPasajero4, views.PanelPasajero5);
        this.nombreApellidoPasajeros = Arrays.asList(views.lblNombreApellido1, views.lblNombreApellido2, views.lblNombreApellido3,
                views.lblNombreApellido4, views.lblNombreApellido5);
        this.asientoPasajeros = Arrays.asList(views.lblAsiento1, views.lblAsiento2, views.lblAsiento3, views.lblAsiento4, views.lblAsiento5);
        this.pasajeros = new ArrayList<>();
    }

    private void FormatearCalendarioFechaVuelo(List<Vuelo> vuelos) {
        CustomDateSelectableFilter customDateSelectableFilter = new CustomDateSelectableFilter(views.dcFechaVuelo, vuelos.get(0).getDia(), vuelos.get(1).getDia());
    }

    private void FormatearCalendarioFechaNacimiento() {
        BirthDateValidator birthDateValidator = new BirthDateValidator(views.dcFechaNacimiento);
    }

    private static String getDayOfWeekInSpanish(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return "Lunes";
            case Calendar.TUESDAY:
                return "Martes";
            case Calendar.WEDNESDAY:
                return "Miércoles";
            case Calendar.THURSDAY:
                return "Jueves";
            case Calendar.FRIDAY:
                return "Viernes";
            case Calendar.SATURDAY:
                return "Sábado";
            case Calendar.SUNDAY:
                return "Domingo";
            default:
                return "";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnConfirmar) {
            if (views.cbOrigen.getSelectedIndex() != 0) {
                if (!(views.cbOrigen.getSelectedItem().equals(vuelo.getDestino()))) {

                    JOptionPane.showMessageDialog(null, "Ahora proceda con la información del vuelo");
                    views.PanelInfoVuelo.setVisible(true);

                    this.vuelos = this.vueloDao.obtenerVuelosPorNombreONacionalidad(this.views.cbOrigen.getSelectedIndex(), vuelo.getDestino());

                    this.views.lblDestino.setText(vuelo.getDestino());

                    if (views.cbIdaYVuelta.getSelectedIndex() == 0) {
                        this.views.lblPrecio.setText(vuelos.get(0).getPrecio() + "USD");
                    } else {
                        this.vuelos.get(0).setPrecio(vuelos.get(0).getPrecio() * 2);
                        this.views.lblPrecio.setText((vuelos.get(0).getPrecio()) + "USD");
                    }

                    views.cbOrigen.setEnabled(false);
                    views.cbIdaYVuelta.setEnabled(false);
                    views.btnConfirmar.setEnabled(false);

                    views.lblDia1.setText(vuelos.get(0).getDia());
                    views.lblDia2.setText(vuelos.get(1).getDia());

                    views.lblHora1.setText(vuelos.get(0).getHora() + "AM");
                    views.lblHora2.setText(vuelos.get(1).getHora() + "AM");

                    FormatearCalendarioFechaVuelo(vuelos);
                } else {
                    JOptionPane.showMessageDialog(null, "El lugar de origen no puede ser igual al lugar de destino");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe especificar su lugar de origen del vuelo");
            }
        } else if (e.getSource() == views.btnReservar) {
            if (views.dcFechaVuelo.getDate() != null && views.spCantidadBoletos.getValue() != null) {

                JOptionPane.showMessageDialog(null, "Reserva realizada, ahora ingrese los datos de los pasajeros");

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(views.dcFechaVuelo.getDate());

                String dia = getDayOfWeekInSpanish(calendar.get(Calendar.DAY_OF_WEEK));

                this.vuelo = vueloDao.buscarVueloPorNacionalidadYDia(views.cbOrigen.getSelectedIndex(), vuelo.getDestino(), dia);
                if (views.cbIdaYVuelta.getSelectedIndex() != 0) {
                    vuelo.setPrecio(vuelo.getPrecio() * 2);
                }

                FormatearCalendarioFechaNacimiento();

                this.cantidadBoletos = (int) views.spCantidadBoletos.getValue();

                views.dcFechaVuelo.setEnabled(false);
                views.spCantidadBoletos.setEnabled(false);
                views.btnReservar.setEnabled(false);
                views.PanelInfoPasajero.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            }
        } else if (e.getSource() == views.btnSeleccionarAsiento) {
            try {
                PanelSeleccionAciento asientos = new PanelSeleccionAciento(views);
                asientos.setVisible(true);
                views.btnSeleccionarAsiento.setEnabled(false);
            } catch (IllegalAccessException | NoSuchFieldException ex) {
                System.out.println(ex);
            }

        } else if (e.getSource() == views.btnGuardarPasajero) {
            if (Validator.validateAndFormatName(views.txtNombre.getText()) != null && !(views.txtNombre.getText().equals("Nombre"))) {
                if (Validator.validateAndFormatName(views.txtApellido.getText()) != null && !(views.txtApellido.getText().equals("Apellido"))) {
                    if (views.cbTipoDocumento.getSelectedIndex() != 0) {
                        if (Validator.isValidDocumentNumber(views.txtNumeroDocumento.getText()) && !(views.txtApellido.getText()
                                .equals("Número de documento"))) {
                            if (views.dcFechaNacimiento.getDate() != null) {
                                if (!(views.lblAsientoSeleccionado.getText().equals(""))) {
                                    Pasajero pasajero = new Pasajero(views.txtNombre.getText(), views.txtApellido.getText(),
                                            views.cbTipoDocumento.getSelectedIndex(), views.txtNumeroDocumento.getText(),
                                            views.cbNacionalidad.getSelectedIndex(), obtenerId(views.lblAsientoSeleccionado.getText()),
                                            String.valueOf(views.dcFechaNacimiento.getDate()));
                                    this.pasajeros.add(pasajero);
                                    this.filaPasajero.get(this.pasajeros.size() - 1).setVisible(true);
                                    this.nombreApellidoPasajeros.get(this.pasajeros.size() - 1).setText(views.txtNombre.getText() + " "
                                            + views.txtApellido.getText());
                                    this.asientoPasajeros.get(this.pasajeros.size() - 1).setText(views.lblAsientoSeleccionado.getText());
                                    JOptionPane.showMessageDialog(null, "Pasajero agregado");
                                    views.btnSeleccionarAsiento.setEnabled(true);
                                    limpiarCampos();

                                    if (this.pasajeros.size() == this.cantidadBoletos) {
                                        views.txtNombre.setEnabled(false);
                                        views.txtApellido.setEnabled(false);
                                        views.cbTipoDocumento.setEnabled(false);
                                        views.txtNumeroDocumento.setEnabled(false);
                                        views.cbNacionalidad.setEnabled(false);
                                        views.btnSeleccionarAsiento.setEnabled(false);
                                        views.dcFechaNacimiento.setEnabled(false);
                                        views.dcFechaNacimiento.setEnabled(false);
                                        views.btnGuardarPasajero.setEnabled(false);

                                        this.totalAsientos = Integer.parseInt(views.lblPrecioAsientos.getText());

                                        views.PanelTotalAPagar.setVisible(true);

                                        views.lblPrecioTotalVuelo.setText(((vuelo.getPrecio()) * cantidadBoletos) + "USD");
                                        views.lblPrecioTotalAsiento.setText(this.totalAsientos + "USD");

                                        views.lblTotalAPagar.setText(((vuelo.getPrecio() * cantidadBoletos) + this.totalAsientos) + "USD");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Seleccione un asiento");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese una fecha de nacimiento");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un número de documento válido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un tipo de documento");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un apellido válido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre válido");
            }
        } else if (e.getSource() == views.btnConfirmarReserva) {
            Reserva reserva = new Reserva(us, vuelo, "pendiente", String.valueOf(views.dcFechaVuelo.getDate()), pasajeros, Integer.parseInt(views.lblTotalAPagar.getText().substring(0, views.lblTotalAPagar.getText().length() - 3)));
            ReservaDao reservaDao = new ReservaDao();
            PasajeroDao pasajeroDao = new PasajeroDao();

            if (reservaDao.buscarReserva(us).getIdReserva() == 0) {
                if (reservaDao.registrarReserva(reserva)) {
                    reserva = reservaDao.buscarReserva(us);
                    for (Pasajero pasajero : pasajeros) {
                        pasajero.setIdReserva(reserva.getIdReserva());
                        if (!(pasajeroDao.registrarPasajero(pasajero))) {
                            JOptionPane.showMessageDialog(null, "Error al guardar el pasajero");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Reserva realizada con éxito");
                    PanelReservas reservas = new PanelReservas(us);
                    reservas.setVisible(true);
                    views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar la reserva");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tiene una reserva pendiente, cancelala o confirmala para poder seguir reservando");
            }
        } else if (e.getSource() == views.btnCerrar) {
            BotonesInicio.btnCerrarInicio(views, us);
        }
    }

    private void limpiarCampos() {
        views.txtNombre.setText("");
        views.txtApellido.setText("");
        views.cbTipoDocumento.setSelectedIndex(0);
        views.txtNumeroDocumento.setText("");
        views.cbNacionalidad.setSelectedIndex(0);
        views.dcFechaNacimiento.setDate(null);
    }

    private int obtenerId(String codigo) {
        return Integer.parseInt(codigo.substring(1));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.txtNombre) {
            Object[] components = PlaceHolder.placeHolderReservaVueloNombre(views.txtNombre, views.txtApellido,
                    views.txtNumeroDocumento);
            views.txtNombre = (JTextField) components[0];
            views.txtApellido = (JTextField) components[1];
            views.txtNumeroDocumento = (JTextField) components[2];
        } else if (e.getSource() == views.txtApellido) {
            Object[] components = PlaceHolder.placeHolderReservaVueloApellido(views.txtApellido, views.txtNombre,
                    views.txtNumeroDocumento);
            views.txtApellido = (JTextField) components[0];
            views.txtNombre = (JTextField) components[1];
            views.txtNumeroDocumento = (JTextField) components[2];
        } else if (e.getSource() == views.txtNumeroDocumento) {
            Object[] components = PlaceHolder.placeHolderReservaVueloNumeroDocumento(views.txtNumeroDocumento, views.txtApellido,
                    views.txtNombre);
            views.txtNumeroDocumento = (JTextField) components[0];
            views.txtApellido = (JTextField) components[1];
            views.txtNombre = (JTextField) components[2];
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
