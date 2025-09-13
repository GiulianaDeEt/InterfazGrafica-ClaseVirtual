/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class Guacamayo extends Animal implements SelvaTropical {
    public Guacamayo(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo frutas, semillas y nueces.");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡GRAAACK! ¡KRAA!");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " vuela entre los árboles de la selva.");
    }
    
    @Override
    public String getTipoHabitat() {
        return nombre + " vive en el hábitat Selva Tropical.";
    }
    
    @Override
    public void cazar(Animal presa) {
        System.out.print(nombre + " no es un depredador. ");
        System.out.println("Por eso no puede cazar a " + presa.getNombre() + ".");
    }
    
    @Override
    public void protegerseDeDepredador(Animal depredador) {
        System.out.println(nombre + " se protege volando rápidamente para escapar de: " + depredador.getNombre());
    }
    
    @Override
    public void descansar() {
        System.out.println(nombre + " descansa en lo alto de un árbol, acomodándose en una rama.");
    }

    @Override
    public void competirPorAlimento(Animal rival) {
        System.out.println(nombre + " compite por frutas contra: " + rival.getNombre());
    }

    @Override
    public void compartirAlimento(Animal companiero) {
        System.out.println(nombre + " comparte semillas con su compañero: " + companiero.getNombre());
    }
}
