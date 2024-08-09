/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karate_project;

import interface_.Insertar_Cliente;
import interface_.Upd_Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.HTML.Attribute.ID;

/**
 *
 * @author Kevin
 */
public class Cliente {

    private int IdCliente;
    private int Cedula_CLI;
    private double Cuota_M;
    private String Horario;

    public Cliente(int IdCliente, int Cedula_CLI, double Cuota_M, String Horario) {
        this.IdCliente = IdCliente;
        this.Cedula_CLI = Cedula_CLI;
        this.Cuota_M = Cuota_M;
        this.Horario = Horario;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getCedula_CLI() {
        return Cedula_CLI;
    }

    public void setCedula_CLI(int Cedula_CLI) {
        this.Cedula_CLI = Cedula_CLI;
    }

    public double getCuota_M() {
        return Cuota_M;
    }

    public void setCuota_M(double Cuota_M) {
        this.Cuota_M = Cuota_M;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public void InsertarCliente() {
        try {
            CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("INSERT INTO CLIENTE (IdCliente, Cedula_CLI, Cuota_M, Horario)VALUES('" + getIdCliente() + "','" + getCedula_CLI() + "','" + getCuota_M() + "','" + getHorario() + "');");
            con.CerrarBD();
        } catch (SQLException ex) {
            Logger.getLogger(Insertar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ActualizarCliente(){
    try {
         CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("UPDATE CLIENTE SET Cedula_CLI ='" + getCedula_CLI() + "' , Cuota_M ='" + getCuota_M() + "' , Horario ='" + getHorario() + "'WHERE IdCliente = '" + ID + "'; ");
            con.CerrarBD();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Upd_Cliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

}
