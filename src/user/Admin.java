package user;

import javax.swing.JOptionPane;
import ums.Admin_login;

public class Admin {
    
   

    public boolean adminLogin(Admin_login admin_login) {
       String username = admin_login.getUser_Admin().getText();
       String password = admin_login.getAdmin_Password().getText();
       
       if(username.equals("admin") && password.equals("admin")){
           admin_login.setUser_Admin("");
           admin_login.setAdmin_Password("");
            return true;

           }
          else{
            admin_login.setUser_Admin("");
            admin_login.setAdmin_Password("");
            JOptionPane.showMessageDialog(null,"incorect detail");
            return false;

            }
       
        
    }
    
    
    
}
