package ums;

import javax.swing.*;
import user.Admin;

/**
 *
 * @author sampath
 */
public class Admin_login extends javax.swing.JFrame {


    
    public Admin_login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        User_Admin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Admin_Button2 = new javax.swing.JButton();
        Admin_Password = new javax.swing.JPasswordField();
        Admin_Button3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University management system");
        setBackground(new java.awt.Color(0, 255, 102));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setText("Admin");

        jLabel2.setText("Password");

        Admin_Button2.setText("LOGIN");
        Admin_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Button2ActionPerformed(evt);
            }
        });

        Admin_Button3.setText("Back");
        Admin_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Admin_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Admin_Button2)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Admin_Button3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Admin_Button3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Admin_Button2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(331, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Button3ActionPerformed
       Home_page homp = new Home_page();
       homp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Admin_Button3ActionPerformed

    private void Admin_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Button2ActionPerformed
       
        Admin adminImpl =  new Admin();
        boolean test = adminImpl.adminLogin(this);
        
        if (test) {            
        this.dispose();       
            Admin_Home adhome = new Admin_Home();
            adhome.setVisible(true);    
        }
        
           

    }//GEN-LAST:event_Admin_Button2ActionPerformed

   
    public static void main(String[] args){
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    public JPasswordField getAdmin_Password() {
        return Admin_Password;
    }

    public JTextField getUser_Admin() {
        return User_Admin;
    }

    public void setAdmin_Password(String adminPassword) {
        this.Admin_Password.setText(adminPassword);
    }

    public void setUser_Admin(String adminUserName) {
        this.User_Admin.setText(adminUserName);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Button2;
    private javax.swing.JButton Admin_Button3;
    private javax.swing.JPasswordField Admin_Password;
    private javax.swing.JTextField User_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
