/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase Trabajador que extiende de la clsae Persona que puede generar un objeto con los atributos rfc, sueldo, horario, nombre, edad
 * @author alang
 */
public class Trabajador extends Persona {
    
    private int rfc, sueldo;
    private String horario ;

    public Trabajador() {
    }
    /**
     * 
     * @param rfc de tipo entero
     * @param sueldo de tipo entero
     * @param horario de tipo String 
     * @param nombre de tipo String que hereda de la clse Persona
     * @param edad de tipo entero que hereda de la clase Persona
     */
    public Trabajador(int rfc, int sueldo, String horario, String nombre, int edad) {
        super(nombre, edad);
        this.rfc = rfc;
        this.sueldo = sueldo;
        this.horario = horario;
    }
/**
 * 
 * @return rfc método getRfc
 */
    public int getRfc() {
        return rfc;
    }
/**
 * 
 * @param rfc método setRfc
 */
    public void setRfc(int rfc) {
        this.rfc = rfc;
    }
/**
 * 
 * @return sueldo método getsueldo
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * 
 * @param sueldo método setSueldo
 */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
/**
 * 
 * @return horario método getHorario
 */
    public String getHorario() {
        return horario;
    }
/**
 * 
 * @param horario método setHorario
 */
    public void setHorario(String horario) {
        this.horario = horario;
    }
/**
 * 
 * @return String, Método toString que imprime los datos.
 */
    @Override
    public String toString() {
        return super.toString()+"Trabajador{" + "rfc=" + rfc + ", sueldo=" + sueldo +  ", horario=" + horario + '}';
    }
    
    
    
}
