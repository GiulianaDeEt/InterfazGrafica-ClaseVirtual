package primerclasevirtual;

import java.util.Random;

public class Cocodrilo extends Animal implements Nadador, Pantano {
     
    private double velocidadNado;
    private int velocidad;
    private int camuflaje;
    private int salud; // nueva: salud (HP)

    private Random rnd = new Random();
    
    public Cocodrilo(String nombre, int edad, double peso, double velocidadNado, int velocidad, int camuflaje) {
        super(nombre, edad, peso, "Crocodylus niloticus");
        this.velocidadNado = velocidadNado;
        this.velocidad = velocidad;
        this.camuflaje = camuflaje;
        this.salud = 100; // ejemplo: cocodrilo más resistente
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
     @Override
    public void CrecerVegetacion() {
        System.out.println("Las plantas acuáticas del pantano crecen densamente.");
    }
    // ==== COMBATE ====
    public boolean estaVivo() {
        return salud > 0;
    }

    public void recibirDanio(int danio) {
        salud -= danio;
        if (salud < 0) salud = 0;
        System.out.println(nombre + " recibe " + danio + " de daño. (Salud ahora: " + salud + ")");
    }

    // Ataque directo a Anaconda
    public int atacarA(Anaconda objetivo) {
        int base = 25;
        int variacion = rnd.nextInt(11) - 5; // -5..+5
        int danio = Math.max(1, base + variacion + velocidad/10);
        System.out.println(nombre + " muerde a " + objetivo.getNombre() + " e inflige " + danio + " de daño.");
        objetivo.recibirDanio(danio);
        energia = Math.max(0, energia - 12);
        return danio;
    }

    // Ataque genérico
    public int atacarA(Animal objetivo) {
        int base = 18;
        int variacion = rnd.nextInt(11) - 5;
        int danio = Math.max(1, base + variacion + velocidad/10);
        System.out.println(nombre + " intenta un ataque y causa " + danio + " de daño a " + objetivo.getNombre());
        try {
            objetivo.getClass().getMethod("recibirDanio", int.class).invoke(objetivo, danio);
        } catch (Exception ex) {
            System.out.println("El objetivo no puede recibir daño directamente.");
        }
        energia = Math.max(0, energia - 12);
        return danio;
    }

    public int getSalud() {
        return salud;
    }

    public void mostrarEstado() {
        System.out.println(getNombre() + " - Salud: " + salud + " | Energia: " + energia + " | Velocidad: " + velocidad + " | Camuflaje: " + camuflaje);
    }
}
