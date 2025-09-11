/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class MonoAullador extends Animal {

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
    

}
