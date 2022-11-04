/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author poo01alu17
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger = new Gerente();
        ger.setNombre("Pedro Escalante");
        ger.setNumEmpleado(12345);
        
        System.out.println("Nombre: "+ger.getNombre());
        System.out.println("NumEmpleado: "+ger.getNumEmpleado());
        System.out.println("Sueldo base: "+ger.getSueldo());
        ger.setSueldo(10);
        System.out.println("Sueldo aumentado: "+ger.getSueldo());
        
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: "+ger.getPresupuesto());
        System.out.println(ger);
    }
    
}
