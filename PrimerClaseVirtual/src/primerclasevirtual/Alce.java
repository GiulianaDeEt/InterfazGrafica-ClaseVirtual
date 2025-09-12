/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Benja
 */
public class Alce extends Animal implements HabitatTundra {

    private double altura;

    public Alce(double altura,double longitud, String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, "Alces alces");
        setAltura(altura);
    }

    public void setAltura(double altura) {
        if (altura >= 1.4 && altura <= 2.1) {
            this.altura = altura;
        } else {
            System.out.println("Error: El alce debe medir mas de 1,4 metros y menos de 2,1 metros");
            this.altura = 2;
        }
    }

    public double getAltura() {return altura;}

    private boolean estaCansado() {
        return this.energia <= 0;
    }

    //Metodos clase Animal
    @Override
    public void comer() {
        if (!estaCansado()) {
            System.out.println("El alce se alimenta de hojas, ramas y líquenes de la tundra.");
            this.energia -= 5;
        } else {
            System.out.println("El alce está demasiado cansado para comer.");
        }
    }

    @Override
    public void hacerSonido() {
        if (!estaCansado()) {
            System.out.println("El alce emite un fuerte bramido para comunicarse o advertir su presencia.");
            this.energia -= 2;
        } else {
            System.out.println("El alce está demasiado cansado para hacer sonidos.");
        }
    }

    @Override
    public void moverse() {
        if (!estaCansado()) {
            System.out.println("El alce camina lentamente sobre la nieve, usando sus largas patas para desplazarse.");
            this.energia -= 10;
        } else {
            System.out.println("El alce está demasiado cansado para moverse.");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Tundra y bosques boreales de regiones frías del hemisferio norte";
    }

    //Metodos Tundra
    @Override
    public void ProtegersedelFrio() {
        if (!estaCansado()) {
            System.out.println("El alce se protege del frío gracias a su grueso pelaje y acumulando grasa en invierno.");
            this.energia -= 5;
        } else {
            System.out.println("El alce está demasiado cansado para resistir activamente el frío.");
        }
    }

    @Override
    public void Atacar(Animal presa) {
        if (!estaCansado()) {
            System.out.println("El alce no caza, pero puede atacar con sus poderosos cuernos para defenderse de " + presa.getNombre() + ".");
            this.energia -= 15;
        } else {
            System.out.println("El alce está cansado y no puede defenderse bien.");
        }
    }

    @Override
    public void Reproducirse(Animal pareja) {
        if (!estaCansado()) {
            System.out.println("El alce se reproduce con " + pareja.getNombre() + " durante la temporada de apareamiento.");
            this.energia -= 20;
        } else {
            System.out.println("El alce está demasiado cansado para reproducirse.");
        }
    }
}
