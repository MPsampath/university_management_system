/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;


import java.sql.*;


  

  public class connecter {
  private static final String USERNAME = "root";
  private static final String PASSWORD = "";
  private static final String CONN_STRING = "jdbc:mysql://localhost:3306/ums?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   

    static Object getConnection() {
        Connection con = null;
  
  try{
  con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
      System.out.println("Connect");
  }catch(SQLException e){
      System.err.println(e);
  }
  return con;

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
