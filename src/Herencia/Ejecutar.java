/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el nombre");
        String nombre = leer.next();

        System.out.println("Digite el Apellido");
        String apellido = leer.next();
        
        System.out.println("Digite la edad");
        int edad = leer.nextInt();
        
        System.out.println("Digite el codigo");
        String CodigoAprendiz = leer.next();
        
        Aprendiz aprendiz = new Aprendiz(nombre, apellido, edad);
        aprendiz.setCodigoAprendiz(CodigoAprendiz);
        aprendiz.generarCredenciales();
    }
  
}