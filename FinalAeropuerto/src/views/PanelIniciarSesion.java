
package views;

import controllers.IniciarSesionController;
import models.Usuario;
import models.dao.UsuarioDao;

public class PanelIniciarSesion extends javax.swing.JFrame {

    public PanelIniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        Usuario us = new Usuario();
        UsuarioDao usDao = new UsuarioDao();
        IniciarSesionController controller = new IniciarSesionController(this, us, usDao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        btnCambiarPass = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Nombre de Usuario o Email...");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 124, 44), 1, true));
        txtEmail.setDragEnabled(true);
        txtEmail.setRequestFocusEnabled(false);
        txtEmail.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 300, 40));

        btnCambiarPass.setBackground(new java.awt.Color(51, 51, 51));
        btnCambiarPass.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCambiarPass.setForeground(new java.awt.Color(204, 204, 204));
        btnCambiarPass.setText("Olvidaste Tu Contraseña?");
        btnCambiarPass.setBorderPainted(false);
        btnCambiarPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarPass.setFocusPainted(false);
        btnCambiarPass.setFocusable(false);
        btnCambiarPass.setRequestFocusEnabled(false);
        btnCambiarPass.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 180, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/password.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.setRequestFocusEnabled(false);
        btnIniciarSesion.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 240, 40));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setText("**********");
        txtPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 125, 44), 1, true));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 320, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inicio y registro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCambiarPass;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
