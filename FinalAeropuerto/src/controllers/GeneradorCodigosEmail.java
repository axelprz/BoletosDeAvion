
package controllers;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class GeneradorCodigosEmail {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int LONGITUD = 8;
    
    public static String generarCodigo() {
        StringBuilder codigo = new StringBuilder(LONGITUD);
        for (int i = 0; i < LONGITUD; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            codigo.append(CHARACTERS.charAt(index));
        }
        return codigo.toString();
    }
    
    public static String enviarCorreo(String destinatario, boolean registro){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        String asunto;
        String contenido;
        String codigo;
        
        if(registro){
            asunto = "Registro";
            codigo = generarCodigo();
            contenido = "Gracias por registrarse en FlyNow\nTu código de registro es: " + codigo;
        }else{
            asunto = "Cambio de contraseña";
            codigo = generarCodigo();
            contenido = "Tu código de cambio de contraseña es: " + codigo;
        }
        
        
        String usuario = "flynow.airlines.arg@gmail.com";
        String contrasena = "tavm wgje scam esoy";

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, contrasena);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(contenido);

            Transport.send(message);

            return codigo;

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Correo no enviado, el correo ingresado no existe");
            return null;
        }
    }
}
