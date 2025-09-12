/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author agusn
 */
public abstract class Grizzly extends Animal implements HabitatTundra {

    private boolean Cansadaso() {
        return this.energia <= 0;
    }

    public Grizzly(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void ProtegersedelFrio() {
        if (!Cansadaso()) {
            this.energia -= 20;
            System.out.println(nombre + " está en busqueda de refugio");
        } else {
            System.out.println(nombre + " está cansadaso culia");
        }

    }

    @Override
    public void comer() {
        this.energia -= 20;
        System.out.println(nombre + " está comiendo hojas, frutas y brotes tiernos.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: brrrrrr anuel");
    }

    @Override
    public void moverse() {
        if(!Cansadaso()){
            this.energia -= 20;
            System.out.println(nombre + " se está moviendo");
        } else {
            System.out.println(nombre + " está cansadaso culia");
        }
      
    }

    @Override
    public String getTipoHabitat() {
        return nombre + " vive en el habitat Tundra";
    }

    @Override
    public void Atacar(Animal Presa) {
        if (!Cansadaso()) {
            System.out.println(nombre + " atata a: " + Presa.getNombre());;
        } else {
            System.out.println(nombre + " está cansadaso culia");
        }
    }

    @Override
    public void Reproducirse(Animal Pareja) {
         
        if (!Cansadaso()) {
            System.out.println(nombre + " se estátirando a:" + Pareja.getNombre());
        } else {
            System.out.println(nombre + " está cansadaso culia");
        }
    }

}
