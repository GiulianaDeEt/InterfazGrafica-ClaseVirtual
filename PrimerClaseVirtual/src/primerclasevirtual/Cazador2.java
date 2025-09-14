/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

public class Cazador2 implements Cazador {
    private String nombre;

    public Cazador2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void acechar() {
        System.out.println(nombre + " se esconde detrás de las rocas acechando al puma...");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una flecha hacia su presa.");
    }

    @Override
    public String getTipoPresa() {
        return "Puma y Cóndor";
    }

    // Método adicional para interacción
    public void observar(Animal animal) {
        System.out.println(nombre + " observa a " + animal.getNombre() + " en su hábitat natural.");
    }
}
