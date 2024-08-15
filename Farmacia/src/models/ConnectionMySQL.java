
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    private String database_name = "pharmacy_database";
    private String user = "root";
    private String password = "Sara@1256";
    private String url = "jdbc;mysql://localhost:3306" + database_name;
    Connection conn = null;
    
    public Connection getConnection(){
        try{
            //OBTENER EL VALOR DEL DRIVER
            Class.forName("com.mysql.cj.jdbc.Drivver");
            //OBTENER LA CONEXION
            conn = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException e){
            System.err.println("Ha ocurrido un ClassNotFoudException " + e.getMessage());
        }catch(SQLException e){
            System.err.println("Ha ocirrido un SQLException " +e.getMessage());
        }
        return conn;
    }
}
