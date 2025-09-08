/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

// CLASES HIJAS - DEBEN implementar todos los métodos abstractos
class Pinguino extends Animal {
    private double altura;
    private double velocidadNado;
    
    public Pinguino(String nombre, int edad, double peso, double altura, double velocidadNado) {
        super(nombre, edad, peso, "Spheniscus humboldti");
        this.setAltura(altura);
        this.setVelocidadNado(velocidadNado);
    }
    
    // Getters y Setters específicos
    public double getAltura() { return altura; }
    public double getVelocidadNado() { return velocidadNado; }
    
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
    
    // IMPLEMENTACIÓN OBLIGATORIA de métodos abstractos
    @Override
    public void comer() {
        System.out.println("   " + nombre + " come pescado fresco y krill");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " grazna alegremente: 'Cuak cuak!'");
    }
    
    @Override
    public void moverse() {
        System.out.println("   " + nombre + " camina bamboleandose y se desliza sobre su barriga");
    }
    
    @Override
    public String getTipoHabitat() {
        return "zonas frias";
    }
    
    // Métodos específicos del pingüino
    public void nadar() {
        System.out.println(nombre + " nada agilmente a " + velocidadNado + " km/h bajo el agua");
    }
    
    public void deslizar() {
        System.out.println(nombre + " se desliza sobre su barriga en el hielo");
    }
    
    public void mostrarDetalles() {
        System.out.println(getNombre() + " - Altura: " + altura + "m, Velocidad nado: " + velocidadNado + " km/h");
    }
}