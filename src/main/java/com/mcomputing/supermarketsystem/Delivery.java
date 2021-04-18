/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.supermarketsystem;

import com.mcomputing.entity.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Valera
 */
public class Delivery extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form Products
     */

    public Delivery(User user) {
        initComponents();
        SelectInventory();
        this.user = user;
    }
    
    public Delivery() {
        initComponents();
        SelectInventory();    
    }

    public void SelectInventory() {

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        StaffShiftsLink = new javax.swing.JLabel();
        ProductsLink = new javax.swing.JLabel();
        InventoryLink = new javax.swing.JLabel();
        RegisterLink = new javax.swing.JLabel();
        LoginLink = new javax.swing.JLabel();
        SignUpLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 200, 10));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText(" x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Delivery Control");

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("To be coming soon...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel10)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(152, 152, 152)
                .addComponent(jLabel10)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        StaffShiftsLink.setBackground(new java.awt.Color(204, 204, 255));
        StaffShiftsLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        StaffShiftsLink.setForeground(new java.awt.Color(51, 0, 51));
        StaffShiftsLink.setText("STAFF SHIFTS");
        StaffShiftsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffShiftsLinkMouseClicked(evt);
            }
        });

        ProductsLink.setBackground(new java.awt.Color(204, 204, 255));
        ProductsLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        ProductsLink.setForeground(new java.awt.Color(51, 0, 51));
        ProductsLink.setText("PRODUCTS");
        ProductsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsLinkMouseClicked(evt);
            }
        });

        InventoryLink.setBackground(new java.awt.Color(204, 204, 255));
        InventoryLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InventoryLink.setForeground(new java.awt.Color(51, 0, 51));
        InventoryLink.setText("INVENTORY");
        InventoryLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryLinkMouseClicked(evt);
            }
        });

        RegisterLink.setBackground(new java.awt.Color(204, 204, 255));
        RegisterLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        RegisterLink.setForeground(new java.awt.Color(51, 0, 51));
        RegisterLink.setText("Create New User");
        RegisterLink.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        RegisterLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLinkMouseClicked(evt);
            }
        });

        LoginLink.setBackground(new java.awt.Color(204, 204, 255));
        LoginLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LoginLink.setForeground(new java.awt.Color(51, 0, 51));
        LoginLink.setText("Log out");
        LoginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginLinkMouseClicked(evt);
            }
        });

        SignUpLink.setBackground(new java.awt.Color(204, 204, 255));
        SignUpLink.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        SignUpLink.setForeground(new java.awt.Color(51, 0, 51));
        SignUpLink.setText("Super Market App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLink)
                    .addComponent(ProductsLink)
                    .addComponent(StaffShiftsLink)
                    .addComponent(RegisterLink)
                    .addComponent(InventoryLink)
                    .addComponent(SignUpLink, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SignUpLink)
                        .addGap(56, 56, 56)
                        .addComponent(StaffShiftsLink)
                        .addGap(32, 32, 32)
                        .addComponent(ProductsLink)
                        .addGap(35, 35, 35)
                        .addComponent(InventoryLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginLink)
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void StaffShiftsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffShiftsLinkMouseClicked
        new Shifts(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StaffShiftsLinkMouseClicked

    private void ProductsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsLinkMouseClicked
        new Products(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsLinkMouseClicked

    private void InventoryLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryLinkMouseClicked
        new Inventory(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InventoryLinkMouseClicked

    private void RegisterLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLinkMouseClicked

        if (!user.isUserAdmin()) {
            JOptionPane.showMessageDialog(this, "This option is available for Admin only");
        } else {
            new Register().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_RegisterLinkMouseClicked

    private void LoginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLinkMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginLinkMouseClicked

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
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InventoryLink;
    private javax.swing.JLabel LoginLink;
    private javax.swing.JLabel ProductsLink;
    private javax.swing.JLabel RegisterLink;
    private javax.swing.JLabel SignUpLink;
    private javax.swing.JLabel StaffShiftsLink;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
