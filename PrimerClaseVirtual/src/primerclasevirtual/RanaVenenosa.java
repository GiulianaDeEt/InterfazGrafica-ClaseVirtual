/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class RanaVenenosa extends Animal implements SelvaTropical{

    public RanaVenenosa(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo insectos pequeños y hormigas.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " hace un suave croar: croac, croac.");
    }
    
    @Override
    public void moverse(){
        System.out.println(nombre + " se mueve dando pequeños saltos entre hojas y ramas.");
    }
    
    @Override
    public String getTipoHabitat(){
        return nombre + " vive en el hábitat de la Selva Tropical, generalmente cerca del agua.";
    }
    
    @Override
    public void cazar(Animal presa){
        System.out.println(nombre + " caza insectos pequeños como moscas o hormigas.");
        System.out.println("En este caso intenta atrapar a " + presa.getNombre());
    }
    
    @Override
    public void protegerseDeDepredador(Animal depredador){
        System.out.println(nombre + " se protege liberando su veneno contra: " + depredador.getNombre());
    }
    
    @Override
    public void descansar() {
        System.out.println(nombre + " descansa sobre una hoja húmeda.");
    }

    @Override
    public void competirPorAlimento(Animal rival) {
        System.out.println(nombre + " compite por insectos con: " + rival.getNombre());
    }

    @Override
    public void compartirAlimento(Animal companiero) {
        System.out.println(nombre + " no suele compartir alimento, pero permanece cerca de: " + companiero.getNombre());
    }
}
