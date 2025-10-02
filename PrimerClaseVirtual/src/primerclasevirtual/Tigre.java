/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */


public class Tigre {
    private String nombre;
    private int edad;

    public Tigre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void rugir() {
        System.out.println(nombre + " ruge fuerte: ¡Grrrrr!");
    }

    public void cazar() {
        System.out.println(nombre + " está cazando en la selva.");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}


