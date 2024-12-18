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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        ConcertSala c = new ConcertSala();
        boolean acierto = true;
        do{
            System.out.println("\n Men�");
            System.out.println("1. Mostrar numeros de entradas.");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion");
            int opcion = t.nextInt();
            switch(opcion){
                case 1:
                    c.mostrarEntradas();
                    break;
                case 2:
                    
                    c.venderEntrada(t);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    acierto = false;
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(acierto);
    }
    
}
