
package views;

import controllers.PagosController;
import models.Usuario;

public class PanelPagos extends javax.swing.JFrame {
    
    public PanelPagos(Usuario us) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.btnMastercard.setEnabled(false);
        this.btnNaranjaX.setEnabled(false);
        this.btnVisa.setEnabled(false);
        this.lblLlegada.setVisible(false);
        this.lblOrigenDestino.setVisible(false);
        this.lblPrecio.setVisible(false);
        this.lblSalida.setVisible(false);
        PagosController controller = new PagosController(this, us);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnReservas = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnVuelos = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnNaranjaX = new javax.swing.JButton();
        btnMastercard = new javax.swing.JButton();
        btnVisa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblLlegada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblOrigenDestino = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        cbReserva = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo mas chico.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 140));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas.png"))); // NOI18N
        btnReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReservas.setContentAreaFilled(false);
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas oscuro.png"))); // NOI18N
        btnReservas.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 574, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu.png"))); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu oscuro.png"))); // NOI18N
        btnMenu.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 159, -1, -1));

        btnVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/vuelos.png"))); // NOI18N
        btnVuelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVuelos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/vuelos oscuro.png"))); // NOI18N
        btnVuelos.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 436, -1, -1));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1).png"))); // NOI18N
        btnPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1) oscuro.png"))); // NOI18N
        btnPerfil.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 297, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 720));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        btnNaranjaX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/naranja logo.png"))); // NOI18N
        btnNaranjaX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNaranjaX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNaranjaX.setDefaultCapable(false);
        btnNaranjaX.setFocusPainted(false);
        btnNaranjaX.setFocusable(false);
        btnNaranjaX.setVerifyInputWhenFocusTarget(false);

        btnMastercard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mastercard logo.png"))); // NOI18N
        btnMastercard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMastercard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMastercard.setDefaultCapable(false);
        btnMastercard.setFocusPainted(false);
        btnMastercard.setFocusable(false);
        btnMastercard.setVerifyInputWhenFocusTarget(false);

        btnVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/visa logo.png"))); // NOI18N
        btnVisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisa.setDefaultCapable(false);
        btnVisa.setFocusPainted(false);
        btnVisa.setFocusable(false);
        btnVisa.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Métodos de Pago");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(btnNaranjaX, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMastercard, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMastercard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNaranjaX, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione la reserva a pagar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 30));

        lblPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setOpaque(true);
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, 30));

        lblLlegada.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLlegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLlegada.setOpaque(true);
        jPanel2.add(lblLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 170, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Día y hora salida");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Día y hora llegada");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 170, 30));

        lblOrigenDestino.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblOrigenDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrigenDestino.setOpaque(true);
        jPanel2.add(lblOrigenDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        lblSalida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setOpaque(true);
        jPanel2.add(lblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Precio");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Destino");
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 30));

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-pagos-seleccionar.png"))); // NOI18N
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.setRolloverEnabled(true);
        btnSeleccionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-pagos-seleccionar-h.png"))); // NOI18N
        jPanel2.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 110, 40));

        cbReserva.setBackground(new java.awt.Color(255, 255, 255));
        cbReserva.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbReserva.setForeground(new java.awt.Color(0, 0, 0));
        cbReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservas" }));
        cbReserva.setBorder(null);
        cbReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbReserva.setFocusable(false);
        cbReserva.setLightWeightPopupEnabled(false);
        cbReserva.setRequestFocusEnabled(false);
        cbReserva.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(cbReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 189, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 680, 650));

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar-h.png"))); // NOI18N
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FlyNow: Vuela fácil, vuela seguro.");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 280, 50));

        btnSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-encabezado.png"))); // NOI18N
        btnSonido.setBorder(null);
        btnSonido.setBorderPainted(false);
        btnSonido.setContentAreaFilled(false);
        btnSonido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSonido.setFocusPainted(false);
        btnSonido.setFocusable(false);
        btnSonido.setRequestFocusEnabled(false);
        btnSonido.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 680, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnMastercard;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnNaranjaX;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnReservas;
    public javax.swing.JButton btnSeleccionar;
    public javax.swing.JButton btnSonido;
    public javax.swing.JButton btnVisa;
    public javax.swing.JButton btnVuelos;
    public javax.swing.JComboBox<String> cbReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lblLlegada;
    public javax.swing.JLabel lblOrigenDestino;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblSalida;
    // End of variables declaration//GEN-END:variables
}
