/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Vehiculos;

import Controlador.ControladorBaseDeDatos;
import Modelo.TablaPropietario;
import Modelo.TablaUsuario;
import java.sql.Timestamp;
import java.time.Instant;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class editarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form editarVehiculo
     */
    TablaPropietario tbp = new TablaPropietario();
    ControladorBaseDeDatos cbd = new ControladorBaseDeDatos();
    TablaUsuario tbu = new TablaUsuario();
    int idUpdate = 0;
    public editarVehiculo(TablaUsuario tbu, int id) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
        campoUsuarioActual.setText(tbu.getUsername());
        this.tbu = tbu;
        idUpdate = id;
        cbd.openConnection();
        TablaPropietario tp = cbd.obtenerVehiculoPropietario(id);
        cbd.closeConnection();
        System.out.println(tp.toString());
        this.tbp = tp;
        campoNombres.setText(tp.getNombres());
        campoApellidoMat.setText(tp.getApellido_mat());
        campoApellidoPat.setText(tp.getApellido_pat());
        campoSexo.setSelectedItem(tp.getSexo());
        campoEdad.setValue(Integer.valueOf(tp.getEdad()));
        campoDomicilio.setText(tp.getDomicilio());
        campoLugar.setText(tp.getLugar());
        campoMarca.setText(tp.getMarca());
        campoModelo.setText(tp.getModelo());
        campoAge.setText(tp.getAge());
        campoTenencia.setText(tp.getTenencia());
        campoPlacas.setText(tp.getTenencia());
        campoNoSerie.setText(tp.getSerie());
        campoFecha.setText(tp.getFecha());
        campoTransimision.setText(tp.getTransmision());
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
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        regresar = new javax.swing.JLabel();
        editar = new javax.swing.JLabel();
        entrarButton1 = new javax.swing.JTextField();
        entrarButton = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuarioActual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoApellidoMat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoApellidoPat = new javax.swing.JTextField();
        campoLugar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoSexo = new javax.swing.JComboBox<>();
        campoEdad = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoPlacas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoModelo = new javax.swing.JTextField();
        campoNoSerie = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        campoTransimision = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        campoTenencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 750, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField2.setText(" Hacienda Juchique");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 780, 160, 30));

        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 780, 160, 30));

        entrarButton1.setEditable(false);
        entrarButton1.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton1.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton1.setText("Regresar");
        entrarButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 780, 160, 30));

        entrarButton.setEditable(false);
        entrarButton.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton.setText("Editar");
        entrarButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 780, 160, 30));

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

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 144, 0));
        jLabel4.setText("Vehículos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("  Propietario");
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Nombre(s): ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 30, 81, 30);

        campoNombres.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNombres.setToolTipText("");
        campoNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoNombres);
        campoNombres.setBounds(31, 52, 220, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Apellido materno:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 90, 119, 30);

        campoApellidoMat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApellidoMat.setToolTipText("");
        campoApellidoMat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoApellidoMat);
        campoApellidoMat.setBounds(31, 118, 220, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Domicilio:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 160, 64, 30);

        campoDomicilio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoDomicilio.setToolTipText("");
        campoDomicilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoDomicilio);
        campoDomicilio.setBounds(31, 185, 220, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Apellido paterno:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(310, 20, 170, 30);

        campoApellidoPat.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoApellidoPat.setToolTipText("");
        campoApellidoPat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoApellidoPat);
        campoApellidoPat.setBounds(308, 53, 220, 30);

        campoLugar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoLugar.setToolTipText("");
        campoLugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoLugar);
        campoLugar.setBounds(308, 185, 220, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Sexo:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(308, 94, 39, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Lugar:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(308, 155, 43, 30);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Edad:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(467, 94, 39, 30);

        campoSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro" }));
        campoSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoSexo);
        campoSexo.setBounds(310, 120, 140, 30);

        campoEdad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        campoEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(campoEdad);
        campoEdad.setBounds(470, 120, 60, 26);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 580, 240));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("   Vehículo");
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 100, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Marca:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 20, 81, 30);

        campoMarca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoMarca.setToolTipText("");
        campoMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoMarca);
        campoMarca.setBounds(31, 52, 220, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("Año:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(30, 90, 119, 30);

        campoAge.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoAge.setToolTipText("");
        campoAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoAge);
        campoAge.setBounds(31, 118, 220, 30);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("Placas:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(30, 160, 64, 30);

        campoPlacas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoPlacas.setToolTipText("");
        campoPlacas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoPlacas);
        campoPlacas.setBounds(31, 185, 220, 30);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("Modelo:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(310, 20, 52, 30);

        campoModelo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoModelo.setToolTipText("");
        campoModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoModelo);
        campoModelo.setBounds(308, 53, 220, 30);

        campoNoSerie.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNoSerie.setToolTipText("");
        campoNoSerie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoNoSerie);
        campoNoSerie.setBounds(308, 185, 220, 30);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("N. serie:");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(308, 155, 63, 30);

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setText("Fecha:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(30, 220, 46, 30);

        campoFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoFecha.setToolTipText("");
        campoFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoFecha);
        campoFecha.setBounds(30, 250, 160, 30);

        campoTransimision.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTransimision.setToolTipText("");
        campoTransimision.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoTransimision);
        campoTransimision.setBounds(310, 250, 220, 30);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Transmisión:");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(310, 220, 120, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/calendario.png"))); // NOI18N
        jPanel4.add(jLabel22);
        jLabel22.setBounds(200, 240, 40, 40);

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setText("Tenencia:");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(310, 90, 65, 30);

        campoTenencia.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTenencia.setToolTipText("");
        campoTenencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(campoTenencia);
        campoTenencia.setBounds(310, 120, 220, 30);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 580, 300));

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

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
         if(!campoNombres.getText().equals("") &&
            !campoApellidoPat.getText().equals("") &&
                !campoApellidoMat.getText().equals("") &&
                        !campoTenencia.getText().equals("") &&
                                !campoDomicilio.getText().equals("") &&
                                    !campoFecha.getText().equals("") &&
                                        !campoLugar.getText().equals("") &&
                                            !campoMarca.getText().equals("") &&
                                                !campoModelo.getText().equals("") &&
                                                    !campoNoSerie.getText().equals("") &&
                                                         !campoPlacas.getText().equals("") &&
                                                            !campoTransimision.getText().equals("")
                )   {
            
            Timestamp instant= Timestamp.from(Instant.now());
            tbp.setAge(campoAge.getText());
            tbp.setApellido_mat(campoApellidoMat.getText());
            tbp.setApellido_pat(campoApellidoPat.getText());
//            tbp.setCreated_by(campoUsuarioActual.getText());
            tbp.setDomicilio(campoDomicilio.getText());
            tbp.setEdad(String.valueOf(campoEdad.getValue()));
            tbp.setLugar(campoLugar.getText());
            tbp.setMarca(campoMarca.getText());
            tbp.setModelo(campoModelo.getText());
            tbp.setNombres(campoNombres.getText());
            tbp.setPlacas(campoPlacas.getText());
            tbp.setSexo((String) campoSexo.getSelectedItem());
            tbp.setTenencia(campoTenencia.getText());
            tbp.setTransmision(campoTransimision.getText());
            //tbp.setCreated_at(instant);
            tbp.setUpdated_at(instant);
            tbp.setFecha(campoFecha.getText());
            tbp.setSerie(campoNoSerie.getText());
            //Campos necesarios para actualizar
            tbp.setId(idUpdate);
            tbp.setUpdated_by(campoUsuarioActual.getText());
            
            cbd.openConnection();
            int operacionExitosa = cbd.updateDatosVehiculoPropietario(tbp);
            cbd.closeConnection();
            if(operacionExitosa ==  1){
                JOptionPane.showMessageDialog(null, "Los datos fueron actualizados correctamente.");
                this.dispose();
                vehiculosTabla vt = new vehiculosTabla(tbu);
                vt.show();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error, consulta con el administrador.");
                this.dispose();
                vehiculosTabla vt = new vehiculosTabla(tbu);
                vt.show();
            }
        }else{
        
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos para continuar.");
        }
    }//GEN-LAST:event_editarMouseClicked

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
//            java.util.logging.Logger.getLogger(editarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(editarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(editarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(editarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new editarVehiculo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoAge;
    private javax.swing.JTextField campoApellidoMat;
    private javax.swing.JTextField campoApellidoPat;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JSpinner campoEdad;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoLugar;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoNoSerie;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoPlacas;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField campoTenencia;
    private javax.swing.JTextField campoTransimision;
    private javax.swing.JLabel campoUsuarioActual;
    private javax.swing.JLabel editar;
    private javax.swing.JTextField entrarButton;
    private javax.swing.JTextField entrarButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}
