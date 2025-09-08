/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Fede
 */
class Zorro extends Animal implements HabitatBosque {
    public Zorro(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Vulpes vulpes");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " caza pequeños roedores en el bosque");
        energia = Math.min(100, energia + 20);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra agudamente");
    }

    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println(nombre + " se mueve sigilosamente entre los arbustos");
            energia -= 8;
        } else {
            System.out.println(nombre + " está muy cansado para moverse");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Bosque templado";
    }

    // Métodos del HabitatBosque
    @Override
    public void refugiarse() {
        System.out.println(nombre + " se refugia en una madriguera");
    }

    @Override
    public void buscarComidaBosque() {
        System.out.println(nombre + " busca bayas y pequeños animales");
    }

    @Override
    public void marcarTerritorio() {
        System.out.println(nombre + " marca su territorio con orina");
    }
}
