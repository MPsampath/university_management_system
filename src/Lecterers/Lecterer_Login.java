
package Lecterers;


import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ums.Home_page;
import user.Lectererlogin;

public class Lecterer_Login extends javax.swing.JFrame {

 
 
    public Lecterer_Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Lecterer_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Lecterer_Password = new javax.swing.JPasswordField();
        Lecterer_Button2 = new javax.swing.JButton();
        Lecterer_Button3 = new javax.swing.JButton();
        Lecterers_lable1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University management system");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setText("Lecterer ID");

        jLabel2.setText("Password");

        Lecterer_Button2.setText("LOGIN");
        Lecterer_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lecterer_Button2ActionPerformed(evt);
            }
        });

        Lecterer_Button3.setText("Back");
        Lecterer_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lecterer_Button3ActionPerformed(evt);
            }
        });

        Lecterers_lable1.setText("Create new account?");
        Lecterers_lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lecterers_lable1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lecterer_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lecterer_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lecterer_Button3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lecterers_lable1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lecterer_Button2)
                                .addGap(24, 24, 24)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lecterer_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lecterer_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lecterer_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lecterer_Button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lecterers_lable1)
                .addGap(7, 7, 7))
        );

        setSize(new java.awt.Dimension(383, 220));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handli code here:
    }//GEN-LAST:event_formMousePressed

    private void Lecterer_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lecterer_Button3ActionPerformed
       Home_page home = new Home_page();
       home.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Lecterer_Button3ActionPerformed

    private void Lecterer_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lecterer_Button2ActionPerformed

        Lectererlogin lecterlog = new Lectererlogin();
        boolean lectest2 = lecterlog.leclogin(this); 
 
        if(lectest2){
        Lecterer_home lechome = new Lecterer_home();
             lechome.setVisible(true);
             this.dispose();
        }
    }//GEN-LAST:event_Lecterer_Button2ActionPerformed

    private void Lecterers_lable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lecterers_lable1MouseClicked
          Lecterers_form form = new Lecterers_form();
          form.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Lecterers_lable1MouseClicked

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
            java.util.logging.Logger.getLogger(Lecterer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecterer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecterer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecterer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecterer_Login().setVisible(true);
            }
        });
    }
    public JTextField getLecterer_Id(){
        return Lecterer_Id;
    
    }
    public JPasswordField getLecterer_Password(){
    
        return Lecterer_Password;
    }
    public void setgetLecterer_Id(String lectereid) {
        this.Lecterer_Id.setText(lectereid);
    }

    public void setLecterer_Password(String lectererpassword) {
        this.Lecterer_Password.setText(lectererpassword);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lecterer_Button2;
    private javax.swing.JButton Lecterer_Button3;
    private javax.swing.JTextField Lecterer_Id;
    private javax.swing.JPasswordField Lecterer_Password;
    private javax.swing.JLabel Lecterers_lable1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
