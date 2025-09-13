package primerclasevirtual;

import java.util.Random;

public class Anaconda extends Animal implements Cazador, Nadador, Pantano {
    private int velocidad;
    private int camuflaje;
    private int salud; // nueva: salud (HP)

    private Random rnd = new Random();

    public Anaconda(String nombre, int edad, double peso, int velocidad, int camuflaje) {
        super(nombre, edad, peso, "Anaconda");
        this.velocidad = velocidad;
        this.camuflaje = camuflaje;
        this.salud = 65; // valor ejemplo
    } 

    // ===================== MÉTODOS ABSTRACTOS DE ANIMAL =====================
    @Override
    public void comer() {
        if (energia >= 30) {
            System.out.println(nombre + " devora a su presa...");
            energia = Math.min(100, energia + 20);
        } else {
            System.out.println(nombre + " está demasiado cansada para cazar.");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " sisea fuertemente...");
    }

    @Override
    public void moverse() {
        if (energia >= 10) {
            System.out.println(nombre + " se desliza sigilosamente por el suelo a velocidad " + velocidad);
            energia -= 10;
        } else {
            System.out.println(nombre + " está muy cansada para moverse.");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Pantano";
    }

    // ===================== INTERFAZ CAZADOR =====================
    @Override
    public void acechar() {
        System.out.println(nombre + " se esconde bajo el agua esperando a su presa...");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un ataque envolvente.");
    }

    @Override
    public String getTipoPresa() {
        return "Cocodrilo";
    }

    // ===================== INTERFAZ NADADOR =====================
    @Override
    public void nadar() {
        if (energia >= 5) {
            System.out.println(nombre + " nada suavemente en el pantano.");
            energia -= 5;
        } else {
            System.out.println(nombre + " está demasiado cansada para nadar.");
        }
    }

    @Override
    public void sumergirse(int profundidadMetros) {
        System.out.println(nombre + " se sumerge a " + profundidadMetros + " metros.");
    }

    @Override
    public double getVelocidadNado() {
        return 8.5; // metros por segundo (ejemplo)
    }

    // ===================== INTERFAZ PANTANO =====================
    @Override
    public void CrecerVegetacion() {
        System.out.println("Las plantas acuáticas del pantano crecen densamente.");
    }

    // Sobrescribimos reaccionaconClima para que afecte a los atributos reales
    @Override
    public void reaccionaconClima(String clima, int v, int c) {
        if (clima.equalsIgnoreCase("Lluvia")) {
            velocidad = Math.max(0, velocidad - 20);
            System.out.println("Llueve: la velocidad baja a " + velocidad);

            CrecerVegetacion();

            camuflaje += 15;
            System.out.println("La vegetación crece y el camuflaje sube a " + camuflaje);

        } else if (clima.equalsIgnoreCase("Seco")) {
            velocidad = Math.max(0, velocidad - 10);
            camuflaje = Math.max(0, camuflaje - 5);
            System.out.println("El pantano se seca: velocidad " + velocidad + " | camuflaje " + camuflaje);
        } else {
            System.out.println("El clima no afecta al pantano.");
        }
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

    // Ataque que devuelve el daño infligido (usa energia para decidir fuerza)
    public int atacarA(Cocodrilo objetivo) {
        int base = 20;
        int variacion = rnd.nextInt(11) - 5; // -5..+5
        int danio = Math.max(1, base + variacion + camuflaje/10);
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " e inflige " + danio + " de daño.");
        objetivo.recibirDanio(danio);
        // costar energia al atacante
        energia = Math.max(0, energia - 10);
        return danio;
    }

    // Para ataques genéricos (si el otro no es Cocodrilo)
    public int atacarA(Animal objetivo) {
        int base = 15;
        int variacion = rnd.nextInt(11) - 5;
        int danio = Math.max(1, base + variacion + camuflaje/10);
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " e inflige " + danio + " de daño.");
        // si el objetivo implementa recibirDanio específico, lo llamamos por reflexión simple:
        try {
            objetivo.getClass().getMethod("recibirDanio", int.class).invoke(objetivo, danio);
        } catch (Exception ex) {
            System.out.println("El objetivo no puede recibir daño directamente.");
        }
        energia = Math.max(0, energia - 10);
        return danio;
    }

    public int getSalud() {
        return salud;
    }

    public void mostrarEstado() {
        System.out.println(getNombre() + " - Salud: " + salud + " | Energia: " + energia + " | Velocidad: " + velocidad + " | Camuflaje: " + camuflaje);
    }
}
