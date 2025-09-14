/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {

    public static void main(String[] args) {
        System.out.println("~ECOSISTEMA VIRTUAL~");

        MonoAullador titi = new MonoAullador("Titi", 3, 14.4, "Alouatta caraya");
        Perezoso perez = new Perezoso("Perez", 5, 43, "");
        Guacamayo lolo = new Guacamayo("Lolo", 2, 1.4, "");
        
        
        
        MonoAullador moncholo = new MonoAullador("Moncholo", 5, 16.2, "Alouatta caraya");
        MonoAullador peporro = new MonoAullador("Peporro", 3, 15.0, "Alouatta caraya");

        titi.comer();
        titi.hacerSonido();
        titi.moverse();
        System.out.println(titi.getTipoHabitat());

        
        //METODOS INDIVIDUALES
        if (titi instanceof SelvaTropical) {
            titi.cazar(perez);
            titi.protegerseDeDepredador(lolo);
            titi.descansar();
            titi.competirPorAlimento(moncholo);
            titi.compartirAlimento(peporro);
        }
        
        //INTERACCIONES

    }
}
