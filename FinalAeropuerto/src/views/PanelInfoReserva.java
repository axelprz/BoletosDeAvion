
package views;

public class PanelInfoReserva extends javax.swing.JFrame {

    public PanelInfoReserva(String destino, String origen, String fechaSalida, String fechaLlegada, String precio, String numeroVuelo) {
        initComponents();
        this.lblDestino.setText(destino);
        this.lblFechaLlegada.setText(fechaLlegada);
        this.lblFechaSalida.setText(fechaSalida);
        this.lblNumeroVuelo.setText(numeroVuelo);
        this.lblOrigen.setText(origen);
        this.lblPrecio.setText(precio);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        lblNumeroVuelo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFechaLlegada = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrigen.setBackground(new java.awt.Color(204, 204, 204));
        lblOrigen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, 40));

        lblNumeroVuelo.setBackground(new java.awt.Color(204, 204, 204));
        lblNumeroVuelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNumeroVuelo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 170, 40));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Destino:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 40));

        lblDestino.setBackground(new java.awt.Color(204, 204, 204));
        lblDestino.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, 40));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Origen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 40));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Número de vuelo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Hora y fecha de salida:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        lblFechaSalida.setBackground(new java.awt.Color(204, 204, 204));
        lblFechaSalida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 40));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Hora y fecha de llegada:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 40));

        lblFechaLlegada.setBackground(new java.awt.Color(204, 204, 204));
        lblFechaLlegada.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFechaLlegada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, 40));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Precio:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 170, 40));

        lblPrecio.setBackground(new java.awt.Color(204, 204, 204));
        lblPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 170, 40));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar-h.png"))); // NOI18N
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FlyNow: Vuela fácil, vuela seguro.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 280, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 350, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 350, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 350, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 350, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 350, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblFechaLlegada;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblNumeroVuelo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}