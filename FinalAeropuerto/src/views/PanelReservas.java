
package views;

import controllers.ReservasController;
import models.Usuario;
import models.dao.ReservaDao;

public class PanelReservas extends javax.swing.JFrame {

    public PanelReservas(Usuario us) {
        initComponents();
        this.btnCancelar.setVisible(false);
        this.btnPagar.setVisible(false);
        this.lbl7.setVisible(false);
        this.lbl3.setVisible(false);
        this.lbl4.setVisible(false);
        this.lbl5.setVisible(false);
        this.lbl6.setVisible(false);
        this.lbl1.setVisible(false);
        this.lbl2.setVisible(false);
        this.lblGuion1.setVisible(false);
        this.lblGuion2.setVisible(false);
        this.lblReservaCancelada1.setVisible(false);
        this.lblReservaCancelada2.setVisible(false);
        this.lblReservaCancelada3.setVisible(false);
        this.lblReservaCompletada1.setVisible(false);
        this.lblReservaCompletada2.setVisible(false);
        this.lblReservaCompletada3.setVisible(false);
        this.setLocationRelativeTo(null);
        ReservaDao reservaDao = new ReservaDao();
        ReservasController controller = new ReservasController(this, us, reservaDao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnVuelos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblReservaCancelada3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblReservaCompletada3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblGuion1 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblReservaCompletada1 = new javax.swing.JLabel();
        lblReservaCompletada2 = new javax.swing.JLabel();
        lblReservaCancelada1 = new javax.swing.JLabel();
        lblReservaCancelada2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbl2 = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblFechaLlegada = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblGuion2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblDni1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblDni2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblDni3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblDni4 = new javax.swing.JLabel();
        lblDni5 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo mas chico.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 140));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu.png"))); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setDefaultCapable(false);
        btnMenu.setFocusPainted(false);
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu oscuro.png"))); // NOI18N
        btnMenu.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1).png"))); // NOI18N
        btnPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setDefaultCapable(false);
        btnPerfil.setFocusPainted(false);
        btnPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1) oscuro.png"))); // NOI18N
        btnPerfil.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos.png"))); // NOI18N
        btnPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPagos.setContentAreaFilled(false);
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagos.setDefaultCapable(false);
        btnPagos.setFocusPainted(false);
        btnPagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos oscuro.png"))); // NOI18N
        btnPagos.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        btnVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/vuelos.png"))); // NOI18N
        btnVuelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVuelos.setContentAreaFilled(false);
        btnVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVuelos.setDefaultCapable(false);
        btnVuelos.setFocusPainted(false);
        btnVuelos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/vuelos oscuro.png"))); // NOI18N
        btnVuelos.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(btnVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 720));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reservas canceladas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 320, 50));

        lblReservaCancelada3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCancelada3.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCancelada3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCancelada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCancelada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 320, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reserva pendiente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 460, 50));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reservas completadas");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 320, 50));

        lblReservaCompletada3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCompletada3.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCompletada3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCompletada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCompletada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 320, 50));

        lbl1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 460, 50));

        lblPrecio.setBackground(new java.awt.Color(51, 51, 51));
        lblPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, 50));

        lblOrigen.setBackground(new java.awt.Color(51, 51, 51));
        lblOrigen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lblOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 50));

        lblGuion1.setBackground(new java.awt.Color(51, 51, 51));
        lblGuion1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblGuion1.setForeground(new java.awt.Color(255, 255, 255));
        lblGuion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuion1.setText("-");
        jPanel2.add(lblGuion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 40, 50));

        lblDestino.setBackground(new java.awt.Color(51, 51, 51));
        lblDestino.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(255, 255, 255));
        lblDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 120, 50));

        lblReservaCompletada1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCompletada1.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCompletada1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCompletada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCompletada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 320, 50));

        lblReservaCompletada2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCompletada2.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCompletada2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCompletada2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCompletada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 320, 50));

        lblReservaCancelada1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCancelada1.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCancelada1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCancelada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCancelada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 320, 50));

        lblReservaCancelada2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblReservaCancelada2.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaCancelada2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReservaCancelada2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblReservaCancelada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 320, 50));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-cancelar-reserva.png"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setDefaultCapable(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setFocusable(false);
        btnCancelar.setRolloverEnabled(true);
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-cancelar-reserva-h.png"))); // NOI18N
        btnCancelar.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 50, 50));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-pagar-reserva.png"))); // NOI18N
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setDefaultCapable(false);
        btnPagar.setFocusPainted(false);
        btnPagar.setFocusable(false);
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-pagar-reserva-h.png"))); // NOI18N
        btnPagar.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 50));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FlyNow: Vuela fácil, vuela seguro.");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRequestFocusEnabled(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar-h.png"))); // NOI18N
        btnCerrar.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 70));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 20, 650));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 370, -1));

        lbl2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 320, 50));

        lblFechaSalida.setBackground(new java.awt.Color(51, 51, 51));
        lblFechaSalida.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 50));

        lblFechaLlegada.setBackground(new java.awt.Color(51, 51, 51));
        lblFechaLlegada.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFechaLlegada.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaLlegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 50));

        lbl7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 320, 50));

        lblGuion2.setBackground(new java.awt.Color(51, 51, 51));
        lblGuion2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblGuion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuion2.setText("-");
        jPanel2.add(lblGuion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 40, 50));

        lbl3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 320, 50));

        lblDni1.setBackground(new java.awt.Color(51, 51, 51));
        lblDni1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDni1.setForeground(new java.awt.Color(255, 255, 255));
        lblDni1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 120, 50));

        lblNombre1.setBackground(new java.awt.Color(51, 51, 51));
        lblNombre1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 50));

        lbl4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 320, 50));

        lbl5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 320, 50));

        lbl6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 320, 50));

        lblNombre2.setBackground(new java.awt.Color(51, 51, 51));
        lblNombre2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 50));

        lblDni2.setBackground(new java.awt.Color(51, 51, 51));
        lblDni2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDni2.setForeground(new java.awt.Color(255, 255, 255));
        lblDni2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 120, 50));

        lblNombre3.setBackground(new java.awt.Color(51, 51, 51));
        lblNombre3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 50));

        lblDni3.setBackground(new java.awt.Color(51, 51, 51));
        lblDni3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDni3.setForeground(new java.awt.Color(255, 255, 255));
        lblDni3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 120, 50));

        lblNombre4.setBackground(new java.awt.Color(51, 51, 51));
        lblNombre4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 180, 50));

        lblDni4.setBackground(new java.awt.Color(51, 51, 51));
        lblDni4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDni4.setForeground(new java.awt.Color(255, 255, 255));
        lblDni4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 50));

        lblDni5.setBackground(new java.awt.Color(51, 51, 51));
        lblDni5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDni5.setForeground(new java.awt.Color(255, 255, 255));
        lblDni5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblDni5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 120, 50));

        lblNombre5.setBackground(new java.awt.Color(51, 51, 51));
        lblNombre5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 180, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnPagar;
    public javax.swing.JButton btnPagos;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnVuelos;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lbl1;
    public javax.swing.JLabel lbl2;
    public javax.swing.JLabel lbl3;
    public javax.swing.JLabel lbl4;
    public javax.swing.JLabel lbl5;
    public javax.swing.JLabel lbl6;
    public javax.swing.JLabel lbl7;
    public javax.swing.JLabel lblDestino;
    public javax.swing.JLabel lblDni1;
    public javax.swing.JLabel lblDni2;
    public javax.swing.JLabel lblDni3;
    public javax.swing.JLabel lblDni4;
    public javax.swing.JLabel lblDni5;
    public javax.swing.JLabel lblFechaLlegada;
    public javax.swing.JLabel lblFechaSalida;
    public javax.swing.JLabel lblGuion1;
    public javax.swing.JLabel lblGuion2;
    public javax.swing.JLabel lblNombre1;
    public javax.swing.JLabel lblNombre2;
    public javax.swing.JLabel lblNombre3;
    public javax.swing.JLabel lblNombre4;
    public javax.swing.JLabel lblNombre5;
    public javax.swing.JLabel lblOrigen;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblReservaCancelada1;
    public javax.swing.JLabel lblReservaCancelada2;
    public javax.swing.JLabel lblReservaCancelada3;
    public javax.swing.JLabel lblReservaCompletada1;
    public javax.swing.JLabel lblReservaCompletada2;
    public javax.swing.JLabel lblReservaCompletada3;
    // End of variables declaration//GEN-END:variables
}
