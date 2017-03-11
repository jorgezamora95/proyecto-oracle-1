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

public class OperacionesSQL {

    public static void crearTablas() throws Exception {
        Connection con = Conexion.conexion("root", "root");
        Statement st = con.createStatement();
        st.execute("CREATE TABLE PRIMERA(ID INTEGER, NOMBRE VARCHAR(20))");
        con.close();
    }

    public static void insertarRegistro() throws Exception {
        Connection con = Conexion.conexion("root", "root");
        PreparedStatement ps = con.prepareStatement("insert into PRIMERA VALUES(?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Juan");
        ps.executeUpdate();
        con.close();
    }

}
