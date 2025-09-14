/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

public class Condor extends Animal {
    public Condor(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Cóndor");
    }

    @Override
    public void comer() {
        if (energia <= 90) {
            System.out.println(nombre + " se alimenta de carroña.");
            energia = Math.min(100, energia + 15);
        } else {
            System.out.println(nombre + " no tiene hambre.");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " emite un graznido fuerte.");
    }

    @Override
    public void moverse() {
        if (energia >= 20) {
            System.out.println(nombre + " planea majestuosamente sobre las montañas.");
            energia -= 20;
        } else {
            System.out.println(nombre + " está cansado y no puede volar.");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Montaña";
    }
}

