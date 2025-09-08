/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/*
ZOOLÓGICO VIRTUAL - Abstracción + Polimorfismo
Conceptos: abstract class, abstract methods, métodos obligatorios,
plantillas, polimorfismo con clases abstractas
*/

// CLASE ABSTRACTA - Animal (NO se puede instanciar directamente)
abstract class Animal {
    // Atributos protegidos (accesibles por clases hijas)
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String especie;
    
    // Constructor - solo pueden usarlo las clases hijas
    public Animal(String nombre, int edad, double peso, String especie) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setPeso(peso);
        this.especie = especie;
    }
    
    // GETTERS Y SETTERS (mismos de antes)
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public String getEspecie() { return especie; }
    
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
            this.nombre = "Sin nombre";
        }
    }
    
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 100 años");
            this.edad = 0;
        }
    }
    
    public void setPeso(double peso) {
        if (peso > 0 && peso <= 10000) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser positivo y menor a 10000 kg");
            this.peso = 1.0;
        }
    }
    
    // MÉTODOS CONCRETOS - Implementados en la clase abstracta
    // Todos los animales los heredarán tal como están
    public void dormir() {
        System.out.println(nombre + " esta durmiendo...");
    }
    
    public void respirar() {
        System.out.println(nombre + " esta respirando");
    }
    
    public void mostrarInfo() {
        System.out.println(getNombre() + " (" + getEspecie() + ") - " + 
                          getEdad() + " anios, " + getPeso() + " kg");
    }
    
    public void cumplirAnios() {
        setEdad(edad + 1);
        System.out.println(nombre + " cumplio anios! Ahora tiene " + edad + " anios");
    }
    
    // MÉTODOS ABSTRACTOS - NO tienen implementación
    // Las clases hijas DEBEN implementarlos (es obligatorio)
    public abstract void comer();          // Cada animal come diferente
    public abstract void hacerSonido();    // Cada animal suena diferente
    public abstract void moverse();        // Cada animal se mueve diferente
    public abstract String getTipoHabitat(); // Cada animal vive en un lugar diferente
    
    // MÉTODO CONCRETO que usa metodos abstractos
    // Demuestra como la clase abstracta puede "coordinar" comportamientos
    public void rutinaDiaria() {
        System.out.println("~ Rutina diaria de " + nombre + " ~");
        System.out.println("Despertando...");
        respirar();
        
        System.out.println("Hora de desayunar...");
        comer(); // Método abstracto - cada animal come diferente
        
        System.out.println("Moviendose por su habitat: " + getTipoHabitat());
        moverse(); // Método abstracto - cada animal se mueve diferente
        
        System.out.println("Comunicandose...");
        hacerSonido(); // Método abstracto - cada animal suena diferente
        
        System.out.println("Hora de descansar...");
        dormir();
        
        System.out.println("Rutina completada para " + nombre);
        System.out.println();
    }
}