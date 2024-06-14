
package models.conexion;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.security.SecureRandom;

public class GeneradorCodigosEmail {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int LONGITUD = 5;
    
    public static String generarCodigoRegistro() {
        StringBuilder codigo = new StringBuilder(LONGITUD);
        for (int i = 0; i < LONGITUD; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            codigo.append(CHARACTERS.charAt(index));
        }
        return codigo.toString();
    }
    
    public static void enviarCorreo(String destinatario, String asunto, String contenido){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

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

            System.out.println("Correo enviado correctamente");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String destinatario = "axelperez164623@gmail.com";
        String asunto = "Código de registro";
        String codigoRegistro = generarCodigoRegistro();
        String contenido = "Tu código de registro es: " + codigoRegistro;

        enviarCorreo(destinatario, asunto, contenido);
    }
}
