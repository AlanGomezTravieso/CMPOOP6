/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase Almuno que extiende de la clase Persona, la cul puede generar un objeto con los atributos numCuenta, promedio, carrera,nombre, edad
 * @author alang
 */
public class Alumno extends Persona{
    
    private int numCuenta;
    private double promedio;
    private String carrera;

    public Alumno() {
    }
/**
 * 
 * @param numCuenta de tipo entero
 * @param promedio de tipo double
 * @param carrera de tipo String
 * @param nombre de tipo String que hereda de la clase Persona
 * @param edad de tipo etero, que hereda de la clase Persona
 */
    public Alumno(int numCuenta, double promedio, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.carrera = carrera;
    }
/**
 * 
 * @return numCuenta método getNumCuenta
 */
    public int getNumCuenta() {
        return numCuenta;
    }
/**
 * 
 * @param numCuenta método setNumCuenta
 */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
/**
 * 
 * @return promedio método getPromedio
 */
    public double getPromedio() {
        return promedio;
    }
/**
 * 
 * @param promedio método setPromedio
 */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
/**
 * 
 * @return carrera método getCarrera
 */
    public String getCarrera() {
        return carrera;
    }
/**
 * 
 * @param carrera método setCarrera
 */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
/**
 * 
 * @return String, Método toString que imprime los datos.
 */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "numCuenta=" + numCuenta + ", promedio=" + promedio + ", carrera=" + carrera + '}';
    }
    
    
}
