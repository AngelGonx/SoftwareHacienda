/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Licencias;

import Vista.multas.*;
import Vista.Principal.menuPrincipal2;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class licenciasTabla extends javax.swing.JFrame {

    /**
     * Creates new form multasTabla
     */
    public licenciasTabla() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/logoHacienda.png")).getImage());
        
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        crearMulta_b = new javax.swing.JLabel();
        entrarButton = new javax.swing.JTextField();
        editar_b = new javax.swing.JLabel();
        entrarButton1 = new javax.swing.JTextField();
        crearForMulta_b = new javax.swing.JLabel();
        entrarButton2 = new javax.swing.JTextField();
        regresar_b = new javax.swing.JLabel();
        entrarButton3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Hacienda Juchique");

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
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 750, 40));

        jPanel2.setBackground(new java.awt.Color(255, 225, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/iconoPerfilPeque_1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 50));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField1.setText(" Precio");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 210, 30));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField4.setText(" ID");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, -1));

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField5.setText(" Nombre de la licencia");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 144, 0));
        jLabel1.setText("Tipo Licencias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 390, 200));

        crearMulta_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMulta_bMouseClicked(evt);
            }
        });
        jPanel1.add(crearMulta_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, 30));

        entrarButton.setEditable(false);
        entrarButton.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton.setText("Crear Tipo Licencia");
        entrarButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, 30));

        editar_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_bMouseClicked(evt);
            }
        });
        jPanel1.add(editar_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 30));

        entrarButton1.setEditable(false);
        entrarButton1.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton1.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton1.setText("Editar");
        entrarButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 30));

        crearForMulta_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearForMulta_bMouseClicked(evt);
            }
        });
        jPanel1.add(crearForMulta_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 30));

        entrarButton2.setEditable(false);
        entrarButton2.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton2.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton2.setText("Crear formato de Tipo Licencia");
        entrarButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 30));

        regresar_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_bMouseClicked(evt);
            }
        });
        jPanel1.add(regresar_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 30));

        entrarButton3.setEditable(false);
        entrarButton3.setBackground(new java.awt.Color(191, 144, 0));
        entrarButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        entrarButton3.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrarButton3.setText("Regresar");
        entrarButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.add(entrarButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearMulta_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMulta_bMouseClicked
    }//GEN-LAST:event_crearMulta_bMouseClicked

    private void editar_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_bMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_bMouseClicked

    private void crearForMulta_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearForMulta_bMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearForMulta_bMouseClicked

    private void regresar_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_bMouseClicked
        menuPrincipal2 mP2 = new menuPrincipal2();
        mP2.show();
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
            java.util.logging.Logger.getLogger(licenciasTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(licenciasTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(licenciasTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(licenciasTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new licenciasTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crearForMulta_b;
    private javax.swing.JLabel crearMulta_b;
    private javax.swing.JLabel editar_b;
    private javax.swing.JTextField entrarButton;
    private javax.swing.JTextField entrarButton1;
    private javax.swing.JTextField entrarButton2;
    private javax.swing.JTextField entrarButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel regresar_b;
    // End of variables declaration//GEN-END:variables
}
