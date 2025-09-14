/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class MonoAullador extends Animal implements SelvaTropical{

    public MonoAullador(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo hojas, frutas y brotes tiernos.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " dice: HU HU HA HA" );
    }
    
    @Override
    public void moverse(){
        System.out.println(nombre + " se está moviendo saltando de un árbol a otro.");
    }
    
    @Override
    public String getTipoHabitat(){
        return nombre + " vive en el habitat Selva Tropical";
    }
    
    @Override
    public void cazar(Animal presa){
        System.out.print(nombre + " no es depredador de ningun animal. ");
        System.out.println("Por eso no puede cazar a " + presa.getNombre());
    }
    
    @Override
    public void protegerseDeDepredador(Animal depredador){
        System.out.println(nombre + " esta escondido protegiendose de: " + depredador.getNombre());
    }
    
    @Override
    public void descansar() {
        System.out.println(nombre + " descansa en las ramas de un árbol.");
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
