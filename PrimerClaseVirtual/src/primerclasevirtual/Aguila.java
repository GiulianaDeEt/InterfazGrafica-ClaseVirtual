/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

// AGUILA - Implementa Animal + Volador + Cazador (multiples interfaces)
class Aguila extends Animal implements Volador, Cazador {
    private double envergaduraAlas;
    private double alturaMaximaVuelo;
    
    public Aguila(String nombre, int edad, double peso, double envergaduraAlas) {
        super(nombre, edad, peso, "Aquila chrysaetos");
        this.setEnvergaduraAlas(envergaduraAlas);
        this.alturaMaximaVuelo = 4000.0; // metros
    }
    
    public double getEnvergaduraAlas() { return envergaduraAlas; }
    
    public void setEnvergaduraAlas(double envergaduraAlas) {
        if (envergaduraAlas >= 1.0 && envergaduraAlas <= 3.0) {
            this.envergaduraAlas = envergaduraAlas;
        } else {
            System.out.println("Error: La envergadura debe estar entre 1 y 3 metros");
            this.envergaduraAlas = 2.0;
        }
    }
    
    // Implementación de Animal
    @Override
    public void comer() {
        System.out.println("   " + nombre + " devora su presa con su pico afilado");
        energia = Math.min(100, energia + 30);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " grita imponentemente: 'SCREEECH!'");
    }
    
    @Override
    public void moverse() {
        // Puede elegir volar o caminar
        if (energia >= 25) {
            volar(); // Usa metodo de Volador
        } else {
            System.out.println("   " + nombre + " camina por el suelo (sin energia para volar)");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "montanias y acantilados";
    }
    
    // Implementación de Volador
    @Override
    public void volar() {
        if (energia >= 25) {
            System.out.println("   " + nombre + " vuela majestuosamente con " + envergaduraAlas + "m de envergadura");
            energia -= 20;
        } else {
            System.out.println("   " + nombre + " no tiene energia para volar");
        }
    }
    
    @Override
    public void planear() {
        if (energia >= 10) {
            System.out.println(nombre + " planea aprovechando las corrientes termicas");
            energia -= 8; // Planear gasta menos que volar
        } else {
            System.out.println(nombre + " no puede planear sin energia");
        }
    }
    
    @Override
    public double getAlturaMaximaVuelo() {
        return alturaMaximaVuelo;
    }
    
    // Implementacion de Cazador
    @Override
    public void acechar() {
        System.out.println("   " + nombre + " observa desde las alturas con vista aguda");
    }
    
    @Override
    public void atacar() {
        if (energia >= 30) {
            System.out.println("   " + nombre + " se lanza en picada a gran velocidad");
            energia -= 25;
        } else {
            System.out.println("   " + nombre + " no tiene energia para atacar");
        }
    }
    
    @Override
    public String getTipoPresa() {
        return "roedores, peces y aves pequeñas";
    }
}
