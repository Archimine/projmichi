/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karate_project;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class CConexion {

    private Connection Conectar = null;
    private final String Usuario = "root";
    private final String Contrasena = "comida24";
    private final String bd = "KARATE_PRO";
    private final String ip = "localhost";
    private final String Puerto = "3306";
    
    private final String Cadena = "jdbc:mysql://" + ip + ":" + Puerto + "/" + bd;
    public Connection Establecer_conexion() {
        try {
            Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(driver);
            Conectar = DriverManager.getConnection(Cadena, Usuario, Contrasena);
            System.out.println("Se conecto correctamente");

        } catch (Exception e) {
            System.out.println("No se realizo la conexion, Error: " + e.toString());
        }
        return Conectar;
    }

    public void actualizarBD(String Sql) {
        try {
            Statement stm=Conectar.createStatement();
            stm.executeUpdate(Sql);
            System.out.println("Transaccion exitosa");
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }

    public ResultSet Consulta(String sql) throws SQLException {
        Statement stm=Conectar.createStatement();
        ResultSet cursor;
        cursor=stm.executeQuery(sql);
        return cursor;
    }

    public void CerrarBD() throws SQLException {
        Conectar.close();
    }

}
