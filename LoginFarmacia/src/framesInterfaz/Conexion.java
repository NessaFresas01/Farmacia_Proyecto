package framesInterfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection obtenerConexion() {
        String url = "jdbc:mysql://localhost:3306/farmaciaMed?serverTimezone=America/Mexico_City";  //
        String user = "root";            
        String password = "Pasteldefresa162021.";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}

