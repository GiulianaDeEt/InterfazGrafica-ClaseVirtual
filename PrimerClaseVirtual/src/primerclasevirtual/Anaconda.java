/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

public class Anaconda extends Animal implements Cazador, Nadador, Pantano {
    private int velocidad;
    private int camuflaje;

    public Anaconda(String nombre, int edad, double peso, int velocidad, int camuflaje) {
        super(nombre, edad, peso, "Anaconda");
        this.velocidad = velocidad;
        this.camuflaje = camuflaje;
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
        System.out.println(nombre + " ataca rápidamente y envuelve a su presa.");
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
            velocidad -= 20;
            System.out.println("Llueve: la velocidad baja a " + velocidad);

            CrecerVegetacion();

            camuflaje += 15;
            System.out.println("La vegetación crece y el camuflaje sube a " + camuflaje);

        } else if (clima.equalsIgnoreCase("Seco")) {
            velocidad -= 10;
            camuflaje -= 5;
            System.out.println("El pantano se seca: velocidad " + velocidad + " | camuflaje " + camuflaje);
        } else {
            System.out.println("El clima no afecta al pantano.");
        }
    }
}
