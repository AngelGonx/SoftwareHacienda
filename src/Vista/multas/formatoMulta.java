/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.multas;

import Controlador.ControladorBaseDeDatos;
import Controlador.ControladorUtilerias;
import Modelo.TablaMultas;
import Modelo.TablaMultasGeneradas;
import Modelo.TablaUsuario;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class formatoMulta extends javax.swing.JFrame {

    /**
     * Creates new form formatoMulta
     */
    ControladorBaseDeDatos cbd = new ControladorBaseDeDatos();
    TablaMultas tbm = new TablaMultas();
    TablaMultasGeneradas tmg = new TablaMultasGeneradas();
    TablaMultas tm = new TablaMultas();
    TablaUsuario tbu = new TablaUsuario();
    ControladorUtilerias cu = new ControladorUtilerias();
    int id = 0;
    int numeroFactura = 0;

    public formatoMulta() {
        initComponents();
    }

    public formatoMulta(TablaUsuario tbu, TablaMultas tm) {
        initComponents();
        Date dt = new Date();
        String fecha = cu.convertirFechaDict(dt);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 15); //Aumenta 15 dias el vencimiento de la factura
        dt = c.getTime();
        System.out.println("Tomorrow: " + dt);
        this.id = tm.getId();
        System.out.println(tm.getId());
        campoFechaActual.setText(fecha);
        String fechaV = cu.convertirFechaDict(dt);
        campoFechaVencimiento.setText(fechaV);
        campoConceptoPago.setText(tm.getConcepto_pago());
        campoNombreMulta.setText(tm.getNombre());
        campoTotalPagar.setText("$" + tm.getPrecio() + ".00");
        campoUsuarioActual.setText(tbu.getUsername());
        cbd.openConnection();
        numeroFactura = cbd.obtenerNumeroFactura();
        cbd.closeConnection();
        campoFactura.setText("No. Factura: " + numeroFactura);

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
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuarioActual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regresar_b = new javax.swing.JLabel();
        entrarButton = new javax.swing.JTextField();
        guardarImprimir = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        entrarButton2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        campoFechaActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoNombreMulta = new javax.swing.JTextField();
        campoFactura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoApPat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoDomicilio = new javax.swing.JTextField();
        campoApMat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        campoSerie = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoConceptoPago = new javax.swing.JTextArea();
        campoTotalPagar = new javax.swing.JTextField();
        campoFechaVencimiento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField2.setText(" Hacienda Juchique");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 750, 40));

        jPanel2.setBackground(new java.awt.Color(255, 225, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/iconoPerfilPeque_1.png"))); // NOI18N

        campoUsuarioActual.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        campoUsuarioActual.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(campoUsuarioActual, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(campoUsuarioActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 50));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Vehículo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        regresar_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_bMouseClicked(evt);
            }
        });
        jPanel1.add(regresar_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, 110, 30));

        entrarButton.setEditable(false);
        entrarButton.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton.setText("Regresar");
        entrarButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, 110, 30));

        guardarImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarImprimirMouseClicked(evt);
            }
        });
        jPanel1.add(guardarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 840, 160, 30));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setText("L.C CRISTIAN MARTÍNEZ GONZÁLEZ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, -1, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Jefe general de hacienda");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 790, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 610, 10));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setText("Oficinas de hacienda del estado en Juchique");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, -1, 30));

        entrarButton2.setEditable(false);
        entrarButton2.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton2.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton2.setText("Guardar e imprimir");
        entrarButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 840, 160, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/calendario.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        campoFechaActual.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoFechaActual.setToolTipText("");
        campoFechaActual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 160, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 144, 0));
        jLabel5.setText("Multa-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        campoNombreMulta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        campoNombreMulta.setForeground(new java.awt.Color(191, 144, 0));
        campoNombreMulta.setText("No usar cinturón de seguridad");
        campoNombreMulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoNombreMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 360, 40));

        campoFactura.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        campoFactura.setText("No. Factura: 00245");
        jPanel1.add(campoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Comprobante de infracción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Marca:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 30));

        campoNombres.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNombres.setToolTipText("");
        campoNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 220, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("Apellido paterno:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 30));

        campoApPat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApPat.setToolTipText("");
        campoApPat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 220, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("Apellido materno:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 30));

        campoDomicilio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoDomicilio.setToolTipText("");
        campoDomicilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 220, 30));

        campoApMat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApMat.setToolTipText("");
        campoApMat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 220, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("Domicilio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 30));

        campoPlaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoPlaca.setToolTipText("");
        campoPlaca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 220, 30));

        campoSerie.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoSerie.setToolTipText("");
        campoSerie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 180, 30));

        campoMarca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoMarca.setToolTipText("");
        campoMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 220, 30));

        campoModelo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoModelo.setToolTipText("");
        campoModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 180, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Propietario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Nombres: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 30));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setText("Placa:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("Modelo:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setText("N. serie:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 60, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("  Concepto de pago");
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, -1));

        campoConceptoPago.setColumns(20);
        campoConceptoPago.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoConceptoPago.setRows(5);
        campoConceptoPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(campoConceptoPago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 590, 60));

        campoTotalPagar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoTotalPagar.setText(" $868.80");
        campoTotalPagar.setToolTipText("");
        campoTotalPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 180, 30));

        campoFechaVencimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoFechaVencimiento.setText(" 28-sep-2021");
        campoFechaVencimiento.setToolTipText("");
        campoFechaVencimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 180, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 610, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 440, 10));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Podrá realizar su pago en las siguientes instituciones:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 430, 40));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Banorte");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Santander");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 20));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Banamex");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 20));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("BBVA");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel28.setText("Oxxo");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, 20));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel29.setText("Banco Azteca / Elektra");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 20));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel30.setText("Farmacias del ahorro");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 20));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel31.setText("Walmart");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 460, 130));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 790, 340, 10));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel23.setText("Límite de pago:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 140, 30));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel24.setText("Total a pagar:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresar_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_bMouseClicked

    }//GEN-LAST:event_regresar_bMouseClicked

    private void guardarImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarImprimirMouseClicked
        int value = 0;
        Timestamp instant= Timestamp.from(Instant.now());
        int mul = id;
        String nombreMulta = campoNombreMulta.getText();
        String nombres = campoNombres.getText();
        String apPat = campoApPat.getText();
        String apMat = campoApMat.getText();
        String domicilio = campoDomicilio.getText();
        String placa = campoPlaca.getText();
        String serie = campoSerie.getText();
        String marca = campoMarca.getText();
        String modelo = campoModelo.getText();
        String totalPagar = campoTotalPagar.getText();
        String limite_pago = campoFechaVencimiento.getText();
        String fechaVenc = campoFechaVencimiento.getText();

        if (nombreMulta == "") {
            value++;
        }
        if (limite_pago == "") {
            value++;
        }
        if (nombres == "") {
            value++;
        }
        if (apPat == "") {
            value++;
        }
        if (apMat == "") {
            value++;
        }
        if (domicilio == "") {
            value++;
        }
        if (placa == "") {
            value++;
        }
        if (serie == "") {
            value++;
        }
        if (marca == "") {
            value++;
        }
        if (modelo == "") {
            value++;
        }
        if (totalPagar == "") {
            value++;
        }
        if (fechaVenc == "") {
            value++;
        }

        if (value > 0) {
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los datos.");
        } else {
            tmg.setId(numeroFactura);//Aqui faltaba el numero de factura
            tmg.setFolio(nombreMulta);
            tmg.setCreated_at(instant);
            tmg.setUpdated_at(instant);
            tmg.setNombres(nombres);
            tmg.setApellido_pat(apPat);
            tmg.setApellido_mat(apMat);
            tmg.setDomicilio(domicilio);
            tmg.setPlaca_vehiculo(placa);
            tmg.setNserie_vehiculo(serie);
            tmg.setMarca_vehiculo(marca);
            tmg.setModelo_vehiculo(modelo);
            tmg.setLimite_pago(limite_pago);
            tmg.setCreated_by(tbu.getUsername());
            tmg.setId_multa(mul);

            cbd.openConnection();
            int operacionExitosa = cbd.formatoMulta(tmg);
            cbd.closeConnection();
            if(operacionExitosa == 1){
                JOptionPane.showMessageDialog(null, "La factura fue generada exitosamente.");
                this.dispose();
                //  Aqui ira el proceso del reporte.
            }
            else{
                JOptionPane.showMessageDialog(null, "La factura no fue generada, verifica con el administrador.");
                this.dispose();
            }
        }

    }//GEN-LAST:event_guardarImprimirMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(formatoMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(formatoMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(formatoMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(formatoMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new formatoMulta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApMat;
    private javax.swing.JTextField campoApPat;
    private javax.swing.JTextArea campoConceptoPago;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JLabel campoFactura;
    private javax.swing.JTextField campoFechaActual;
    private javax.swing.JTextField campoFechaVencimiento;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoNombreMulta;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoSerie;
    private javax.swing.JTextField campoTotalPagar;
    private javax.swing.JLabel campoUsuarioActual;
    private javax.swing.JTextField entrarButton;
    private javax.swing.JTextField entrarButton2;
    private javax.swing.JLabel guardarImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel regresar_b;
    // End of variables declaration//GEN-END:variables
}
