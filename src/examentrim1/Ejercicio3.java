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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        Inventario inventarios = new Inventario(100);
        boolean acierto = true;
        do {
            System.out.println("\nMen�:");
            System.out.println("1. Introducir datos nuevo inventario");
            System.out.println("2. A�adir nuevo producto");
            System.out.println("3. Buscar producto y modificar informaci�n");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar valor total del inventario");
            System.out.println("6. Informe rotura de stock");
            System.out.println("7. Mostrar todos los productos");
            System.out.println("8. Salir");
            System.out.print("Elige una opci�n: ");
            int opcion = t.nextInt();
            t.nextLine();
            switch (opcion) {
                case 1:
                    inventarios.inicializarInventario(t);
                    break;
                case 2:
                    inventarios.anyadirProducto(t);
                    break;
                case 3:
                    inventarios.modificarProducto(t);
                    break;
                case 4:
                    inventarios.eliminarProducto(t);
                    break;
                case 5:
                    inventarios.calcularValorInventario();
                    break;
                case 6:
                    inventarios.informeRoturaStock();
                    break;
                case 7:
                    inventarios.mostrarProductos();
                    break;
                case 8:
                    System.out.println("Gracias por usar el sistema.");
                    acierto = false;
                    break;

                default:
                    System.out.println("Opci�n no v�lida.");
            }
        } while (acierto);
    }

}
