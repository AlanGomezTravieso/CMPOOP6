/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase Director que extiende de la clse Trabajador que puede generar un objeto con los atributos: escuela, añosTrabajo, rfc, sueldo, horario, nombre y edad
 * @author alang
 */
public class Director extends Trabajador {
 
    private String escuela;
    private int añosTrabajo;

    public Director() {
    }
/**
 * 
 * @param escuela de tipo String
 * @param añosTrabajo de tipo entero
 * @param rfc de tipo entero que hereda de la clase Trabajador
 * @param sueldo de tipo entero que hereda de la clase Trabajador
 * @param horario de tipo String que hereda de la clase Trabajador
 * @param nombre de tipo String que hereda de la clase Trabajador
 * @param edad de tipo String que hereda de la clase Trabajador
 */
    public Director(String escuela, int añosTrabajo, int rfc, int sueldo, String horario, String nombre, int edad) {
        super(rfc, sueldo, horario, nombre, edad);
        this.escuela = escuela;
        this.añosTrabajo = añosTrabajo;
    }
/**
 * 
 * @return escuela método getEscuela
 */
    public String getEscuela() {
        return escuela;
    }
/**
 * 
 * @param escuela método setEscuela
 */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
/**
 * 
 * @return añosTrabajo método getAñosTrabajo
 */
    public int getAñosTrabajo() {
        return añosTrabajo;
    }
/**
 * 
 * @param añosTrabajo método setAñosTrabajo
 */
    public void setAñosTrabajo(int añosTrabajo) {
        this.añosTrabajo = añosTrabajo;
    }

    /**
     * 
     * @return String, Método toString que imprime los datos.
     */
    @Override
    public String toString() {
        return super.toString()+"Director{" + "escuela=" + escuela + ", a\u00f1osTrabajo=" + añosTrabajo + '}';
    }
    
}
