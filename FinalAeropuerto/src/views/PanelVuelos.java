
package views;

import controllers.VuelosController;
import models.Usuario;
import models.dao.VueloDao;

public class PanelVuelos extends javax.swing.JFrame {

    public PanelVuelos(Usuario us) {
        initComponents();
        setLocationRelativeTo(null);
        VueloDao vueloDao = new VueloDao();
        VuelosController controller = new VuelosController(this, us, vueloDao);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnLugar1 = new javax.swing.JButton();
        btnLugar5 = new javax.swing.JButton();
        btnLugar6 = new javax.swing.JButton();
        btnLugar7 = new javax.swing.JButton();
        btnLugar8 = new javax.swing.JButton();
        btnLugar4 = new javax.swing.JButton();
        btnLugar3 = new javax.swing.JButton();
        btnLugar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblPaginador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu.png"))); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu oscuro.png"))); // NOI18N
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas.png"))); // NOI18N
        btnReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnReservas.setContentAreaFilled(false);
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas oscuro.png"))); // NOI18N
        getContentPane().add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos.png"))); // NOI18N
        btnPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnPagos.setContentAreaFilled(false);
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos oscuro.png"))); // NOI18N
        getContentPane().add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo mas chico.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 140));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1).png"))); // NOI18N
        btnPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1) oscuro.png"))); // NOI18N
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLugar1.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 200));

        btnLugar5.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 200));

        btnLugar6.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 250, 200));

        btnLugar7.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 250, 200));

        btnLugar8.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 250, 200));

        btnLugar4.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 250, 200));

        btnLugar3.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 250, 200));

        btnLugar2.setBackground(new java.awt.Color(255, 204, 102));
        btnLugar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnLugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 250, 200));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1130, 480));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busque su destino");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1150, -1));

        txtBuscar.setBackground(new java.awt.Color(102, 102, 102));
        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setText("Lugar o país");
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 360, 40));

        btnSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(204, 204, 204));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setFocusPainted(false);
        btnSiguiente.setFocusable(false);
        jPanel4.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 140, 40));

        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 100, 40));

        btnAnterior.setBackground(new java.awt.Color(0, 0, 0));
        btnAnterior.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(204, 204, 204));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(null);
        btnAnterior.setBorderPainted(false);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.setFocusPainted(false);
        btnAnterior.setFocusable(false);
        jPanel4.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 140, 40));

        lblPaginador.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPaginador.setForeground(new java.awt.Color(255, 255, 255));
        lblPaginador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaginador.setText("1 - 7");
        jPanel4.add(lblPaginador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 150, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Página");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 150, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 720));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 720));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnterior;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnLugar1;
    public javax.swing.JButton btnLugar2;
    public javax.swing.JButton btnLugar3;
    public javax.swing.JButton btnLugar4;
    public javax.swing.JButton btnLugar5;
    public javax.swing.JButton btnLugar6;
    public javax.swing.JButton btnLugar7;
    public javax.swing.JButton btnLugar8;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnPagos;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnReservas;
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lblPaginador;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
