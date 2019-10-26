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
public class Ejercicio2 {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos personales:
    Nombre:
    Ciudad de nacimiento:
    Edad:
    Matricula:
    */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String nombres;
         String ciudad_de_Nacimiento;
         int edad;
         double matricula;
         
         System.out.println("Ingrese sus nombres");
         nombres = entrada.nextLine();
         System.out.println("Ingrese du ciudad de nacimiento");
         ciudad_de_Nacimiento = entrada.nextLine();
         System.out.println("Ingrese su edad");
         edad = entrada.nextInt(); //Ingreso de enteros
         System.out.println("Ingrese su valor de matricula");
         matricula = entrada.nextDouble(); //Ingreso de decimales
         
         System.out.printf("Datos personales:\nNombres:%s"
                 + "\nCiudad de Nacimiento:%s\nEdad:%s años\nMatricula:%s\n", 
                 nombres, ciudad_de_Nacimiento, edad, matricula);
         
     }
}
