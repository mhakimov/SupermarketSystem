/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.supermarketsystem;

import com.mcomputing.entity.User;
import com.mcomputing.services.UserRequest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

     User user;
    /**
     * Creates new form Login
     */   
    public Register(User user) {
        initComponents();
        this.user = user;
    }

    public Register() {
        initComponents();
        this.user = user;
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LoginLink = new javax.swing.JLabel();
        SignUpLink = new javax.swing.JLabel();
        StaffShiftsLink = new javax.swing.JLabel();
        ProductsLink = new javax.swing.JLabel();
        InventoryLink = new javax.swing.JLabel();
        DeliveryLink = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UsernameTf = new javax.swing.JTextField();
        AccessRightsTf = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        PasswordTf = new javax.swing.JPasswordField();
        ConfirmPwTf = new javax.swing.JPasswordField();
        CloseBtn1 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Supermarket Store");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 200, 10));

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

        DeliveryLink.setBackground(new java.awt.Color(204, 204, 255));
        DeliveryLink.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        DeliveryLink.setForeground(new java.awt.Color(51, 0, 51));
        DeliveryLink.setText("DELIVERY");
        DeliveryLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignUpLink)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductsLink)
                    .addComponent(DeliveryLink)
                    .addComponent(InventoryLink)
                    .addComponent(StaffShiftsLink)
                    .addComponent(LoginLink))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(SignUpLink)
                .addGap(38, 38, 38)
                .addComponent(ProductsLink)
                .addGap(32, 32, 32)
                .addComponent(StaffShiftsLink)
                .addGap(36, 36, 36)
                .addComponent(InventoryLink)
                .addGap(31, 31, 31)
                .addComponent(DeliveryLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLink)
                .addGap(56, 56, 56))
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Password");

        UsernameTf.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        UsernameTf.setForeground(new java.awt.Color(51, 0, 51));
        UsernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTfActionPerformed(evt);
            }
        });

        AccessRightsTf.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        AccessRightsTf.setForeground(new java.awt.Color(51, 0, 51));
        AccessRightsTf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Store Manager", "Admin" }));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Sign Up");

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Access rights");

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Username");

        SignUpBtn.setBackground(new java.awt.Color(250, 200, 10));
        SignUpBtn.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(51, 0, 51));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.setBorderPainted(false);
        SignUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseClicked(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(51, 0, 51));
        ClearBtn.setText("Clear");
        ClearBtn.setBorderPainted(false);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Confirm Password");

        PasswordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccessRightsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmPwTf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccessRightsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(UsernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ConfirmPwTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CloseBtn1.setBackground(new java.awt.Color(204, 204, 255));
        CloseBtn1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        CloseBtn1.setForeground(new java.awt.Color(51, 0, 51));
        CloseBtn1.setText(" x");
        CloseBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CloseBtn1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseClicked
        if (UsernameTf.getText().isEmpty() || PasswordTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Some information is missing");
        } else {
            if (PasswordTf.getText().equals(ConfirmPwTf.getText())) {
                try {

                    boolean isSysAdmin = false;
                    boolean isStoreManager = false;
                    if (AccessRightsTf.getSelectedItem().toString().equals("Admin")) {
                        isSysAdmin = true;
                    } else if (AccessRightsTf.getSelectedItem().toString().equals("Store Manager")) {
                        isStoreManager = true;
                    }

                    String jsonInputString = String.format(
                            "{\"userName\": \"%s\", \"userPassword\":\"%s\", \"userAdmin\": %s, \"userManager\":%s}",
                            UsernameTf.getText(), PasswordTf.getText(), isSysAdmin, isStoreManager);
                    UserRequest request = new UserRequest();
                    String response = request.sendRegisterUserRequest(jsonInputString);

                    JOptionPane.showMessageDialog(this, response);

                } catch (Exception ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
            }
        }
    }//GEN-LAST:event_SignUpBtnMouseClicked


    private void PasswordTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTfActionPerformed

    private void LoginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLinkMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginLinkMouseClicked

    private void CloseBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBtn1MouseClicked

    private void UsernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTfActionPerformed

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

    private void DeliveryLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryLinkMouseClicked
        new Delivery(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeliveryLinkMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccessRightsTf;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseBtn1;
    private javax.swing.JPasswordField ConfirmPwTf;
    private javax.swing.JLabel DeliveryLink;
    private javax.swing.JLabel InventoryLink;
    private javax.swing.JLabel LoginLink;
    private javax.swing.JPasswordField PasswordTf;
    private javax.swing.JLabel ProductsLink;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel SignUpLink;
    private javax.swing.JLabel StaffShiftsLink;
    private javax.swing.JTextField UsernameTf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
