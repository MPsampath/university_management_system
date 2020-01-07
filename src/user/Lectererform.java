/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javax.swing.JOptionPane;
import Lecterers.Lecterers_form;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lectererform {
 Connection con;

    public boolean adminLogin(Lecterers_form lecform) {
           
    
              String Lectere_User = lecform.getU_name().getText();
              String Lecterer_Pass = lecform.getLecterer_pssword1().getText();
              String numb = lecform.getMobile_num().getText();
             
            try{
            connecter c=new connecter();
            con=(Connection) connecter.getConnection();
            Statement stat = con.createStatement();
            
            String selectQuery = "SELECT * FROM `teachers` WHERE  teacher_name='"+Lectere_User+"'";
          ResultSet rs = stat.executeQuery(selectQuery);
          
          if(rs.next()==true){
        
             JOptionPane.showMessageDialog(null,"already exists User name"); 
          
          }
          else{
              
            String query = "INSERT INTO `teachers`(`teacher_name`, `teacher_password`, `Contact_number`) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
              ps.setString(1, Lectere_User);
               ps.setString(2, Lecterer_Pass);
                ps.setString(3, numb);
           
           
              if(ps.executeUpdate()>0){
                  
                 
             JOptionPane.showMessageDialog(null,"new user add");
                     
              }
              return true;
              
          }
            }catch(SQLException ex){
                System.out.println("ex");
            } return false;
}
 
    
    }
    
