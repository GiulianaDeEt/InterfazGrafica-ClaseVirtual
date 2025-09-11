/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {
     public static void main(String[] args) {
        System.out.println("~ECOSISTEMA VIRTUAL~");
        
        // Creando animales con diferentes capacidades
        Elefante dumbo = new Elefante("Dumbo", 15, 4500.0, 1.8, true);
        
        MonoAullador titi = new MonoAullador("Titi", 3, 14.4, "Alouatta caraya");
        MonoAullador moncholo = new MonoAullador("Moncholo", 5, 16.2, "Alouatta caraya");
        MonoAullador peporro = new MonoAullador("Peporro", 3, 15.0, "Alouatta caraya");
        
        titi.comer();
        titi.hacerSonido();
        titi.moverse();
        System.out.println(titi.getTipoHabitat());
        
        titi.cazar(dumbo);
        titi.protegerseDeDepredador(dumbo);
        titi.descansar();
        titi.competirPorAlimento(moncholo);
        titi.compartirAlimento(peporro);
        
    }
}
