/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */

public class Buho extends Animal implements HabitatLlanura, Volador, Cazador {
    private double visionNocturna;
    private boolean estaCazando;
    
    public Buho(String nombre, int edad, double peso, double visionNocturna) {
        super(nombre, edad, peso, "Búho");
        this.setVisionNocturna(visionNocturna);
        this.estaCazando = false;
    }
    
    // Getters y Setters con validación
    public double getVisionNocturna() { return visionNocturna; }
    
    public void setVisionNocturna(double vision) {
        if (vision > 0 && vision <= 10) {
            this.visionNocturna = vision;
        } else {
            System.out.println("Error: Visión nocturna debe ser entre 0.1-10.0");
            this.visionNocturna = 8.5;
        }
    }
    
    public boolean isEstaCazando() { return estaCazando; }
    
    // Métodos abstractos de Animal
    @Override
    public void comer() {
        if (energia >= 15) {
            System.out.println(nombre + " traga enteras a sus presas");
            energia -= 15;
        } else {
            System.out.println(nombre + " está demasiado cansado para comer");
        }
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ulula: ¡Uuh-uuh!");
    }
    
    @Override
    public void moverse() {
        if (energia >= 18) {
            System.out.println(nombre + " se mueve silenciosamente entre los árboles");
            energia -= 18;
        } else {
            System.out.println(nombre + " no tiene energía para moverse");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "Llanuras con árboles aislados";
    }
    
    // Métodos de HabitatLlanura
    @Override
    public void pastar() {
        System.out.println(nombre + " observa la llanura desde un punto alto");
    }
    
    @Override
    public void excavarMadriguera() {
        System.out.println(nombre + " usa huecos en árboles como madriguera");
    }
    
    @Override
    public void camuflarse() {
        System.out.println(nombre + " se camufla perfectamente en la corteza de los árboles");
    }
    
    @Override
    public String getTipoVegetacion() {
        return "Árboles aislados en llanura";
    }
    
    // Métodos de Volador
    @Override
    public void volar() {
        if (energia >= 25) {
            System.out.println(nombre + " vuela silenciosamente en la noche");
            energia -= 25;
        } else {
            System.out.println(nombre + " no tiene energía para volar");
        }
    }
    
    @Override
    public void planear() {
        if (energia >= 12) {
            System.out.println(nombre + " planea buscando presas desde el aire");
            energia -= 12;
        }
    }
    
    @Override
    public double getAlturaMaximaVuelo() {
        return 50.0; // metros
    }
    
    // Métodos de Cazador
    @Override
    public void acechar() {
        if (energia >= 10) {
            estaCazando = true;
            System.out.println(nombre + " acecha silenciosamente desde las alturas");
            energia -= 10;
        }
    }
    
    @Override
    public void atacar() {
        if (energia >= 30 && estaCazando) {
            System.out.println(nombre + " ataca en picada a su presa");
            energia -= 30;
            estaCazando = false;
        } else if (!estaCazando) {
            System.out.println(nombre + " debe acechar primero antes de atacar");
        }
    }
    
    @Override
    public String getTipoPresa() {
        return "Roedores e insectos grandes";
    }
    
    // Método específico del Búho
    public void girarCabeza() {
        if (energia >= 5) {
            System.out.println(nombre + " gira su cabeza 270 grados");
            energia -= 5;
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Visión nocturna: " + visionNocturna + "/10 - Cazando: " + estaCazando);
    }
}
