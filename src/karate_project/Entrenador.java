/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karate_project;

import interface_.Insertar_Entrenador;
import interface_.Upd_Entrenador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.HTML.Attribute.ID;

/**
 *
 * @author Kevin
 */
public class Entrenador {

    private int IdEntrenador;
    private int Cedula_ENT;
    private double Sueldo;
    private String Horario;

    public Entrenador(int IdEntrenador, int Cedula_ENT, double Sueldo, String Horario) {
        this.IdEntrenador = IdEntrenador;
        this.Cedula_ENT = Cedula_ENT;
        this.Sueldo = Sueldo;
        this.Horario = Horario;
    }

    public int getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(int IdEntrenador) {
        this.IdEntrenador = IdEntrenador;
    }

    public int getCedula_ENT() {
        return Cedula_ENT;
    }

    public void setCedula_ENT(int Cedula_ENT) {
        this.Cedula_ENT = Cedula_ENT;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public void InsertarEntrenador() {
        try {
            CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("INSERT INTO ENTRENADOR (IdEntrenador, Cedula_ENT, Sueldo, Horario)VALUES ('" + getIdEntrenador() + "','" + getCedula_ENT() + "','" + getSueldo() + "','" + getHorario() + "');");
            con.CerrarBD();
        } catch (SQLException ex) {
            Logger.getLogger(Insertar_Entrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ActualizarEntrenador(){
    try {
        CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("UPDATE ENTRENADOR SET Cedula_ENT ='" + getCedula_ENT() + "' , Sueldo =" + getSueldo() + " , Horario ='" + getHorario() + "' WHERE IdEntrenador ='" + ID + "' ;");
            con.CerrarBD();
            this.setVisible(false); 
        } catch (SQLException ex) {
            Logger.getLogger(Upd_Entrenador.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
