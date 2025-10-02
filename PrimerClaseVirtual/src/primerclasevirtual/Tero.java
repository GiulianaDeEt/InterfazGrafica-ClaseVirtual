/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class Tero extends Animal implements HabitatLlanura, Volador {
    private double envergaduraAlas;
    private boolean estaEnNido;
    
    public Tero(String nombre, int edad, double peso, double envergaduraAlas) {
        super(nombre, edad, peso, "Tero");
        this.setEnvergaduraAlas(envergaduraAlas);
        this.estaEnNido = false;
    }
    
    // Getters y Setters con validación
    public double getEnvergaduraAlas() { return envergaduraAlas; }
    
    public void setEnvergaduraAlas(double envergadura) {
        if (envergadura > 0 && envergadura <= 200) {
            this.envergaduraAlas = envergadura;
        } else {
            System.out.println("Error: Envergadura debe ser entre 0.1-200 cm");
            this.envergaduraAlas = 50.0;
        }
    }
    
    public boolean isEstaEnNido() { return estaEnNido; }
    
    // Métodos abstractos de Animal
    @Override
    public void comer() {
        if (energia >= 8) {
            System.out.println(nombre + " picotea gusanos e insectos del suelo");
            energia -= 8;
        } else {
            System.out.println(nombre + " está demasiado cansado para comer");
        }
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " grita: ¡Teru-teru!");
    }
    
    @Override
    public void moverse() {
        if (energia >= 12) {
            System.out.println(nombre + " camina rápidamente con pasos cortos");
            energia -= 12;
        } else {
            System.out.println(nombre + " no tiene energía para moverse");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "Llanuras abiertas y pastizales";
    }
    
    // Métodos de HabitatLlanura
    @Override
    public void pastar() {
        if (energia >= 6) {
            System.out.println(nombre + " busca alimento en los pastizales");
            energia -= 6;
        }
    }
    
    @Override
    public void excavarMadriguera() {
        System.out.println(nombre + " hace un nido superficial en el suelo");
    }
    
    @Override
    public void camuflarse() {
        System.out.println(nombre + " se camufla con el color de la tierra");
    }
    
    @Override
    public String getTipoVegetacion() {
        return "Pastizales abiertos";
    }
    
    // Métodos de Volador
    @Override
    public void volar() {
        if (energia >= 20) {
            System.out.println(nombre + " vuela en círculos sobre la llanura");
            energia -= 20;
        } else {
            System.out.println(nombre + " no tiene energía para volar");
        }
    }
    
    @Override
    public void planear() {
        if (energia >= 10) {
            System.out.println(nombre + " planea aprovechando las corrientes de aire");
            energia -= 10;
        }
    }
    
    @Override
    public double getAlturaMaximaVuelo() {
        return 100.0; // metros
    }
    
    // Método específico del Tero
    public void defenderNido() {
        if (energia >= 15) {
            System.out.println(nombre + " defiende agresivamente su nido con gritos y vuelos rasantes");
            energia -= 15;
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Envergadura: " + envergaduraAlas + "cm - En nido: " + estaEnNido);
    }
}