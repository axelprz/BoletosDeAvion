
package views;

import controllers.ReservarVueloController;
import models.Usuario;
import models.Vuelo;
import models.dao.PasajeroDao;
import models.dao.VueloDao;

public class PanelReservarVuelo extends javax.swing.JFrame {

    public PanelReservarVuelo(Vuelo vuelo, Usuario us) {
        initComponents();
        
        this.PanelInfoPasajero.setVisible(false);
        this.PanelInfoVuelo.setVisible(false);
        this.PanelTotalAPagar.setVisible(false);
        this.lblAsientoSeleccionado.setVisible(false);
        this.PanelPasajero1.setVisible(false);
        this.PanelPasajero2.setVisible(false);
        this.PanelPasajero3.setVisible(false);
        this.PanelPasajero4.setVisible(false);
        this.PanelPasajero5.setVisible(false);
        
        PasajeroDao pasDao = new PasajeroDao();
        VueloDao vueloDao = new VueloDao();
        ReservarVueloController controller = new ReservarVueloController(this, pasDao, us, vueloDao, vuelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbIdaYVuelta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbOrigen = new javax.swing.JComboBox<>();
        PanelInfoVuelo = new javax.swing.JPanel();
        lblDia1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        spCantidadBoletos = new javax.swing.JSpinner();
        dcFechaVuelo = new com.toedter.calendar.JDateChooser();
        btnReservar = new javax.swing.JButton();
        lblDia2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelInfoPasajero = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbNacionalidad = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        btnSeleccionarAsiento = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnGuardarPasajero = new javax.swing.JButton();
        lblAsientoSeleccionado = new javax.swing.JLabel();
        PanelPasajero5 = new javax.swing.JPanel();
        lblNombreApellido5 = new javax.swing.JLabel();
        lblAsiento5 = new javax.swing.JLabel();
        btnEliminar5 = new javax.swing.JButton();
        PanelPasajero1 = new javax.swing.JPanel();
        btnEliminar1 = new javax.swing.JButton();
        lblAsiento1 = new javax.swing.JLabel();
        lblNombreApellido1 = new javax.swing.JLabel();
        PanelPasajero2 = new javax.swing.JPanel();
        lblNombreApellido2 = new javax.swing.JLabel();
        lblAsiento2 = new javax.swing.JLabel();
        btnEliminar2 = new javax.swing.JButton();
        PanelPasajero3 = new javax.swing.JPanel();
        lblNombreApellido3 = new javax.swing.JLabel();
        lblAsiento3 = new javax.swing.JLabel();
        btnEliminar3 = new javax.swing.JButton();
        PanelPasajero4 = new javax.swing.JPanel();
        lblNombreApellido4 = new javax.swing.JLabel();
        lblAsiento4 = new javax.swing.JLabel();
        btnEliminar4 = new javax.swing.JButton();
        PanelTotalAPagar = new javax.swing.JPanel();
        btnConfirmarReserva = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblDestino2 = new javax.swing.JLabel();
        lblTotalAPagar = new javax.swing.JLabel();
        lblDestino4 = new javax.swing.JLabel();
        lblPrecioTotalVuelo = new javax.swing.JLabel();
        lblPrecioTotalAsiento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbIdaYVuelta.setBackground(new java.awt.Color(255, 255, 255));
        cbIdaYVuelta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbIdaYVuelta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo ida", "Ida y vuelta" }));
        cbIdaYVuelta.setBorder(null);
        cbIdaYVuelta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbIdaYVuelta.setFocusable(false);
        cbIdaYVuelta.setLightWeightPopupEnabled(false);
        cbIdaYVuelta.setRequestFocusEnabled(false);
        cbIdaYVuelta.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(cbIdaYVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 189, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Elija una opción");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 46));

        btnConfirmar.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirmar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(null);
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setFocusable(false);
        btnConfirmar.setRequestFocusEnabled(false);
        btnConfirmar.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 167, 37));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo mas chico.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 220, 140));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Reservar Vuelo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 350, 45));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Elija el lugar de origen");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 46));

        cbOrigen.setBackground(new java.awt.Color(255, 255, 255));
        cbOrigen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Origen", "Buenos Aires", "Córdoba", "Mendoza", "Santa Fe" }));
        cbOrigen.setBorder(null);
        cbOrigen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbOrigen.setFocusable(false);
        cbOrigen.setLightWeightPopupEnabled(false);
        cbOrigen.setRequestFocusEnabled(false);
        cbOrigen.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(cbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 189, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 730, 190));

        PanelInfoVuelo.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfoVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDia1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDia1.setForeground(new java.awt.Color(0, 0, 0));
        lblDia1.setText("Dias");
        lblDia1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 30));

        lblPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio");
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 110, 30));

        lblHora2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblHora2.setForeground(new java.awt.Color(0, 0, 0));
        lblHora2.setText("Hora");
        lblHora2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, 30));

        lblHora1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblHora1.setForeground(new java.awt.Color(0, 0, 0));
        lblHora1.setText("Hora");
        lblHora1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cuantos boletos desea comprar? ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Seleccione una fecha");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));

        spCantidadBoletos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        spCantidadBoletos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spCantidadBoletos.setBorder(null);
        spCantidadBoletos.setFocusable(false);
        spCantidadBoletos.setOpaque(false);
        spCantidadBoletos.setRequestFocusEnabled(false);
        spCantidadBoletos.setVerifyInputWhenFocusTarget(false);
        PanelInfoVuelo.add(spCantidadBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 30));

        dcFechaVuelo.setBackground(new java.awt.Color(51, 51, 51));
        dcFechaVuelo.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaVuelo.setDoubleBuffered(false);
        dcFechaVuelo.setFocusable(false);
        dcFechaVuelo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dcFechaVuelo.setOpaque(false);
        dcFechaVuelo.setRequestFocusEnabled(false);
        dcFechaVuelo.setVerifyInputWhenFocusTarget(false);
        PanelInfoVuelo.add(dcFechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 30));

        btnReservar.setBackground(new java.awt.Color(51, 51, 51));
        btnReservar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Reservar");
        btnReservar.setBorder(null);
        btnReservar.setBorderPainted(false);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.setFocusable(false);
        btnReservar.setRequestFocusEnabled(false);
        btnReservar.setVerifyInputWhenFocusTarget(false);
        PanelInfoVuelo.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 167, 37));

        lblDia2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDia2.setForeground(new java.awt.Color(0, 0, 0));
        lblDia2.setText("Dias");
        lblDia2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblDia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Información del vuelo");
        PanelInfoVuelo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        lblDestino.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(0, 0, 0));
        lblDestino.setText("Destino");
        lblDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoVuelo.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 30));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Días y horarios disponibles");
        PanelInfoVuelo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 20));

        jPanel1.add(PanelInfoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 350, 330));

        PanelInfoPasajero.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfoPasajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Información del pasajero");
        PanelInfoPasajero.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        txtNumeroDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroDocumento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNumeroDocumento.setForeground(new java.awt.Color(102, 102, 102));
        txtNumeroDocumento.setText("Número de documento");
        txtNumeroDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoPasajero.add(txtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Nombre");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoPasajero.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 30));

        cbNacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        cbNacionalidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        cbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionalidad", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladesh", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Esuatini", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue", " " }));
        cbNacionalidad.setBorder(null);
        cbNacionalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbNacionalidad.setFocusable(false);
        cbNacionalidad.setLightWeightPopupEnabled(false);
        cbNacionalidad.setRequestFocusEnabled(false);
        cbNacionalidad.setVerifyInputWhenFocusTarget(false);
        PanelInfoPasajero.add(cbNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 30));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(102, 102, 102));
        txtApellido.setText("Apellido");
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoPasajero.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, 30));

        cbTipoDocumento.setBackground(new java.awt.Color(255, 255, 255));
        cbTipoDocumento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbTipoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de documento", "Pasaporte", "DNI", "Tarjeta de residencia", "Visa", "Cédula de identidad" }));
        cbTipoDocumento.setBorder(null);
        cbTipoDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoDocumento.setFocusable(false);
        cbTipoDocumento.setLightWeightPopupEnabled(false);
        cbTipoDocumento.setRequestFocusEnabled(false);
        cbTipoDocumento.setVerifyInputWhenFocusTarget(false);
        PanelInfoPasajero.add(cbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 30));

        btnSeleccionarAsiento.setBackground(new java.awt.Color(51, 51, 51));
        btnSeleccionarAsiento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSeleccionarAsiento.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarAsiento.setText("Seleccionar Asiento");
        btnSeleccionarAsiento.setBorder(null);
        btnSeleccionarAsiento.setBorderPainted(false);
        btnSeleccionarAsiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarAsiento.setFocusable(false);
        btnSeleccionarAsiento.setRequestFocusEnabled(false);
        btnSeleccionarAsiento.setVerifyInputWhenFocusTarget(false);
        PanelInfoPasajero.add(btnSeleccionarAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fecha de nacimiento");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelInfoPasajero.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 30));

        dcFechaNacimiento.setBackground(new java.awt.Color(51, 51, 51));
        dcFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        dcFechaNacimiento.setDoubleBuffered(false);
        dcFechaNacimiento.setFocusable(false);
        dcFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dcFechaNacimiento.setOpaque(false);
        dcFechaNacimiento.setRequestFocusEnabled(false);
        dcFechaNacimiento.setVerifyInputWhenFocusTarget(false);
        PanelInfoPasajero.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, 30));

        btnGuardarPasajero.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarPasajero.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardarPasajero.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPasajero.setText("Guardar Pasajero");
        btnGuardarPasajero.setBorder(null);
        btnGuardarPasajero.setBorderPainted(false);
        btnGuardarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPasajero.setFocusable(false);
        btnGuardarPasajero.setRequestFocusEnabled(false);
        btnGuardarPasajero.setVerifyInputWhenFocusTarget(false);
        PanelInfoPasajero.add(btnGuardarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 167, 37));

        lblAsientoSeleccionado.setText("1");
        PanelInfoPasajero.add(lblAsientoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, 30));

        PanelPasajero5.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajero5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreApellido5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreApellido5.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreApellido5.setText("Nombre y Apellido");
        lblNombreApellido5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero5.add(lblNombreApellido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        lblAsiento5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAsiento5.setForeground(new java.awt.Color(0, 0, 0));
        lblAsiento5.setText("Asiento");
        lblAsiento5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero5.add(lblAsiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        btnEliminar5.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar5.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar5.setText("X");
        btnEliminar5.setBorder(null);
        btnEliminar5.setBorderPainted(false);
        btnEliminar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar5.setFocusable(false);
        btnEliminar5.setRequestFocusEnabled(false);
        btnEliminar5.setVerifyInputWhenFocusTarget(false);
        PanelPasajero5.add(btnEliminar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        PanelInfoPasajero.add(PanelPasajero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 330, 30));

        PanelPasajero1.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajero1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar1.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("X");
        btnEliminar1.setBorder(null);
        btnEliminar1.setBorderPainted(false);
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.setFocusable(false);
        btnEliminar1.setRequestFocusEnabled(false);
        btnEliminar1.setVerifyInputWhenFocusTarget(false);
        PanelPasajero1.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        lblAsiento1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAsiento1.setForeground(new java.awt.Color(0, 0, 0));
        lblAsiento1.setText("Asiento");
        lblAsiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero1.add(lblAsiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        lblNombreApellido1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreApellido1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreApellido1.setText("Nombre y Apellido");
        lblNombreApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero1.add(lblNombreApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        PanelInfoPasajero.add(PanelPasajero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 30));

        PanelPasajero2.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajero2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreApellido2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreApellido2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreApellido2.setText("Nombre y Apellido");
        lblNombreApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero2.add(lblNombreApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        lblAsiento2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAsiento2.setForeground(new java.awt.Color(0, 0, 0));
        lblAsiento2.setText("Asiento");
        lblAsiento2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero2.add(lblAsiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        btnEliminar2.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setText("X");
        btnEliminar2.setBorder(null);
        btnEliminar2.setBorderPainted(false);
        btnEliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar2.setFocusable(false);
        btnEliminar2.setRequestFocusEnabled(false);
        btnEliminar2.setVerifyInputWhenFocusTarget(false);
        PanelPasajero2.add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        PanelInfoPasajero.add(PanelPasajero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 330, 30));

        PanelPasajero3.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajero3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreApellido3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreApellido3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreApellido3.setText("Nombre y Apellido");
        lblNombreApellido3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero3.add(lblNombreApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        lblAsiento3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAsiento3.setForeground(new java.awt.Color(0, 0, 0));
        lblAsiento3.setText("Asiento");
        lblAsiento3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero3.add(lblAsiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        btnEliminar3.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar3.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar3.setText("X");
        btnEliminar3.setBorder(null);
        btnEliminar3.setBorderPainted(false);
        btnEliminar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar3.setFocusable(false);
        btnEliminar3.setRequestFocusEnabled(false);
        btnEliminar3.setVerifyInputWhenFocusTarget(false);
        PanelPasajero3.add(btnEliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        PanelInfoPasajero.add(PanelPasajero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 330, 30));

        PanelPasajero4.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajero4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreApellido4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreApellido4.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreApellido4.setText("Nombre y Apellido");
        lblNombreApellido4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero4.add(lblNombreApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        lblAsiento4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAsiento4.setForeground(new java.awt.Color(0, 0, 0));
        lblAsiento4.setText("Asiento");
        lblAsiento4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPasajero4.add(lblAsiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        btnEliminar4.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar4.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar4.setText("X");
        btnEliminar4.setBorder(null);
        btnEliminar4.setBorderPainted(false);
        btnEliminar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar4.setFocusable(false);
        btnEliminar4.setRequestFocusEnabled(false);
        btnEliminar4.setVerifyInputWhenFocusTarget(false);
        PanelPasajero4.add(btnEliminar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        PanelInfoPasajero.add(PanelPasajero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, 30));

        jPanel1.add(PanelInfoPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 350, 490));

        PanelTotalAPagar.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalAPagar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmarReserva.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirmarReserva.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConfirmarReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarReserva.setText("Confirmar Reserva");
        btnConfirmarReserva.setBorder(null);
        btnConfirmarReserva.setBorderPainted(false);
        btnConfirmarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarReserva.setFocusable(false);
        btnConfirmarReserva.setRequestFocusEnabled(false);
        btnConfirmarReserva.setVerifyInputWhenFocusTarget(false);
        PanelTotalAPagar.add(btnConfirmarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 167, 37));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total a Pagar");
        PanelTotalAPagar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 20));

        lblDestino2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDestino2.setForeground(new java.awt.Color(0, 0, 0));
        lblDestino2.setText("Asiento");
        lblDestino2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelTotalAPagar.add(lblDestino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 20));

        lblTotalAPagar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTotalAPagar.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalAPagar.setText("Precio");
        lblTotalAPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelTotalAPagar.add(lblTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, 20));

        lblDestino4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDestino4.setForeground(new java.awt.Color(0, 0, 0));
        lblDestino4.setText("Vuelo");
        lblDestino4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelTotalAPagar.add(lblDestino4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 20));

        lblPrecioTotalVuelo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPrecioTotalVuelo.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioTotalVuelo.setText("Precio");
        lblPrecioTotalVuelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelTotalAPagar.add(lblPrecioTotalVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 90, 20));

        lblPrecioTotalAsiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPrecioTotalAsiento.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioTotalAsiento.setText("Precio");
        lblPrecioTotalAsiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelTotalAPagar.add(lblPrecioTotalAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, 20));

        jPanel1.add(PanelTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 350, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 767, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelInfoPasajero;
    public javax.swing.JPanel PanelInfoVuelo;
    public javax.swing.JPanel PanelPasajero1;
    public javax.swing.JPanel PanelPasajero2;
    public javax.swing.JPanel PanelPasajero3;
    public javax.swing.JPanel PanelPasajero4;
    public javax.swing.JPanel PanelPasajero5;
    public javax.swing.JPanel PanelTotalAPagar;
    public javax.swing.JButton btnConfirmar;
    public javax.swing.JButton btnConfirmarReserva;
    public javax.swing.JButton btnEliminar1;
    public javax.swing.JButton btnEliminar2;
    public javax.swing.JButton btnEliminar3;
    public javax.swing.JButton btnEliminar4;
    public javax.swing.JButton btnEliminar5;
    public javax.swing.JButton btnGuardarPasajero;
    public javax.swing.JButton btnReservar;
    public javax.swing.JButton btnSeleccionarAsiento;
    public javax.swing.JComboBox<String> cbIdaYVuelta;
    public javax.swing.JComboBox<String> cbNacionalidad;
    public javax.swing.JComboBox<String> cbOrigen;
    public javax.swing.JComboBox<String> cbTipoDocumento;
    public com.toedter.calendar.JDateChooser dcFechaNacimiento;
    public com.toedter.calendar.JDateChooser dcFechaVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAsiento1;
    public javax.swing.JLabel lblAsiento2;
    public javax.swing.JLabel lblAsiento3;
    public javax.swing.JLabel lblAsiento4;
    public javax.swing.JLabel lblAsiento5;
    public javax.swing.JLabel lblAsientoSeleccionado;
    public javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDestino2;
    private javax.swing.JLabel lblDestino4;
    public javax.swing.JLabel lblDia1;
    public javax.swing.JLabel lblDia2;
    public javax.swing.JLabel lblHora1;
    public javax.swing.JLabel lblHora2;
    public javax.swing.JLabel lblNombreApellido1;
    public javax.swing.JLabel lblNombreApellido2;
    public javax.swing.JLabel lblNombreApellido3;
    public javax.swing.JLabel lblNombreApellido4;
    public javax.swing.JLabel lblNombreApellido5;
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblPrecioTotalAsiento;
    public javax.swing.JLabel lblPrecioTotalVuelo;
    public javax.swing.JLabel lblTotalAPagar;
    public javax.swing.JSpinner spCantidadBoletos;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumeroDocumento;
    // End of variables declaration//GEN-END:variables
}
