/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Licencias;

import Modelo.TablaTipoLicencia;
import Vista.Principal.menuPrincipal2;
import Modelo.TablaUsuario;
import java.sql.Timestamp;
import java.time.Instant;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
/**
 *
 * @author Usuario
 */
public class licenciasLista extends javax.swing.JFrame {

    /**
     * Creates new form licenciasLista
     */
    TablaUsuario tbu = new TablaUsuario();
    TablaTipoLicencia ttl = new TablaTipoLicencia();
    int idTipoLicencia = 0;
    public licenciasLista() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
    }
    
    public licenciasLista(TablaUsuario tbu) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
        this.tbu = tbu;
        campoUsuarioActual.setText(tbu.getUsername());
        ButtonGroup bg = new ButtonGroup();
        bg.add(btnTipoC);
        bg.add(btnTipoB);
        bg.add(btnTipoA);
        bg.add(btnTipoD);
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
        btnAceptar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuarioActual = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        campoAceptar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTipoC = new javax.swing.JRadioButton();
        btnTipoA = new javax.swing.JRadioButton();
        btnTipoB = new javax.swing.JRadioButton();
        btnTipoD = new javax.swing.JRadioButton();
        regresar_b1 = new javax.swing.JLabel();
        regresa1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 110, 30));

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

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 750, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextField2.setText(" Hacienda Juchique");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        campoAceptar.setEditable(false);
        campoAceptar.setBackground(new java.awt.Color(191, 144, 0));
        campoAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        campoAceptar.setForeground(new java.awt.Color(255, 255, 255));
        campoAceptar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoAceptar.setText("Aceptar");
        campoAceptar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(campoAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 110, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 144, 0));
        jLabel4.setText("Seleccionar Tipo de Licencia (Nueva)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        btnTipoC.setText("Licencia Tipo C: $1,530.00");
        jPanel1.add(btnTipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        btnTipoA.setText("Licencia Tipo A: $1,858.00");
        jPanel1.add(btnTipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnTipoB.setText("Licencia Tipo B: $1,748.00");
        btnTipoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoBActionPerformed(evt);
            }
        });
        jPanel1.add(btnTipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        btnTipoD.setText("Licencia Tipo D: $1,093.00");
        jPanel1.add(btnTipoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        regresar_b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_b1MouseClicked(evt);
            }
        });
        jPanel1.add(regresar_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 110, 30));

        regresa1.setEditable(false);
        regresa1.setBackground(new java.awt.Color(191, 144, 0));
        regresa1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        regresa1.setForeground(new java.awt.Color(255, 255, 255));
        regresa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regresa1.setText("Regresar");
        regresa1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(regresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 110, 30));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String conceptoPago = "";
        String precioLicencia = "";
        String tipoLicencia = "";
        if(btnTipoA.isSelected()){
            conceptoPago = "Comprobante de pago para adquirir la licencia vehicular de tipo A en el estado de Veracruz.";
            precioLicencia = "$1,858.00";
            tipoLicencia = "Nueva licencia tipo A";
            idTipoLicencia = 1;
        }
        if(btnTipoB.isSelected()){
            conceptoPago = "Comprobante de pago para adquirir la licencia vehicular de tipo B en el estado de Veracruz.";
            precioLicencia = "$1,748.00";
            tipoLicencia = "Nueva licencia tipo B";
            idTipoLicencia = 2;
        }
        if(btnTipoC.isSelected()){
            conceptoPago = "Comprobante de pago para adquirir la licencia vehicular de tipo C en el estado de Veracruz.";
            precioLicencia = "$1,530.00";
            tipoLicencia = "Nueva licencia tipo C";
            idTipoLicencia = 3;
        }
        if(btnTipoD.isSelected()){
            conceptoPago = "Comprobante de pago para adquirir la licencia vehicular de tipo D en el estado de Veracruz.";
            precioLicencia = "$1,093.00";
            tipoLicencia = "Nueva licencia tipo D";
            idTipoLicencia = 4;
        }
        Timestamp instant= Timestamp.from(Instant.now());  //Toma la información de hoy
        ttl.setId(idTipoLicencia);
        ttl.setConcepto_cobro(conceptoPago);
        ttl.setTipo_licencia(tipoLicencia);
        ttl.setCosto(precioLicencia);
        ttl.setCreated_by(tbu.getUsername());
        ttl.setCreated_at(instant);
        ttl.setUpdated_at(instant);
        //Esto podria agilizarse pero al ser solo 4 casos de prueba no es necesario
        agregarLicencia alic = new agregarLicencia(tbu,ttl);
        alic.show();
        this.dispose();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void regresar_b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_b1MouseClicked
        // TODO add your handling code here:
        menuPrincipal2 mP2 = new menuPrincipal2(tbu);
        mP2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresar_b1MouseClicked

    private void btnTipoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTipoBActionPerformed

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
//            java.util.logging.Logger.getLogger(licenciasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(licenciasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(licenciasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(licenciasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new licenciasLista().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JRadioButton btnTipoA;
    private javax.swing.JRadioButton btnTipoB;
    private javax.swing.JRadioButton btnTipoC;
    private javax.swing.JRadioButton btnTipoD;
    private javax.swing.JTextField campoAceptar;
    private javax.swing.JLabel campoUsuarioActual;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField regresa1;
    private javax.swing.JLabel regresar_b1;
    // End of variables declaration//GEN-END:variables
}
