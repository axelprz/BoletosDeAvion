package controllers;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.Usuario;
import views.PanelInicio;
import views.PanelPagos;
import views.PanelPerfil;
import views.PanelRYI;
import views.PanelReservas;
import views.PanelVuelos;

public class BotonesInicio {

    public static void btnPerfil(Usuario us, JFrame view) {
        PanelPerfil perfil = new PanelPerfil(us);
        perfil.setVisible(true);
        view.dispose();
    }

    public static void btnVuelos(Usuario us, JFrame view) {
        PanelVuelos vuelos = new PanelVuelos(us);
        vuelos.setVisible(true);
        view.dispose();
    }

    public static void btnReservas(Usuario us, JFrame view) {
        PanelReservas reservas = new PanelReservas(us);
        reservas.setVisible(true);
        view.dispose();
    }

    public static void btnPagos(Usuario us, JFrame view) {
        PanelPagos pagos = new PanelPagos(us);
        pagos.setVisible(true);
        view.dispose();
    }

    public static void btnInicio(Usuario us, JFrame view) {
        PanelInicio inicio = new PanelInicio(us);
        inicio.setVisible(true);
        view.dispose();
    }

    public static void btnCerrar(JFrame view) {
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            System.exit(0);
        }
    }

    public static void btnCerrarInicio(JFrame view, Usuario us) {
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            PanelInicio inicio = new PanelInicio(us);
            inicio.setVisible(true);
            view.dispose();
        }
    }

    public static void btnCerrarLogin(JFrame view) {
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            PanelRYI ryi = new PanelRYI();
            ryi.setVisible(true);
            view.dispose();
        }
    }

    public static void btnSonido() {
        try {
            File soundFile = new File("C:/BoletosDeAvion/FinalAeropuerto/src/img/sonido-avion.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
