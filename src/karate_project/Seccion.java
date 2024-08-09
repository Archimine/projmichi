/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karate_project;

import interface_.Ingresar_Seccion;
import interface_.Upd_Seccion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.HTML.Attribute.ID;

/**
 *
 * @author Kevin
 */
public class Seccion {

    private int IdSeccion;
    private double alto, largo, ancho;
    private int Capacidad;
    private String Categoria;

    public Seccion(int IdSeccion, double alto, double largo, double ancho, int Capacidad, String Categoria) {
        this.IdSeccion = IdSeccion;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.Capacidad = Capacidad;
        this.Categoria = Categoria;
    }

    public int getIdSeccion() {
        return IdSeccion;
    }

    public void setIdSeccion(int IdSeccion) {
        this.IdSeccion = IdSeccion;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void IngresarSeccion() {
        try {
            CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("INSERT INTO SECCION (IdSeccion, alto, largo, ancho, Capacidad, Categoria)VALUES('" + getIdSeccion() + "','" + getAlto() + "','" + getLargo() + "','" + getAncho() + "','" + getCapacidad() + "','" + getCategoria() + "');");
            con.CerrarBD();
        } catch (SQLException ex) {
            Logger.getLogger(Ingresar_Seccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarSeccion() {
        try {
            CConexion con = new CConexion();
            con.Establecer_conexion();
            con.actualizarBD("UPDATE SECCION SET alto=" + getAlto() + " , largo=" + getLargo() + " , ancho=" + getAncho() + " , Capacidad=" + getCapacidad() + " ,Categoria='" + getCategoria() + "' WHERE IdSeccion = '" + ID + "' ;");
            con.CerrarBD();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Upd_Seccion.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
