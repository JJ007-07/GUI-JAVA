/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author SENA
 */
public class Aprendiz extends Persona{

    private String CodigoAprendiz;

    public Aprendiz(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.CodigoAprendiz = CodigoAprendiz;
    }
    
    public String getCodigoAprendiz() {
        return CodigoAprendiz;
    }

    public void setCodigoAprendiz(String CodigoAprendiz) {
        this.CodigoAprendiz = CodigoAprendiz;
    }
    
    public void generarCredenciales(){
        
        System.out.println("_________SENA_________");
        System.out.println("Aprendoiz con nombre: " + getNombre() + " " + getApellido() + " Y edad de: " + getEdad());
        System.out.println("Codigo de Aprendiz: " + getCodigoAprendiz());
    }

  
}