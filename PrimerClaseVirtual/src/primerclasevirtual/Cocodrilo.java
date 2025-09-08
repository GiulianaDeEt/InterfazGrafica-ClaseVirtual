/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Alumno
 */


public class Cocodrilo extends Animal implements Nadador {
     
    private double velocidadNado;
    private int velocidad;
    private int camuflaje;
    
    public Cocodrilo(String nombre, int edad, double peso, double velocidadNado, int velocidad, int camuflaje) {
        super(nombre, edad, peso, "Crocodylus niloticus");
        this.velocidadNado = velocidadNado;
        this.velocidad = velocidad;
        this.camuflaje = camuflaje;
    }
    
    // Métodos abstractos de Animal
    @Override
    public void comer() {
        if (energia >= 15) {
            System.out.println(nombre + " caza peces y animales pequeños.");
            energia -= 15;
        } else {
            System.out.println(nombre + " está demasiado cansado para cazar.");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " emite un rugido grave: 'GRRRROAAARR!'");
        energia -= 5;
    }

    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println(nombre + " se arrastra en tierra y nada ágilmente en el agua.");
            energia -= 10;
        } else {
            System.out.println(nombre + " no tiene energía suficiente para moverse.");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "ríos y pantanos";
    }
    
    // Métodos de la interfaz Nadador
    @Override
    public void nadar() {
        if (energia >= 10) {
            System.out.println(nombre + " nada a " + velocidadNado + " km/h.");
            energia -= 10;
        } else {
            System.out.println(nombre + " está demasiado cansado para nadar.");
        }
    }

    @Override
    public void sumergirse(int profundidadMetros) {
        if (energia >= 15) {
            System.out.println(nombre + " se sumerge hasta " + profundidadMetros + " metros.");
            energia -= 15;
        } else {
            System.out.println(nombre + " no tiene energía suficiente para sumergirse.");
        }
    }

    @Override
    public double getVelocidadNado() {
        return velocidadNado;
    }
    
    // Método adicional específico
    public void girar() {
        if (energia >= 7) {
            System.out.println(nombre + " gira rápidamente en el agua para atrapar a su presa.");
            energia -= 7;
        } else {
            System.out.println(nombre + " está demasiado cansado para girar.");
        }
    }
}



