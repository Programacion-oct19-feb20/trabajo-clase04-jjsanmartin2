/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio3 {
    /*
    Generar un programa que permita pedir datos por teclado para:
    Ingreso de nombres completos de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
   
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    
    */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String nombresCompletos;
         int nota1;
         int nota2;
         String ciclo;
         
         System.out.println("Ingrese sus Nombres Completos");
         nombresCompletos = entrada.nextLine();
         System.out.println("Ingrese Nota 1");
         nota1 = entrada.nextInt(); //Ingreso de enteros
         System.out.println("Ingrese Nota 2");
         nota2 = entrada.nextInt(); //Ingreso de enteros
         entrada.nextLine(); //este comando sirve para que luego de pedir un 
         //valor cadena, valor numerico y luego se quiere regresar a un valor 
         //cadena, se debe limpiar el buffer para que el programa siga 
         //corriendo.
         System.out.println("Ingrese su Ciclo Academico");
         ciclo = entrada.nextLine();
         
         System.out.printf("Informe del alumno\nNombres Completos:%s"
                 + "\nCiclo:%s\nNota 1:%s\nNota 2:%s\n", nombresCompletos, 
                 ciclo, nota1, nota2);  //Esta cadena es 
                 //la apariencia que tendra la presentación. 
                 //Debe ser estilizada
         
     }
}
