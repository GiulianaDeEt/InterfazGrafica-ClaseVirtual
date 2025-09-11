/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Mar
 */

public class Jaguar extends Animal implements Selva {

    private double velocidadMax;

    public Jaguar(String nombre, int edad, double peso, String especie, double velocidadMax) {
        super(nombre, edad, peso, especie); // <<-- coincide con Animal
        this.velocidadMax = velocidadMax;
    }

    // ====== Métodos de la interfaz Selva ======
    @Override
    public void refugiarseEntreArboles() {
        System.out.println(getNombre() + " se oculta entre la vegetación densa para acechar.");
    }

    @Override
    public void buscarFrutas() {
        System.out.println(getNombre() + " no busca frutas: es carnívoro, prefiere presas.");
    }

    @Override
    public void marcarTerritorio() {
        System.out.println(getNombre() + " marca su territorio con arañazos y orina.");
    }

    // ====== Métodos abstractos de Animal (TODOS obligatorios) ======
    @Override
    public void comer() {
        if (energia >= 10) {
            System.out.println(getNombre() + " come su presa y recupera energía.");
            energia = Math.min(100, energia + 25);
        } else {
            System.out.println(getNombre() + " está muy cansado para cazar/comer ahora.");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " ruge con fuerza.");
    }

    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println(getNombre() + " se desplaza sigilosamente entre la selva.");
            energia -= 10;
        } else {
            System.out.println(getNombre() + " no tiene energía suficiente para moverse.");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Selva tropical";
    }

    // ====== Propios del jaguar ======
    public void cazar() {
        if (energia >= 20) {
            System.out.println(getNombre() + " realiza una emboscada fulminante.");
            energia -= 20;
        } else {
            System.out.println(getNombre() + " está demasiado cansado para cazar.");
        }
    }

    public double getVelocidadMax() { return velocidadMax; }
}

