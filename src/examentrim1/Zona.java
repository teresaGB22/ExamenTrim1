/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentrim1;

/**
 *
 * @author teres
 */
public class Zona {
    private String nombre;
    private int disponibleEntradas;

    public Zona(String nombre, int disponibleEntradas) {
        this.nombre = nombre;
        this.disponibleEntradas = disponibleEntradas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDisponibleEntradas() {
        return disponibleEntradas;
    }
    
    public boolean vender(int n){
        boolean venta;
        if(n <= disponibleEntradas){
            disponibleEntradas -= n;
            venta = true;
        }else{
            venta = false;
        }
        return venta;
    }
}
