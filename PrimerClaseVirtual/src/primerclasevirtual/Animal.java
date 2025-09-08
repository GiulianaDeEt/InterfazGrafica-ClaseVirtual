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

// CLASE ABSTRACTA - Animal (misma de antes pero expandida)
abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String especie;
    protected int energia; // Nuevo atributo para demostrar reglas de negocio
    
    public Animal(String nombre, int edad, double peso, String especie) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setPeso(peso);
        this.especie = especie;
        this.energia = 100; // Todos inician con energia completa
    }
    
    // Getters básicos
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public String getEspecie() { return especie; }
    public int getEnergia() { return energia; }
    
    // Setters con validación (reglas de negocio)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }
    }
    
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 100 anios");
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
    
    // POLIMORFISMO POR SOBRECARGA - Multiples versiones del mismo metodo
    // Diferentes parametros = diferentes comportamientos
    
    // Dormir sin parametros (dormir normal)
    public void dormir() {
        System.out.println(nombre + " esta durmiendo...");
        energia = Math.min(100, energia + 30); // Recupera energia
    }
    
    // Dormir con duracion especifica (SOBRECARGA)
    public void dormir(int horas) {
        System.out.println(nombre + " duerme por " + horas + " horas");
        energia = Math.min(100, energia + (horas * 5));
    }
    
    // Dormir en un lugar especifico (SOBRECARGA)
    public void dormir(String lugar) {
        System.out.println(nombre + " duerme comodamente en " + lugar);
        energia = Math.min(100, energia + 40); // Dormir en lugar especifico da mas energia
    }
    
    // Dormir con duracion Y lugar (SOBRECARGA)
    public void dormir(int horas, String lugar) {
        System.out.println(nombre + " duerme por " + horas + " horas en " + lugar);
        energia = Math.min(100, energia + (horas * 8)); // Combinación da mas energia
    }
    
    // Jugar - otro ejemplo de sobrecarga
    public void jugar() {
        if (energia >= 20) {
            System.out.println(nombre + " juega solo");
            energia -= 15;
        } else {
            System.out.println(nombre + " esta muy cansado para jugar");
        }
    }
    
    public void jugar(String companiero) {
        if (energia >= 20) {
            System.out.println(nombre + " juega con " + companiero);
            energia -= 10; // Jugar acompañado cansa menos
        } else {
            System.out.println(nombre + " esta muy cansado para jugar con " + companiero);
        }
    }
    
    public void jugar(String companiero, int minutos) {
        if (energia >= minutos/2) {
            System.out.println(nombre + " juega con " + companiero + " por " + minutos + " minutos");
            energia -= minutos/3;
        } else {
            System.out.println(nombre + " no tiene suficiente energia para jugar " + minutos + " minutos");
        }
    }
    
    // Metodos concretos heredados
    public void respirar() {
        System.out.println(nombre + " esta respirando");
    }
    
    public void mostrarInfo() {
        System.out.println(getNombre() + " (" + getEspecie() + ") - " + 
                          getEdad() + " anios, " + getPeso() + " kg, Energia: " + energia + "%");
    }
    
    // Metodos abstractos (deben implementarse)
    public abstract void comer();
    public abstract void hacerSonido();
    public abstract void moverse();
    public abstract String getTipoHabitat();
}