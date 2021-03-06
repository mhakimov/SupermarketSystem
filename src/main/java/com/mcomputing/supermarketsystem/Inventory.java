/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.supermarketsystem;

import com.mcomputing.entity.User;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valera
 */
public class Inventory extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form Products
     */

    public Inventory(User user) {
        initComponents();
        SelectInventory();
        this.user = user;
    }

    public Inventory() {
        initComponents();
        SelectInventory();
        this.user = user;
    }

    public void SelectInventory() {

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        INV_CATEGORY = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SignUpLink = new javax.swing.JLabel();
        StaffShiftsLink = new javax.swing.JLabel();
        ProductsLink = new javax.swing.JLabel();
        DeliveryLink = new javax.swing.JLabel();
        RegisterLink = new javax.swing.JLabel();
        LoginLink = new javax.swing.JLabel();

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
        jLabel4.setText("Inventory Control");

        INV_CATEGORY.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        INV_CATEGORY.setForeground(new java.awt.Color(51, 0, 51));
        INV_CATEGORY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Raw Materials", "Work-in-progress", "Finished Goods", "MRO" }));

        jLabel11.setBackground(new java.awt.Color(204, 204, 255));
        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("Category");

        InventoryTable.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Quantity", "Category"
            }
        ));
        InventoryTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        InventoryTable.setSelectionBackground(new java.awt.Color(255, 200, 10));
        InventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InventoryTable);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("List of Inventory");

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
                        .addGap(187, 187, 187)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(44, 44, 44)
                                .addComponent(INV_CATEGORY, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(84, 84, 84)
                .addComponent(jLabel10)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(INV_CATEGORY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        SignUpLink.setBackground(new java.awt.Color(204, 204, 255));
        SignUpLink.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        SignUpLink.setForeground(new java.awt.Color(51, 0, 51));
        SignUpLink.setText("Super Market App");

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

        DeliveryLink.setBackground(new java.awt.Color(204, 204, 255));
        DeliveryLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        DeliveryLink.setForeground(new java.awt.Color(51, 0, 51));
        DeliveryLink.setText("DELIVERY");
        DeliveryLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryLinkMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLink)
                    .addComponent(ProductsLink)
                    .addComponent(StaffShiftsLink)
                    .addComponent(RegisterLink)
                    .addComponent(DeliveryLink)
                    .addComponent(SignUpLink, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignUpLink)
                .addGap(56, 56, 56)
                .addComponent(StaffShiftsLink)
                .addGap(32, 32, 32)
                .addComponent(ProductsLink)
                .addGap(35, 35, 35)
                .addComponent(DeliveryLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginLink)
                .addGap(54, 54, 54))
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

    private void InventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryTableMouseClicked

        DefaultTableModel defaultTableModel = (DefaultTableModel) InventoryTable.getModel();
        int myIndex = InventoryTable.getSelectedRow();

    }//GEN-LAST:event_InventoryTableMouseClicked

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

    private void DeliveryLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryLinkMouseClicked
        new Delivery(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeliveryLinkMouseClicked

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeliveryLink;
    private javax.swing.JComboBox<String> INV_CATEGORY;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JLabel LoginLink;
    private javax.swing.JLabel ProductsLink;
    private javax.swing.JLabel RegisterLink;
    private javax.swing.JLabel SignUpLink;
    private javax.swing.JLabel StaffShiftsLink;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
