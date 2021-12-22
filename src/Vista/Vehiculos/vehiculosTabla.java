/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Vehiculos;

import Controlador.ControladorBaseDeDatos;
import Modelo.TablaUsuario;
import Vista.Principal.menuPrincipal2;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class vehiculosTabla extends javax.swing.JFrame {

    /**
     * Creates new form vehiculosTabla
     */
    public vehiculosTabla() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
    }
    TablaUsuario tu = new TablaUsuario();
    DefaultTableModel modeloVehiculoPropietario;
    Controlador.ControladorBaseDeDatos cbd = new ControladorBaseDeDatos();
   // String[] columna = new String[]{"id", "marca", "modelo",
   //     "ano", "tenencia", "placas", "transmision", "created_at", "updated_at"}; //La columna nos sirve de ancla para cargar el modelo y pintarlo en la tabla
    String[] columna = new String[] {"id","nombres","apellido_pat","apellido_mat","marca","modelo","placas","transmision","created_by","created_at"}; //La columna nos sirve de ancla para cargar el modelo y pintarlo en la tabla
    
    public vehiculosTabla(TablaUsuario tu) {

        cbd.openConnection();
        modeloVehiculoPropietario = cbd.modeloVehiculoPropietario(columna);
        cbd.closeConnection();
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
        campoUsuarioActual.setText(tu.getUsername());
        this.tu = tu;

        tablaVehiculoPropietario.setModel(modeloVehiculoPropietario);

        tablaVehiculoPropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tablaVehiculoPropietario.rowAtPoint(evt.getPoint());
                int col = 0;
                if (row >= 0 && col >= 0) {
                    String valor = tablaVehiculoPropietario.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
                    campovalorID.setText(valor); //Obtengo el valor del textfield
                }
//                col = 1;
//                if (row >= 0 && col >= 0) {
//                    String valor = tablaMultas.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
//                    campoNombreMulta.setText(valor); //Obtengo el valor del textfield
//                }
//                col = 3;
//                if (row >= 0 && col >= 0) {
//                    String valor = tablaMultas.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
//                    campoPrecio.setText(valor); //Obtengo el valor del textfield
//                }
            }
        });

        ((DefaultTableCellRenderer) tablaVehiculoPropietario.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void refrescarTabla() {
        cbd.openConnection();
        modeloVehiculoPropietario = cbd.modeloVehiculoPropietario(columna);
        cbd.closeConnection();
        tablaVehiculoPropietario.setModel(modeloVehiculoPropietario);
        modeloVehiculoPropietario.fireTableDataChanged();
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
        campoBuscar = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuarioActual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculoPropietario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_Eliminar = new javax.swing.JLabel();
        entrarButton = new javax.swing.JTextField();
        editar_b = new javax.swing.JLabel();
        entrarButton1 = new javax.swing.JTextField();
        agregarVehiculo = new javax.swing.JLabel();
        entrarButton2 = new javax.swing.JTextField();
        regresar_b1 = new javax.swing.JLabel();
        entrarButton3 = new javax.swing.JTextField();
        campovalorID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 500));
        setSize(new java.awt.Dimension(1400, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField2.setText(" Hacienda Juchique");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 30));

        campoBuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        campoBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 320, 30));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1400, 40));

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

        tablaVehiculoPropietario.setModel(modeloVehiculoPropietario);
        jScrollPane1.setViewportView(tablaVehiculoPropietario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1310, 190));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 144, 0));
        jLabel4.setText("Lista Vehículos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 110, 30));

        entrarButton.setEditable(false);
        entrarButton.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton.setText("Eliminar");
        entrarButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 110, 30));

        editar_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_bMouseClicked(evt);
            }
        });
        jPanel1.add(editar_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 110, 30));

        entrarButton1.setEditable(false);
        entrarButton1.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton1.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton1.setText("Editar");
        entrarButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 110, 30));

        agregarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarVehiculoMouseClicked(evt);
            }
        });
        jPanel1.add(agregarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 110, 30));

        entrarButton2.setEditable(false);
        entrarButton2.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton2.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton2.setText("Añadir Nuevo");
        entrarButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        entrarButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButton2MouseClicked(evt);
            }
        });
        jPanel1.add(entrarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 110, 30));

        regresar_b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_b1MouseClicked(evt);
            }
        });
        jPanel1.add(regresar_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 110, 30));

        entrarButton3.setEditable(false);
        entrarButton3.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton3.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton3.setText("Regresar");
        entrarButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 110, 30));

        campovalorID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(campovalorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel1.setText(" Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

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

    private void btn_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseClicked
        if (!campovalorID.getText().equals("")) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
//            JOptionPane.showMessageDialog(null,"El archivo se creo con éxito en la siguiente dirección: "+direccion+nombreNuevo);
            int dialogResult = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la fila " + campovalorID.getText() + "?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Saving code here
                //nameArchive archivoGenerado sin permiso :v
                cbd.openConnection();
                int operacionExitosa = cbd.eliminarFila(campovalorID.getText());
                cbd.closeConnection();
                if (operacionExitosa == 1) {
                    JOptionPane.showMessageDialog(null, "Los datos fueron eliminados correctamente.");
//                        this.dispose();
////                        vehiculosTabla vt = new vehiculosTabla(tu);
////                        vt.show();
                    refrescarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error, consulta con el administrador.");
//                        this.dispose();
//                        vehiculosTabla vt = new vehiculosTabla(tu);
//                        vt.show();
                    refrescarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Asegurate de estar seguro al eliminar un registro.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un ID para continuar con la eliminaci'on");
        }
    }//GEN-LAST:event_btn_EliminarMouseClicked

    private void editar_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_bMouseClicked
        // TODO add your handling code here:
        if (!campovalorID.getText().equals("")) {
            editarVehiculo ev = new editarVehiculo(tu, Integer.valueOf(campovalorID.getText()));
            ev.show();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un ID para continuar con la actualizaci'on");
        }
    }//GEN-LAST:event_editar_bMouseClicked

    private void agregarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarVehiculoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_agregarVehiculoMouseClicked

    private void regresar_b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_b1MouseClicked
        // TODO add your handling code here:
        menuPrincipal2 mP2 = new menuPrincipal2(tu);
        mP2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresar_b1MouseClicked

    private void entrarButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButton2MouseClicked
        // TODO add your handling code here:
        agregarNuevoAuto ana = new agregarNuevoAuto(tu);
        ana.show();
        this.dispose();
    }//GEN-LAST:event_entrarButton2MouseClicked

    private void campoBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyTyped
        // TODO add your handling code here:
        cbd.openConnection();
        modeloVehiculoPropietario = cbd.modeloVehiculoPropietarioBusqueda(columna, campoBuscar.getText());
        cbd.closeConnection();
        tablaVehiculoPropietario.setModel(modeloVehiculoPropietario);
        modeloVehiculoPropietario.fireTableDataChanged();
    }//GEN-LAST:event_campoBuscarKeyTyped

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
            java.util.logging.Logger.getLogger(vehiculosTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehiculosTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehiculosTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehiculosTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehiculosTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarVehiculo;
    private javax.swing.JLabel btn_Eliminar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel campoUsuarioActual;
    private javax.swing.JLabel campovalorID;
    private javax.swing.JLabel editar_b;
    private javax.swing.JTextField entrarButton;
    private javax.swing.JTextField entrarButton1;
    private javax.swing.JTextField entrarButton2;
    private javax.swing.JTextField entrarButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel regresar_b1;
    private javax.swing.JTable tablaVehiculoPropietario;
    // End of variables declaration//GEN-END:variables
}
