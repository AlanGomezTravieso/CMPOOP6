/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop6;

/**
 * Clase principal
 * @author alang
 */
public class MPOOP6 {

    public static void main (String[] args){
        System.out.println("***************");
        Empleado empleado = new Empleado("Jorge Monntaño",123,15000);
        
        System.out.println(empleado);
        empleado.aumentarSueldo(15);
        
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Alan Morales");
        gerente1.setNumEmpleado(124);
        gerente1.setSueldo(20000);
        gerente1.setPresupuesto(100000);
        System.out.println(gerente1);
        
        System.out.print("2***********");
        //sobrescritura de métodos 
        gerente1.aumentarSueldo(10);
        gerente1.aumentarPresupuesto(5);
        System.out.println(gerente1);
        
        
        System.out.println("3**************");
        Gerente gerente2 = new Gerente(300000,"Miguel Hurtado",125,21000);
        System.out.println(gerente2);
        gerente2.aumentarPresupuesto(25);
        System.out.println(gerente2);
        
        System.out.println("4**************");
        Alumno alumno = new Alumno(317124101,8.6,"Ing. electrica electrónica","Alan Gómez Travieso",19);
        System.out.println(alumno);
        
        System.out.println("5**************");
        Director director = new Director("Facultad de ingeniería",6,78984645,10000,"08:00-16:00","José Nuñez Segovia",36);
        System.out.println(director);
        
        System.out.println("6**************");
        Profesor profesor = new Profesor(28,"Física",48979848,4000,"07:00-09:00","Pablo Martinez Castañeda", 28);
        System.out.println(profesor);
    }
    
}