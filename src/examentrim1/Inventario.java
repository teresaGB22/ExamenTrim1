/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentrim1;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class Inventario {

    private Producto[] productos;
    int contador;
    private static final int STOCK_SEGURIDAD = 50;

    public Inventario(int tamanyo) {
        productos = new Producto[tamanyo];
        contador = 0;
    }

    public void inicializarInventario(Scanner t) {
        System.out.println("Introduce cantidad de productos");
        int n = t.nextInt();
        t.nextLine();

        if (n > productos.length) {
            System.out.println("El n�mero de productos excede el tama�o del inventario.");

        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Introduce el nombre del producto:");
                String nombre = t.nextLine();
                System.out.println("Introduce la cantidad del producto:");
                int cantidad = t.nextInt();
                System.out.println("Introduce el precio del producto:");
                double precio = t.nextDouble();
                t.nextLine(); // Limpiar buffer

                productos[contador++] = new Producto(nombre, cantidad, precio);
            }
            System.out.println("Inventario inicializado.");
        }

    }

    public void anyadirProducto(Scanner t) {
        if (contador >= productos.length) {
            System.out.println("El inventario est� lleno. No se pueden a�adir m�s productos.");

        } else {
            System.out.println("Introduce el nombre del producto:");
            String nombre = t.nextLine();
            System.out.println("Introduce la cantidad del producto:");
            int cantidad = t.nextInt();
            System.out.println("Introduce el precio del producto:");
            double precio = t.nextDouble();
            t.nextLine(); 

            productos[contador++] = new Producto(nombre, cantidad, precio);
            System.out.println("Producto a�adido.");
        }

    }

    public void modificarProducto(Scanner t) {
        System.out.println("Introduce el nombre del producto que deseas modificar:");
        String nombre = t.nextLine();

        for (int i = 0; i < contador; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Introduce la nueva cantidad:");
                int nuevaCantidad = t.nextInt();
                System.out.println("Introduce el nuevo precio:");
                double nuevoPrecio = t.nextDouble();
                t.nextLine();

                productos[i].setCantidad(nuevaCantidad);
                productos[i].setPrecio(nuevoPrecio);
                System.out.println("Producto modificado.");

            } else {
                System.out.println("Producto no encontrado.");

            }
        }
    }

    public void eliminarProducto(Scanner t) {
        System.out.println("Introduce el nombre del producto que quiere eliminar:");
        String nombre = t.nextLine();

        for (int i = 0; i < contador; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < contador - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                productos[--contador] = null;
                System.out.println("Producto eliminado.");

            } else {
                System.out.println("Producto no encontrado.");
            }
        }

    }

    public void calcularValorInventario() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productos[i].getCantidad() * productos[i].getPrecio();
        }
        System.out.println("Total del inventario: " + total);
    }

    public void informeRoturaStock() {
        System.out.println("Productos con stock por debajo de " + STOCK_SEGURIDAD + ":");
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidad() < STOCK_SEGURIDAD) {
                System.out.println(productos[i]);
            }
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}
