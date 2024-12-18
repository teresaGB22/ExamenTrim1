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
public class ConcertSala {
    private Zona[] zonas;

    public ConcertSala() {
        zonas = new Zona[]{
            new Zona("Principal", 1000),
            new Zona("Platea", 200),
            new Zona("VIP",25)
        };
    }
    public void mostrarEntradas(){
        System.out.println("Las entradas que estan disponibles son: ");
        for(Zona z : zonas){
            System.out.println(z.getNombre() + " : " + z.getDisponibleEntradas());
        }
        
    }
    
    public void venderEntrada(Scanner t){
        System.out.println("�Para qu� zona deseas entradas?");
        for (int i = 0; i < zonas.length; i++) {
            System.out.println((i + 1) + ". " + zonas[i].getNombre());
        }
        System.out.println("Selecciona una opcion: ");
        int opcion = t.nextInt();
        if(opcion < 1 || opcion > zonas.length){
            System.out.println("Zona no valida");
        }else{
            Zona seleccion = zonas[opcion - 1];
            System.out.println("Inserte cantidad de entradas");
            int cantidad = t.nextInt();
            if(seleccion.vender(cantidad)){
                System.out.println("Entradas vendidas.");
            }else{
                System.out.println("No hay suficientes entradas");
            }
        }
    }
    
}
