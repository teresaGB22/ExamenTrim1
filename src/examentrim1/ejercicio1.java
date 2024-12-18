/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentrim1;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce una frase por teclado: ");
        String frase = t.nextLine();
        String[] palabras = frase.split(" ");
        int numPalabra = palabras.length;

        String mayor = "";
        String menor = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() > mayor.length()) {
                mayor = palabra;
            }
            if (palabra.length() < menor.length()) {
                menor = palabra;
            }
        }
        System.out.println("El numero de palabra en total es: " + numPalabra);
        System.out.println("La palabra m�s corta es: " + menor + " , y la mas larga es: " + mayor);
    }

}
