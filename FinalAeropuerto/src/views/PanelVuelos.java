/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import models.conexion.Conexion;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelVuelos extends javax.swing.JFrame {

    private static final int REGISTROS_POR_PAGINA = 5;
    private int paginaActual = 1;
    private int totalPaginas = 1;
    private Conexion conexion;

    public PanelVuelos() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanelRegistros.setLayout(new GridLayout(0, 1, 10, 10));
        jPanelRegistros.setBackground(new Color(255, 204, 102));
        jPanelRegistros.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        cargarDatosHorariosVuelos(paginaActual, REGISTROS_POR_PAGINA);

        setVisible(true);
    }
    
    private void cargarDatosHorariosVuelos(int pagina, int registrosPorPagina) {
        jPanelRegistros.removeAll();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = conexion.getConexion(); // Usar la clase de conexión correcta
            String query = "SELECT * FROM horario_vuelos LIMIT ?, ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, (pagina - 1) * registrosPorPagina);
            ps.setInt(2, registrosPorPagina);
            rs = ps.executeQuery();

            while (rs.next()) {
                String destino = rs.getString("destino");
                String dia = rs.getString("dia");
                String hora = rs.getString("hora");
                double valor = rs.getDouble("valor");

                JPanel panel = new JPanel(new GridLayout(1, 5, 10, 10));
                panel.setBackground(Color.WHITE);
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                JLabel lblDestino = new JLabel(destino);
                lblDestino.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblDestino);

                JLabel lblDia = new JLabel(dia);
                lblDia.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblDia);

                JLabel lblHora = new JLabel(hora);
                lblHora.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblHora);

                JLabel lblValor = new JLabel(String.valueOf(valor));
                lblValor.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblValor);

                jPanelRegistros.add(panel);
            }

            totalPaginas = calcularTotalPaginas(registrosPorPagina);
            jPanelRegistros.revalidate();
            jPanelRegistros.repaint();

        } catch (SQLException e) {
            System.out.println("Error al cargar datos de horarios de vuelos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }

    private void buscarVuelosPorDestino(String destino) {
        jPanelRegistros.removeAll();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = conexion.getConexion(); // Usar la clase de conexión correcta
            String query = "SELECT * FROM horario_vuelos WHERE destino LIKE ?";
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + destino + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                String dia = rs.getString("dia");
                String hora = rs.getString("hora");
                double valor = rs.getDouble("valor");

                JPanel panel = new JPanel(new GridLayout(1, 5, 10, 10));
                panel.setBackground(Color.WHITE);
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                JLabel lblDestino = new JLabel(destino);
                lblDestino.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblDestino);

                JLabel lblDia = new JLabel(dia);
                lblDia.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblDia);

                JLabel lblHora = new JLabel(hora);
                lblHora.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblHora);

                JLabel lblValor = new JLabel(String.valueOf(valor));
                lblValor.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
                panel.add(lblValor);

                jPanelRegistros.add(panel);
            }

            totalPaginas = calcularTotalPaginas(REGISTROS_POR_PAGINA);
            jPanelRegistros.revalidate();
            jPanelRegistros.repaint();

        } catch (SQLException e) {
            System.out.println("Error al buscar vuelos por destino: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    
    private int calcularTotalPaginas(int registrosPorPagina) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int totalRegistros = 0;

        try {
            con = conexion.getConexion(); // Usar la clase de conexión correcta
            String query = "SELECT COUNT(*) AS total FROM horario_vuelos";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                totalRegistros = rs.getInt("total");
            }

        } catch (SQLException e) {
            System.out.println("Error al calcular total de registros: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return (int) Math.ceil((double) totalRegistros / registrosPorPagina);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelRegistros = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menu oscuro.png"))); // NOI18N
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reservas oscuro.png"))); // NOI18N
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pagos oscuro.png"))); // NOI18N
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo mas chico.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 140));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1).png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil (1) oscuro.png"))); // NOI18N
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        btn_buscar.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Donde desea viajar?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanelRegistros.setBackground(new java.awt.Color(255, 204, 102));

        btnAnterior.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(0, 0, 0));
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrosLayout = new javax.swing.GroupLayout(jPanelRegistros);
        jPanelRegistros.setLayout(jPanelRegistrosLayout);
        jPanelRegistrosLayout.setHorizontalGroup(
            jPanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrosLayout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(btnAnterior)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addGap(397, 397, 397))
        );
        jPanelRegistrosLayout.setVerticalGroup(
            jPanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrosLayout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addGroup(jPanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String destino = txtBuscar.getText().trim();
        if (!destino.isEmpty()) {
            buscarVuelosPorDestino(destino);
        } else {
            cargarDatosHorariosVuelos(paginaActual, REGISTROS_POR_PAGINA);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (paginaActual > 1) {
            paginaActual--;
            cargarDatosHorariosVuelos(paginaActual, REGISTROS_POR_PAGINA);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (paginaActual < totalPaginas) {
            paginaActual++;
            cargarDatosHorariosVuelos(paginaActual, REGISTROS_POR_PAGINA);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        new PanelVuelos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelRegistros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
