package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.Asiento;
import views.PanelReservarVuelo;
import views.PanelSeleccionAciento;

public class SeleccionAsientoController {

    private PanelSeleccionAciento views;
    private PanelReservarVuelo reserva;
    private Asiento asiento;
    private List<JButton> asientos;
    private final int TOTAL_ASIENTOS = 154;
    private final double OCUPACION_INICIAL = 0.5;

    private final String ICONO_OCUPADO_PATH = "C:/BoletosDeAvion/FinalAeropuerto/src/img/avion-reservado.png";
    private final String ICONO_DISPONIBLE_PATH = "C:/BoletosDeAvion/FinalAeropuerto/src/img/avion-no-reservado.png";
    private final String ICONO_SELECCIONADO_PATH = "C:/BoletosDeAvion/FinalAeropuerto/src/img/avion-seleccionado.png";

    private final ImageIcon ICONO_OCUPADO = new ImageIcon(ICONO_OCUPADO_PATH);
    private final ImageIcon ICONO_DISPONIBLE = new ImageIcon(ICONO_DISPONIBLE_PATH);
    private final ImageIcon ICONO_SELECCIONADO = new ImageIcon(ICONO_SELECCIONADO_PATH);

    private AsientoManager asientoManager = AsientoManager.getInstance();

    public SeleccionAsientoController(PanelSeleccionAciento views, PanelReservarVuelo reserva) {
        this.views = views;
        this.reserva = reserva;
        this.asientos = new ArrayList<>();
        asiento = new Asiento();

        if (ICONO_OCUPADO.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("Error al cargar la imagen: " + ICONO_OCUPADO_PATH);
        }

        if (ICONO_DISPONIBLE.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("Error al cargar la imagen: " + ICONO_DISPONIBLE_PATH);
        }

        if (ICONO_SELECCIONADO.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("Error al cargar la imagen: " + ICONO_SELECCIONADO_PATH);
        }

        inicializarBotones();
        if (asientoManager.getAsientosOcupados().isEmpty()) {
            ocuparAsientosAleatoriamente();
        }
        actualizarAsientos();
    }

    private void inicializarBotones() {
        for (int i = 1; i <= TOTAL_ASIENTOS; i++) {
            try {
                JButton btn = (JButton) views.getClass().getDeclaredField("btnAsiento" + i).get(views);
                asientos.add(btn);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                System.out.println(e);
            }
        }
    }

    private void ocuparAsientosAleatoriamente() {
        int asientosOcupados = (int) (TOTAL_ASIENTOS * OCUPACION_INICIAL);
        Set<Integer> indicesOcupados = new HashSet<>();
        Random random = new Random();

        while (indicesOcupados.size() < asientosOcupados) {
            int index = random.nextInt(TOTAL_ASIENTOS) + 1;
            indicesOcupados.add(index);
        }

        asientoManager.setAsientosOcupados(indicesOcupados);
    }

    private void actualizarAsientos() {
        for (int i = 1; i <= TOTAL_ASIENTOS; i++) {
            JButton btn = asientos.get(i - 1);
            btn.removeActionListener(btn.getActionListeners().length > 0 ? btn.getActionListeners()[0] : null);
            int index = i;
            if (asientoManager.isAsientoSeleccionado(i)) {
                btn.setIcon(ICONO_SELECCIONADO);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "El asiento " + actualizarCodigoAsiento(index) + " fue seleccionado anteriormente.");
                    }
                });
            } else if (asientoManager.isAsientoOcupado(i)) {
                btn.setIcon(ICONO_OCUPADO);
                btn.setEnabled(true);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "El asiento " + actualizarCodigoAsiento(index) + " está ocupado.");
                    }
                });
            } else {
                btn.setIcon(ICONO_DISPONIBLE);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mostrarInfoAsiento(index);
                    }
                });
            }
        }
    }

    private void mostrarInfoAsiento(int index) {
        JButton btn = asientos.get(index - 1);
        boolean disponible = btn.getIcon().equals(ICONO_DISPONIBLE);
        int precio = calcularPrecioAsiento(index);
        if (disponible) {
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "Asiento " + actualizarCodigoAsiento(index) + ": Precio " + precio + " USD\n¿Seleccionar este asiento?",
                    "Seleccionar Asiento",
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                asientoManager.seleccionarAsiento(index);
                btn.setIcon(ICONO_SELECCIONADO);
                JOptionPane.showMessageDialog(null, "Has seleccionado el asiento " + actualizarCodigoAsiento(index));
                reserva.lblAsientoSeleccionado.setText(actualizarCodigoAsiento(index));
                int precioTotal = Integer.parseInt(reserva.lblPrecioAsientos.getText()) + precio;
                reserva.lblPrecioAsientos.setText(String.valueOf(precioTotal));
                views.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "El asiento " + actualizarCodigoAsiento(index) + " está ocupado.");
        }
    }

    private int calcularPrecioAsiento(int index) {
        if (index <= 130) {
            return 100;
        } else {
            return 300;
        }
    }
    
    private String actualizarCodigoAsiento(int index){
        if (index <= 32){
            return "A" + index;
        }
        if(index <= 98){
            return "B" + index;
        }
        if(index <= 130){
            return "C" + index;
        }
        if(index <= 138){
            return "D" + index;
        }
        if(index <= 146){
            return "E" + index;
        }
        if(index <= 154){
            return "F" + index;
        }
        return null;
    }
}