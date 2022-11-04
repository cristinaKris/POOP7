/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu17
 */
public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que modifica el valor de nombre
     * @param nombre El nombre de un empleado
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return Regresa el numero del empleado
     */
    
    public int getNumEmpleado() {
        return numEmpleado;
    }
    
    /**
     * Metodo que modifca el numero de empleado
     * @param numEmpleado Es el numero de el empleado
     */
    
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(sueldo*porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
}
