
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
        btnIniciarSesion = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Nombre de Usuario o Email...");
        txtEmail.setBorder(null);
        txtEmail.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 300, 40));

        btnCambiarPass.setBackground(new java.awt.Color(51, 51, 51));
        btnCambiarPass.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCambiarPass.setForeground(new java.awt.Color(204, 204, 204));
        btnCambiarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-cambiarContraseña.png"))); // NOI18N
        btnCambiarPass.setBorderPainted(false);
        btnCambiarPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarPass.setFocusPainted(false);
        btnCambiarPass.setFocusable(false);
        btnCambiarPass.setRequestFocusEnabled(false);
        btnCambiarPass.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-cambiarContraseña-h.png"))); // NOI18N
        btnCambiarPass.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 180, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-iniciarSesion.png"))); // NOI18N
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.setRequestFocusEnabled(false);
        btnIniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-iniciarSesion-h.png"))); // NOI18N
        btnIniciarSesion.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, 280, 40));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setText("**********");
        txtPass.setBorder(null);
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 300, 40));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblPassword.png"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 40, 40));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblUsuario.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 320, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inicio y registro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 720, 750));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar-h.png"))); // NOI18N
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 50, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FlyNow: Vuela fácil, vuela seguro.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 50));

        btnSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-encabezado.png"))); // NOI18N
        btnSonido.setBorder(null);
        btnSonido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSonido.setFocusPainted(false);
        btnSonido.setRequestFocusEnabled(false);
        btnSonido.setRolloverEnabled(true);
        btnSonido.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

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
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnSonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
