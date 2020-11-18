/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase empleado que generá un objeto con los atributos: nombre, numero de empleado y sueldo
 * @author alang
 */
public class Empleado {
    
    String nombre;
    private int numEmpleado, sueldo;

    public Empleado() {
    }
    /**
     * 
     * @param nombre de tipo string
     * @param numEmpleado de tipo entero
     * @param sueldo  de tipo entero
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
/**
 * 
 * @return nombre, método getnombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre método setNombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return numempleado, método getNumEmpleado
 */
    public int getNumEmpleado() {
        return numEmpleado;
    }
/**
 * 
 * @param numEmpleado método setNumEmpleado
 */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
/**
 * 
 * @return sueldo , método getSueldo
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
     * @param porcentaje Método aumentarSueldo a partir del porcentaje
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += (int)(sueldo*porcentaje/100);
    }

    /**
     * 
     * @return String, Método toString que imprime los datos.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
