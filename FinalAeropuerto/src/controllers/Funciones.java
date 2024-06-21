
package controllers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Funciones {
    public static Object[] placeHolderEmail(JTextField txtEmail, JPasswordField txtPassword) {
        if (txtEmail.getText().equals("Nombre de Usuario o Email...")) {
            txtEmail.setText("");
            txtEmail.setForeground(new Color(250, 250, 250));
        }
        if (String.valueOf(txtPassword.getPassword()).equals("")) {
            txtPassword.setText("**********");
            txtPassword.setForeground(new Color(207, 124, 44));
        }
        return new Object[] { txtEmail, txtPassword };
    }

    public static Object[] placeHolderPassword(JPasswordField txtPassword, JTextField txtEmail) {
        if (String.valueOf(txtPassword.getPassword()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(new Color(250, 250, 250));
        }
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Correo Electrónico");
            txtEmail.setForeground(new Color(207, 124, 44));
        }
        return new Object[] { txtPassword, txtEmail };
    }
}
