
package Conf;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carlos Bolivar
 */
public class Conexion{
    

  Connection con;
 
 public Conexion(){
 try {
     Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas","root","");
 } catch (Exception e) {
     e.printStackTrace();
 }
 

 }

    public Connection getConnection() {
        return con;
    }
}