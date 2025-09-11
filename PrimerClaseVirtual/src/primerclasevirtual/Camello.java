package primerclasevirtual;

public class Camello extends Animal implements Habitat_Desierto {
    private int jorobas;
    private double velocidad;

    
    public Camello(String nombre, int edad, double peso, int jorobas, double velocidad) {
        super(nombre, edad, peso, "Camelus dromedarius");
        this.jorobas = jorobas;
        this.velocidad = velocidad;
    }

    public int getJorobas() { return jorobas; }
    public double getVelocidad() { return velocidad; }
    

    public void setJorobas(int jorobas) {
        if (jorobas == 1 || jorobas == 2) {
            this.jorobas = jorobas;
        } else {
            System.out.println("Error: Un camello solo puede tener 1 o 2 jorobas");
            this.jorobas = 1;
        }
    }

    public void setVelocidad(double velocidad) {
        if (velocidad >= 5 && velocidad <= 65) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Error: Velocidad de camello fuera de rango (5-65 km/h)");
            this.velocidad = 40;
        }
    }
    
    @Override
    public void moverse() {
        System.out.println("   " + nombre + " camina lentamente por las dunas del desierto");
    }
    
    @Override
    public void comer() {
        System.out.println("   " + nombre + " mastica plantas del desierto");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " gruñe: 'GRRRRR!'");
    }
    
    @Override
    public String getTipoHabitat() {
        return "desierto";
    }

    // Método Propio
    public void almacenarAgua() {
        System.out.println("   " + nombre + " almacena agua en sus " + jorobas + " jorobas");
    }
}
