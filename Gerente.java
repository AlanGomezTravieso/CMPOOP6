/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Calse Gerente que extiende de Empleado, que generá un objeto con los atributos: presupuesto, nombre, num. de empleado, sueldo
 * @author alang
 */
public class Gerente extends Empleado{
    
    private int presupuesto;

    public Gerente() {
    }
/**
 * 
 * @return presupuesto, método getPresupuesto
 */
    public int getPresupuesto() {
        return presupuesto;
    }
/**
 * 
 * @param presupuesto método setPresupuesto
 */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
/**
 * 
 * @param presupuesto de tipo entero
 * @param nombre de tipo String, heredado de la clase Empleado
 * @param numEmpleado de tipo entero, heredado de la clase Empleado
 * @param sueldo de tipo entero, heredado de la clse Empleado
 */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param porcentaje método aumentarPresupuesto a partir de porcentaje
     */
    public void aumentarPresupuesto(int porcentaje){
        presupuesto=(int)(presupuesto*porcentaje/100);
    }

    /**
     * 
     * @return String, Método toString que imprime los datos.
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
