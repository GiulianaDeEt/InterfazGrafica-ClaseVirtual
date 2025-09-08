/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

// CLASES HIJAS - DEBEN implementar todos los métodos abstractos
class Elefante extends Animal {
   private double longitudTrompa;
    private boolean tieneColmillos;
    
    public Elefante(String nombre, int edad, double peso, double longitudTrompa, boolean tieneColmillos) {
        super(nombre, edad, peso, "Loxodonta africana");
        this.setLongitudTrompa(longitudTrompa);
        this.tieneColmillos = tieneColmillos;
    }
    
    // Getters y Setters específicos
    public double getLongitudTrompa() { return longitudTrompa; }
    public boolean isTieneColmillos() { return tieneColmillos; }
    
    public void setLongitudTrompa(double longitudTrompa) {
        if (longitudTrompa >= 0.5 && longitudTrompa <= 3.0) {
            this.longitudTrompa = longitudTrompa;
        } else {
            System.out.println("Error: La trompa debe medir entre 0.5 y 3 metros");
            this.longitudTrompa = 1.5;
        }
    }
    
    // IMPLEMENTACIÓN OBLIGATORIA de métodos abstractos
    @Override
    public void comer() {
        System.out.println("   " + nombre + " usa su trompa de " + longitudTrompa + "m para agarrar hierba y frutas");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " barita fuertemente: 'PFFFRRRR!'");
    }
    
    @Override
    public void moverse() {
        System.out.println("   " + nombre + " camina pesadamente haciendo temblar el suelo");
    }
    
    @Override
    public String getTipoHabitat() {
        return "sabana africana";
    }
    
    // Métodos específicos del elefante
    public void usarTrompa() {
        System.out.println(nombre + " usa su trompa de " + longitudTrompa + " metros para diferentes tareas");
    }
    
    public void duchar() {
        System.out.println(nombre + " se ducha rociandose agua con su trompa");
    }
    
    public void mostrarDetalles() {
        String colmillos = tieneColmillos ? "con colmillos" : "sin colmillos"; //version resumida de in if-else
        System.out.println(getNombre() + " - Trompa: " + longitudTrompa + "m, " + colmillos);
    }
}