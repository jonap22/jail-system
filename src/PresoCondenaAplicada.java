
/**
*@author Otame
*@Date Monday, March 15
*@version 1.2
*/

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PresoCondenaAplicada extends PresoRecienIngresado {

    //Variables
    private double tiempoDeCondena;
    private String JuezEncargado;

    //Métodos
    public String condenaAplicada(double tiempoDeCondena, String JuezEncargado) {
        return "La condena aplicada al sujeto es de un tiempo de " + tiempoDeCondena
                + " años ,la condena fue sentenciada por el juez " + JuezEncargado;
    }
    
    //Arresto
    public String arresto() {
        //Variables
        String nombre = super.getNombre();
        int cedula = super.getDocumentoDeIdentidad();
        String delito = super.getDelito();
        Date fechaIngreso = super.getFechaDeIngreso();
        
        return "El arresto se realizó al individuo " + nombre + " con la cédula de identidad o"
                + " documeto de identidad " + cedula + " por el delito de " + delito + ", el individuo"
                + " fue ingresado a un centro de reclusión la fecha" + fechaIngreso + " el sujeto se encuentra"
                + " cumpliendo condena.";
    }
    
    //Get
    public double getTiempodecontena() {
        return tiempoDeCondena;
    }

    public String getJuezencargado() {
        return JuezEncargado;
    }

    //Set
    public void setTiempodecontena(double tiempodecontena) {
        this.tiempoDeCondena = tiempodecontena;
    }

    public void setJuezencargado(String juezencargado) {
        this.JuezEncargado = juezencargado;
    }

    //Constructor
    public PresoCondenaAplicada(double tiempoDeCondena, String JuezEncargado,
            String nombre, String apellido,
            String nacionalidad, int documentoDeIdentidad,
            Date fechaDeNacimiento, Date fechaDeIngreso,
            String reincidencia, String estadoDeSentencia,
            int nivelDePeligrosidad, String delito) {

        super(nombre, apellido, nacionalidad,
                documentoDeIdentidad, fechaDeNacimiento,
                fechaDeIngreso, reincidencia,
                estadoDeSentencia, nivelDePeligrosidad, delito);

        this.tiempoDeCondena = tiempoDeCondena;
        this.JuezEncargado = JuezEncargado;

    }

    //toString
    @Override
    public String toString() {
        return "PresoCondenaAplicada{" + "tiempoDeCondena=" + tiempoDeCondena
                + ", JuezEncargado=" + JuezEncargado + '}';
    }

}
