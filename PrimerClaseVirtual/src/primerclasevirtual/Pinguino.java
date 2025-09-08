/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

// PINGUINO - Implementa Animal + Nadador (un pingüino SÍ puede nadar)
class Pinguino extends Animal implements Nadador {
    private double altura;
    private double velocidadNado;
    
    public Pinguino(String nombre, int edad, double peso, double altura, double velocidadNado) {
        super(nombre, edad, peso, "Spheniscus humboldti");
        this.setAltura(altura);
        this.setVelocidadNado(velocidadNado);
    }
    
    public double getAltura() { return altura; }
    
    public void setAltura(double altura) {
        if (altura >= 0.3 && altura <= 1.2) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe estar entre 0.3 y 1.2 metros");
            this.altura = 0.7;
        }
    }
    
    public void setVelocidadNado(double velocidadNado) {
        if (velocidadNado >= 5 && velocidadNado <= 15) {
            this.velocidadNado = velocidadNado;
        } else {
            System.out.println("Error: La velocidad de nado debe estar entre 5 y 15 km/h");
            this.velocidadNado = 8.0;
        }
    }
    
    // Implementación obligatoria de Animal (métodos abstractos)
    @Override
    public void comer() {
        System.out.println("   " + nombre + " come pescado fresco y krill");
        energia = Math.min(100, energia + 25);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " grazna alegremente: 'Cuak cuak!'");
    }
    
    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println("   " + nombre + " camina bamboleandose y se desliza sobre su barriga");
            energia -= 8;
        } else {
            System.out.println("   " + nombre + " esta demasiado cansado para moverse");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "zonas frias y oceano";
    }
    
    // Implementación obligatoria de Nadador (interface)
    @Override
    public void nadar() {
        if (energia >= 15) {
            System.out.println(nombre + " nada agilmente a " + velocidadNado + " km/h bajo el agua");
            energia -= 12;
        } else {
            System.out.println(nombre + " no tiene energia suficiente para nadar");
        }
    }
    
    @Override
    public void sumergirse(int profundidadMetros) {
        if (energia >= 20 && profundidadMetros <= 100) {
            System.out.println(nombre + " se sumerge hasta " + profundidadMetros + " metros buscando peces");
            energia -= 18;
        } else if (profundidadMetros > 100) {
            System.out.println(nombre + " no puede sumergirse tan profundo (maximo 100m)");
        } else {
            System.out.println(nombre + " no tiene energia para sumergirse");
        }
    }
    
    @Override
    public double getVelocidadNado() {
        return velocidadNado;
    }
    
    // Método específico del pingüino
    public void deslizar() {
        if (energia >= 5) {
            System.out.println(nombre + " se desliza divertidamente sobre su barriga en el hielo");
            energia -= 3; // Deslizarse gasta poca energía
        } else {
            System.out.println(nombre + " esta demasiado cansado para deslizarse");
        }
    }
}