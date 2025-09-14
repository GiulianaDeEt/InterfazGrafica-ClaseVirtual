/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Benja
 */
public class AnacondaVerde extends Animal implements SelvaTropical {

    private double longitud;
    private double diametro;

    public AnacondaVerde(double longitud, String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, "Eunectes murinus");
        setLongitud(longitud);
        setDiametro(diametro);
    }

    public void setLongitud(double longitud) {
        if (longitud >= 2 && longitud <= 11) {
            this.longitud = longitud;
        } else {
            System.out.println("Error: La anaconda debe medir mas de 2 metros y menos de 11 metros");
            this.longitud = 2;
        }
    }

    public void setDiametro(double diametro) {
        if (diametro >= 20 && diametro <= 45) {
            this.diametro = diametro;
        } else {
            System.out.println("Error: El diametro de la anaconda verde debe ser de al menos 20cm y menor a 45cm");
            this.diametro = 2;
        }
    }

    public double getLongitud() {
        return longitud;
    }

    public double getDiametro() {
        return diametro;
    }

    private boolean estaCansado(){
        return this.energia <= 0;
    }
    
    //Metodos clase Animal
    @Override
    public void comer() {
        if(!estaCansado()){
            System.out.println("La anaconda verde traga a su presa entera gracias a su mandíbula flexible.");
            this.energia -= 5;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public void hacerSonido() {
        if(!estaCansado()){
            System.out.println("La anaconda verde no emite sonidos fuertes, solo siseos suaves.");
            this.energia -= 2;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public void moverse() {
        if(!estaCansado()){
            System.out.println("La anaconda verde se desliza lentamente por el suelo o nada con gran agilidad en el agua.");
            this.energia -= 10;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public String getTipoHabitat() {
        return "Selva tropical de Sudamérica";
    }

// Métodos interface SelvaTropical
    @Override
    public void cazar(Animal presa) {
        if(!estaCansado()){
            System.out.println("La anaconda verde acecha y se enrolla alrededor de " + presa.getNombre() + " para asfixiarlo.");
            this.energia -= 25;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public void protegerseDeDepredador(Animal depredador) {
        if(!estaCansado()){
            System.out.println("La anaconda se sumerge en el agua o se camufla entre la vegetación para evitar a " + depredador.getNombre());
            this.energia -= 20;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public void descansar() {
        System.out.println("La anaconda verde descansa inmóvil entre las raíces y aguas tranquilas, recuperando fuerzas.");
        this.energia += 50;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    @Override
    public void competirPorAlimento(Animal rival) {
        if(!estaCansado()){
            System.out.println("La anaconda rara vez compite, pero puede enfrentarse a " + rival.getNombre() + " por presas grandes.");
            this.energia -= 30;
        }
        else System.out.println("La anaconda esta cansada");
    }

    @Override
    public void compartirAlimento(Animal companiero) {
        System.out.println("La anaconda verde no comparte su alimento, consume sola a su presa.");
    }
}
