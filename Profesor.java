/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase Profesor que extiende de la clase Trabajador que puede generar un objeto con los atributos: numAlumnos, rfc, materia, sueldo, horario, nombre y edad
 * @author alang
 */
public class Profesor extends Trabajador{
    
    private int numAlumnos;
    private String materia;

    public Profesor() {
    }
/**
 * 
 * @param numAlumnos de tipo entero
 * @param materia de tipo String
 * @param rfc de tipo entero que hereda de la clae Trabajador
 * @param sueldo de tipo entero que heredad de la clase Trabajador
 * @param horario de tipo String que hereda de la clase Trabajador
 * @param nombre de tipo String que hereda de la clase Trabajador
 * @param edad de tipo entero que hereda de la clase Trabajador
 */
    public Profesor(int numAlumnos, String materia, int rfc, int sueldo, String horario, String nombre, int edad) {
        super(rfc, sueldo, horario, nombre, edad);
        this.numAlumnos = numAlumnos;
        this.materia = materia;
    }
/**
 * 
 * @return numAlumnos método getNumAlumnos
 */
    public int getNumAlumnos() {
        return numAlumnos;
    }
/**
 * 
 * @param numAlumnos método setNumAlumnos
 */
    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
/**
 * 
 * @return materia método getMateria
 */
    public String getMateria() {
        return materia;
    }
/**
 * 
 * @param materia método setMateria
 */
    public void setMateria(String materia) {
        this.materia = materia;
    }
/**
 * 
 * @return String, Método toString que imprime los datos.
 */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numAlumnos=" + numAlumnos + ", materia=" + materia + '}';
    }
    
    
}
