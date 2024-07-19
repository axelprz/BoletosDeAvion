
package views;

import controllers.TarjetasController;
import models.Reserva;
import models.Usuario;

public class PanelTarjetas extends javax.swing.JFrame {

    public PanelTarjetas(Reserva reserva, Usuario us, PanelPagos views) {
        initComponents();
        TarjetasController controller = new TarjetasController(this, reserva, us, views);
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        dcFechaVencimiento = new com.toedter.calendar.JDateChooser();
        txtNombre = new javax.swing.JTextField();
        cbTipoTarjeta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-tarjeta-pagar.png"))); // NOI18N
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setDefaultCapable(false);
        btnPagar.setFocusPainted(false);
        btnPagar.setRolloverEnabled(true);
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-tarjeta-pagar-h.png"))); // NOI18N
        btnPagar.setVerifyInputWhenFocusTarget(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 50));

        txtNumeroTarjeta.setBackground(new java.awt.Color(204, 204, 204));
        txtNumeroTarjeta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumeroTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 197, -1));

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 168, -1));

        txtDni.setBackground(new java.awt.Color(204, 204, 204));
        txtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 168, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numero de tarjeta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha de vencimiento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 168, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtCVV.setBackground(new java.awt.Color(204, 204, 204));
        txtCVV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(0, 0, 0));
        txtCVV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 62, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CVV");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de tarjeta");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FlyNow: Vuela fácil, vuela seguro.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 280, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar-h.png"))); // NOI18N
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        dcFechaVencimiento.setBackground(new java.awt.Color(204, 204, 204));
        dcFechaVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dcFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(dcFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 168, 26));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 168, -1));

        cbTipoTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        cbTipoTarjeta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbTipoTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Débito" }));
        cbTipoTarjeta.setBorder(null);
        cbTipoTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoTarjeta.setFocusable(false);
        cbTipoTarjeta.setLightWeightPopupEnabled(false);
        cbTipoTarjeta.setRequestFocusEnabled(false);
        cbTipoTarjeta.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(cbTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 189, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI del titular de la tarjeta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnPagar;
    public javax.swing.JComboBox<String> cbTipoTarjeta;
    public com.toedter.calendar.JDateChooser dcFechaVencimiento;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCVV;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
