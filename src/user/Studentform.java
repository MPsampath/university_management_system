/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import Students.Student_form;
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
public class Studentform {
Connection con;
    public boolean studentForm(Student_form student_form) {
        String student_Id = student_form.getStu_Id().getText();
        String student_Name = student_form.getStu_name().getText();
        String student_Password = student_form.getStu_password().getText();
        String student_Mobile = student_form.getStu_num().getText();
        
         try{
            connecter c=new connecter();
            con=(Connection) connecter.getConnection();
           Statement stat = con.createStatement();
            
            String student_selectQuery = "SELECT * FROM `students_form` WHERE  student_id='"+student_Id+"'";
          ResultSet rs = stat.executeQuery(student_selectQuery);
          
          if(rs.next()==true){
              System.out.println("alredy"); 
             JOptionPane.showMessageDialog(null,"already exists User name"); 
             
          
          }
          else{
              
            String student_query = "INSERT INTO `students_form`(`student_id`, `student_name`, `student_password`, `student_mobile`) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(student_query);
              ps.setString(1, student_Id);
               ps.setString(2, student_Name);
                ps.setString(3, student_Password);
                ps.setString(4, student_Mobile);
            
           
              if(ps.executeUpdate()>0){
                 
                  
             JOptionPane.showMessageDialog(null,"new user add");
               return true;
              }
              
              }
            }catch(SQLException ex){
                System.out.println(ex);
            }
    return false;
              
    }
    
}
