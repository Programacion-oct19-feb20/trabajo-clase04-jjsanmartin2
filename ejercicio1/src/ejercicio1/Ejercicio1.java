/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author UTPL
 */
public class Ejercicio1 {

    /**
     * comentario multilinea
     * .
     * .
     * Fin de comentario
     */
    public static void main(String[] args) {
        // comentario de una linea
        String palabra1;
        String palabra2;
        String palabra3;
        int palabra4;
        double palabra5;
        
        palabra1 = "Bienvenido a";
        palabra2 = "Java";
        palabra3 = "Clase";
        palabra4 = 4;
        palabra5 = 2.5;
        System.out.printf("%s\n...\n...\n%s\nEn la %s\n%d"
                + "\nDuracion de %.1f horas\n", 
                palabra1, palabra2, palabra3, palabra4, palabra5);
    }
    
}
