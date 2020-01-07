
package user;

import Lecterers.Lecterer_Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Lectererlogin{

    Connection con;

    public boolean leclogin(Lecterer_Login lectererlogin) {
              String lec_id = lectererlogin.getLecterer_Id().getText();
              String lec_pass = lectererlogin.getLecterer_Password().getText();
             
              PreparedStatement ps;
              ResultSet rs;
              
              String selectQuery = "SELECT * FROM `teachers` WHERE`teacher_name` =? AND`teacher_password` =? ";
               try{
            connecter c=new connecter();
            con=(Connection) connecter.getConnection();
            Statement stat = con.createStatement();
            ps = con.prepareStatement(selectQuery);
            ps.setString(1, lec_id);
            ps.setString(2, lec_pass);
            rs = ps.executeQuery();
            
            
          
          if(rs.next()){
         
                 
         return true;
          }
          
          else{
              
               JOptionPane.showMessageDialog(null,"incorrect ID or Password");
     
          }
          
            }catch(SQLException ex){
                System.out.println("ex");
            }
        return false;
    }

}