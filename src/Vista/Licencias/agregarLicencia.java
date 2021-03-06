/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Licencias;

import Controlador.ControladorBaseDeDatos;
import Controlador.ControladorUtilerias;
import Modelo.TablaLicenciaGenerada;
import Modelo.TablaTipoLicencia;
import Modelo.TablaUsuario;
import Vista.Principal.menuPrincipal2;
import Vista.multas.formatoMulta;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Usuario
 */
public class agregarLicencia extends javax.swing.JFrame {

    /**
     * Creates new form agregarLicencia
     */
    TablaUsuario tbu = new TablaUsuario();
    TablaTipoLicencia ttl = new TablaTipoLicencia();
    TablaLicenciaGenerada tlg = new TablaLicenciaGenerada();
    ControladorBaseDeDatos cbd = new ControladorBaseDeDatos();
    public agregarLicencia() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
    }
    public agregarLicencia(TablaUsuario tbu,TablaTipoLicencia ttl) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
        this.tbu = tbu;
        this.ttl = ttl;
        campoUsuarioActual.setText(tbu.getUsername());
        campoCosto.setText(ttl.getCosto());
        campoConceptoCobro.setText(ttl.getConcepto_cobro());
        campoTipoLicencia.setText(ttl.getConcepto_cobro());
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
        jLabel1 = new javax.swing.JLabel();
        campoTipoLicencia = new javax.swing.JLabel();
        guardarImprimir = new javax.swing.JLabel();
        entrarButton = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoApellidoPaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoFechaNacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDomicilio = new javax.swing.JTextField();
        campoApellidoMaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoCP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        campoCelular = new javax.swing.JTextField();
        campoLugar = new javax.swing.JTextField();
        campoCosto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoConceptoCobro = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        regresar_b = new javax.swing.JLabel();
        entrarButton1 = new javax.swing.JTextField();

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 50));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Nombres: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        campoTipoLicencia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoTipoLicencia.setText("Nueva licencia tipo A");
        jPanel1.add(campoTipoLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 150, -1));

        guardarImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarImprimirMouseClicked(evt);
            }
        });
        jPanel1.add(guardarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 810, 160, 30));

        entrarButton.setEditable(false);
        entrarButton.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton.setText("Guardar e imprimir");
        entrarButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 810, 160, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 144, 0));
        jLabel5.setText("Licencias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        campoNombres.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNombres.setToolTipText("");
        campoNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 220, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Apellido paterno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

        campoApellidoPaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApellidoPaterno.setToolTipText("");
        campoApellidoPaterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 220, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Apellido materno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, 30));

        campoFechaNacimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoFechaNacimiento.setToolTipText("");
        campoFechaNacimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 160, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 310, 160, 30));

        campoDomicilio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoDomicilio.setToolTipText("");
        campoDomicilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 220, 30));

        campoApellidoMaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApellidoMaterno.setToolTipText("");
        campoApellidoMaterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Domicilio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, 30));

        campoCP.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCP.setToolTipText("");
        campoCP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 140, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Edad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("CP:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 30));

        campoEdad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 60, 30));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("Lugar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, 30));

        campoCelular.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCelular.setToolTipText("");
        campoCelular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 220, 30));

        campoLugar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoLugar.setToolTipText("");
        campoLugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(campoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 220, 30));

        campoCosto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoCosto.setText("1,801.00");
        jPanel1.add(campoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("   Concepto de cobro");
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 150, -1));

        campoConceptoCobro.setColumns(20);
        campoConceptoCobro.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoConceptoCobro.setRows(5);
        campoConceptoCobro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(campoConceptoCobro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 500, 120));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Celular:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, 30));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setText("L.C CRISTIAN MART??NEZ GONZ??LEZ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, -1, 30));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Costo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, -1, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Jefe general de hacienda");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 770, 340, 20));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setText("Oficinas de hacienda del estado en Juchique");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, -1, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/calendario.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        regresar_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_bMouseClicked(evt);
            }
        });
        jPanel1.add(regresar_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, 110, 30));

        entrarButton1.setEditable(false);
        entrarButton1.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton1.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton1.setText("Regresar");
        entrarButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, 110, 30));

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

    private void guardarImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarImprimirMouseClicked
        if(!campoNombres.getText().equals("") && !campoApellidoMaterno.getText().equals("") && !campoApellidoPaterno.getText().equals("")
                && !campoCP.getText().equals("") && !campoCelular.getText().equals("") && !campoLugar.getText().equals("") &&
                !campoDomicilio.getText().equals("") && !campoFechaNacimiento.getText().equals("")){
            
            Timestamp instant= Timestamp.from(Instant.now());
            tlg.setNombres(campoNombres.getText());
            tlg.setApellido_mat(campoApellidoMaterno.getText());
            tlg.setApellido_pat(campoApellidoPaterno.getText());
            tlg.setCelular(campoCelular.getText());
            tlg.setDomicilio(campoDomicilio.getText());
            tlg.setCrated_by(tbu.getUsername());
            tlg.setCp(campoCP.getText());
            tlg.setFecha_nac(campoFechaNacimiento.getText());
            tlg.setId_tipo_licencia(ttl.getId());
            tlg.setEdad(String.valueOf(campoEdad.getValue()));
            tlg.setCreated_at(instant);
            tlg.setUpdated_at(instant);
            tlg.setLugar(campoLugar.getText());
            //Se realiza el insert de los campos de las licencias y despues se imprime el documento
            cbd.openConnection();
            int operacionExitosa = cbd.crearLicenciaGenerada(tlg);
            int numeroFactura = cbd.obtenerNFacturaLicencia();
            cbd.closeConnection();
            if(operacionExitosa == 1){
                JOptionPane.showMessageDialog(null, "Licencia Guardada Exitosamente.");
                ControladorUtilerias cu = new ControladorUtilerias();
                String fechaactual = cu.convertirFechaDict(new Date());
                String [] datosDocto = new String[15];
                datosDocto[0] = String.valueOf(campoUsuarioActual.getText()); //#usuario#
                datosDocto[1] = String.valueOf(fechaactual); //#fecha#
                datosDocto[2] = String.valueOf(numeroFactura); //#nofactura#
                datosDocto[3] = String.valueOf(campoConceptoCobro.getText()); //##licencia##
                datosDocto[4] = String.valueOf(campoNombres.getText()); //#nombres#
                datosDocto[5] = String.valueOf(campoApellidoPaterno.getText()); //#apellidopat#
                datosDocto[6] = String.valueOf(campoApellidoMaterno.getText()); //#apellidomat#
                datosDocto[7] = String.valueOf(campoDomicilio.getText()); //#domicilio#
                datosDocto[8] = String.valueOf(campoEdad.getValue()); //#edad#
                datosDocto[9] = String.valueOf(campoFechaNacimiento.getText()); //#fechanac#
                datosDocto[10] = String.valueOf(campoCP.getText()); //#cp#
                datosDocto[11] = String.valueOf(campoLugar.getText()); //#lugar#
                datosDocto[12] = String.valueOf(campoCelular.getText()); //#celular#
                datosDocto[13] = String.valueOf(campoConceptoCobro.getText()); //#concepto#
                datosDocto[14] = String.valueOf(campoCosto.getText()); //#total#
                String [] datosReemplazo = new String[15];
                datosReemplazo[0] = "#usuario#";
                datosReemplazo[1] = "#fecha#";
                datosReemplazo[2] = "#nofactura#";
                datosReemplazo[3] = "#licencia#";
                datosReemplazo[4] = "#nombres#";
                datosReemplazo[5] = "#apellidopat#";
                datosReemplazo[6] = "#apellidomat#";
                datosReemplazo[7] = "#domicilio#";
                datosReemplazo[8] = "#edad#";
                datosReemplazo[9] = "#fechanac#";
                datosReemplazo[10] = "#codigo#";
                datosReemplazo[11] = "#lugar#";
                datosReemplazo[12] = "#celular#";
                datosReemplazo[13] = "#concepto#";
                datosReemplazo[14]= "#total#";
                //  Aqui ira el proceso del reporte.
                System.out.println(Arrays.toString(datosReemplazo));
                System.out.println(Arrays.toString(datosDocto));
                
                try {
                    cu.creaDocContrato(datosReemplazo, datosDocto, 2, String.valueOf(numeroFactura));
                } catch (IOException ex) {
                    Logger.getLogger(formatoMulta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidFormatException ex) {
                    Logger.getLogger(agregarLicencia.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                this.dispose();
                menuPrincipal2 mp2 = new menuPrincipal2(tbu);
                mp2.show();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo guardar la multa. Consulta al administrador.");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos para continuar.");
        }
    }//GEN-LAST:event_guardarImprimirMouseClicked

    private void regresar_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_bMouseClicked
        menuPrincipal2 mp = new menuPrincipal2(tbu);
        mp.show();
        this.dispose();
    }//GEN-LAST:event_regresar_bMouseClicked

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
            java.util.logging.Logger.getLogger(agregarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApellidoMaterno;
    private javax.swing.JTextField campoApellidoPaterno;
    private javax.swing.JTextField campoCP;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextArea campoConceptoCobro;
    private javax.swing.JLabel campoCosto;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JSpinner campoEdad;
    private javax.swing.JTextField campoFechaNacimiento;
    private javax.swing.JTextField campoLugar;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JLabel campoTipoLicencia;
    private javax.swing.JLabel campoUsuarioActual;
    private javax.swing.JTextField entrarButton;
    private javax.swing.JTextField entrarButton1;
    private javax.swing.JLabel guardarImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel regresar_b;
    // End of variables declaration//GEN-END:variables
}
