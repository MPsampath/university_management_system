/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Students.Student_Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sampath
 */
public class Studentlogin {
    Connection con;

    public boolean studentlogin(Student_Login student_login ) {
       
                String stu_id = student_login.getStudent_num().getText();
                String stu_pass = student_login.getStudent_Password().getText();
             
              PreparedStatement ps;
              ResultSet rs;
              
              String selectQuery = "SELECT * FROM `students_form` WHERE `student_id`=? AND`student_password`=? ";
               try{
             connecter c=new connecter();
            con=(Connection) connecter.getConnection();
            Statement stat = con.createStatement();
            ps = con.prepareStatement(selectQuery);
            ps.setString(1, stu_id);
            ps.setString(2, stu_pass);
            rs = ps.executeQuery();
            
            
          
          if(rs.next()){
        
         
        return true;
         
          }
          else{
              
               JOptionPane.showMessageDialog(null,"Incorect ID or Password");
     
          }
            }catch(SQLException ex){
                System.out.println("ex");
            }
        return false;
    
    }
    
}
