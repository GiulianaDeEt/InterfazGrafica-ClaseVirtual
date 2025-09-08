package primerclasevirtual;

// CAPYBARA - Implementa Animal + Nadador
class Capybara extends Animal implements Nadador {
    private double longitud;
    private double velocidadNado;

    public Capybara(String nombre, int edad, double peso, double longitud, double velocidadNado) {
        super(nombre, edad, peso, "Hydrochoerus hydrochaeris");
        this.setLongitud(longitud);
        this.setVelocidadNado(velocidadNado);
    }

    // Getters y setters
    public double getLongitud() { return longitud; }

    public void setLongitud(double longitud) {
        if (longitud >= 0.8 && longitud <= 1.3) {
            this.longitud = longitud;
        } else {
            System.out.println("Error: La longitud de un capybara debe estar entre 0.8 y 1.3 metros");
            this.longitud = 1.0;
        }
    }

    public void setVelocidadNado(double velocidadNado) {
        if (velocidadNado >= 2 && velocidadNado <= 10) {
            this.velocidadNado = velocidadNado;
        } else {
            System.out.println("Error: La velocidad de nado de un capybara debe estar entre 2 y 10 km/h");
            this.velocidadNado = 5.0;
        }
    }

    // Implementación de los métodos abstractos de Animal
    @Override
    public void comer() {
        System.out.println("   " + nombre + " mastica pasto, hojas y frutos cerca del río");
        energia = Math.min(100, energia + 20);
    }

    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " emite un suave silbido o chillido característico");
    }

    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println("   " + nombre + " camina tranquilamente por la orilla");
            energia -= 7;
        } else {
            System.out.println("   " + nombre + " está demasiado cansado para moverse");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "zonas húmedas, riberas de ríos y pantanos";
    }

    // Implementación de la interfaz Nadador
    @Override
    public void nadar() {
        if (energia >= 12) {
            System.out.println(nombre + " nada relajadamente a " + velocidadNado + " km/h en el río");
            energia -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente energía para nadar");
        }
    }

    @Override
    public void sumergirse(int profundidadMetros) {
        if (energia >= 15 && profundidadMetros <= 5) {
            System.out.println(nombre + " se sumerge hasta " + profundidadMetros + " metros para refrescarse");
            energia -= 12;
        } else if (profundidadMetros > 5) {
            System.out.println(nombre + " no puede sumergirse tan profundo (máximo 5m)");
        } else {
            System.out.println(nombre + " no tiene energía para sumergirse");
        }
    }

    @Override
    public double getVelocidadNado() {
        return velocidadNado;
    }

    // Método específico del Capybara
    public void descansarEnGrupo() {
        if (energia >= 5) {
            System.out.println(nombre + " se recuesta en la orilla junto a su grupo de capybaras");
            energia = Math.min(100, energia + 5);
        } else {
            System.out.println(nombre + " está demasiado cansado incluso para descansar");
        }
    }
}