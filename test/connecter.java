/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

public class connecter {

  private static final String USERNAME = "root";
  private static final String PASSWORD = "";
  private static final String CONN_STRING = "jdbc:mysql://localhost:3306/ums?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   
  public static void main(String[] args){
  Connection con = null;
  
  try{
  con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
      System.out.println("Connect");
  }catch(SQLException e){
      System.err.println(e);
  }
  }
    
   /* public connecter() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/3306/ums","root","root");
            st =  con.createStatement();
            System.out.println("ok");
        }catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }*/
}

