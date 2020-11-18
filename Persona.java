/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase Persona que puede generar un objeto con los atributos: nombre, edad.
 * @author alang
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }
/**
 * 
 * @param nombre de tipo String
 * @param edad de tipo Entero
 */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * 
 * @return nombre, método getNombre
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
 * @return edad método getEdad
 */
    public int getEdad() {
        return edad;
    }
/**
 * 
 * @param edad método setEdad
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * 
 * @return String, Método toString que imprime los datos.
 */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
