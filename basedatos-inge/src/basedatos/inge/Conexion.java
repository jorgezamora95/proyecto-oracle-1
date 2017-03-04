/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos.inge;

/**
 *
 * @author campitos
 */

import java.sql.*;

public class Conexion {
    
  public static Connection conexion(String login, String password)throws Exception{
      
      String conexion="jdbc:mysql://localhost:3306/mysql";
      Class.forName("com.mysql.jdbc.Driver");
     Connection con= DriverManager.getConnection(conexion, login, password);
   return con;   
  }
    
}
