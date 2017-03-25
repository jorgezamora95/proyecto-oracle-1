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
import java.util.ArrayList;

public class OperacionesSQL {

    public static void crearTablas() throws Exception {
        Connection con = Conexion.conexion("root", "");
        Statement st = con.createStatement();
   st.execute("CREATE TABLE PRIMERA(ID INTEGER, NOMBRE VARCHAR(20))");
        
   con.close();
    }

    public static void insertarRegistro(int id, String nombre ) throws Exception {
        Connection con = Conexion.conexion("root", "");
        PreparedStatement ps = con.prepareStatement("insert into PRIMERA VALUES(?,?)");
        ps.setInt(1, id);
        ps.setString(2, nombre);
        ps.executeUpdate();
        con.close();
    }
    
    public static ArrayList<Primera> buscarTodos()throws Exception{
        Connection con = Conexion.conexion("root", "");
        ArrayList<Primera> registros=new ArrayList<>();
    Statement st=    con.createStatement();
  ResultSet res=  st.executeQuery("select * from PRIMERA");
  while(res.next()){
      Primera p=new Primera(res.getInt(1), res.getString(2));
     registros.add(p);
  }
        
      return registros;  
        
    }

}
