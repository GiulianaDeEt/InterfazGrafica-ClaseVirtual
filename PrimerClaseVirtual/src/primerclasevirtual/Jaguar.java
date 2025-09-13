/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author manuel
 */

class Jaguar extends Animal implements SelvaTropical{
    public Jaguar(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo un animal que acaba de cazar.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " dice gravente como si fuera un tosido: ha-ha-ha-ha" );
    }
    
    @Override
    public void moverse(){
        System.out.println(nombre + " se está moviendo de manera silenciosa, ágil y sigilosa.");
    }
    
    @Override
    public String getTipoHabitat(){
        return nombre + " vive en el habitat Selva Tropical";
    }
    
    @Override
    public void cazar(Animal presa){
        System.out.print(nombre + " es un superdepredador. ");
        System.out.println("Por eso puede cazar a " + presa.getNombre());
    }
    
    @Override
    public void descansar() {
        System.out.println(nombre + " descansa escondido bajo un árbol.");
    }

    @Override
    public void competirPorAlimento(Animal rival) {
        System.out.println(nombre + " compite por alimento contra: " + rival.getNombre());
    }

    @Override
    public void compartirAlimento(Animal companiero) {
        System.out.println(nombre + " comparte frutas con su compañero: " + companiero.getNombre());
    }
}
