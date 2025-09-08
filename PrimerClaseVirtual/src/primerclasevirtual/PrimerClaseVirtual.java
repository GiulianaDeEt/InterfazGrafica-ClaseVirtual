/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {
    public static void main(String[] args) {
        System.out.println("=== ZOOLOGICO CON ABSTRACCION ===");
        
        // NO PODEMOS hacer esto:
        // Animal animal = new Animal("Genérico", 1, 10, "Desconocida"); //  ERROR!
        // Porque Animal es abstracta
        
        System.out.println("=== CREANDO ANIMALES (clases concretas) ===");
        Elefante dumbo = new Elefante("Dumbo", 15, 4500.0, 1.8, true);
        Puma sombra = new Puma("Sombra", 4, 70.0, 80.0, 60.0);
        Pinguino pingui = new Pinguino("Pingui", 3, 5.0, 0.8, 10.0);
                
        System.out.println("Todos los animales creados correctamente");
        System.out.println("Cada clase DEBE implementar los metodos abstractos");
        
        // POLIMORFISMO - Array de clase abstracta
        Animal[] zoologico = {dumbo, sombra, pingui};
        
        System.out.println("~ INFORMACION GENERAL (polimorfismo) ");
        for (Animal animal : zoologico) {
            animal.mostrarInfo(); // Metodo concreto heredado
            System.out.println("   Habitat: " + animal.getTipoHabitat()); // Método abstracto implementado
        }
        
        System.out.println("~ RUTINAS DIARIAS (abstraccion + polimorfismo) ~");
        for (Animal animal : zoologico) {
            // La rutina es la MISMA para todos (metodo concreto en clase abstracta)
            // Pero cada paso se ejecuta DIFERENTE (metodos abstractos implementados)
            animal.rutinaDiaria();
        }
        
        System.out.println("~ COMPORTAMIENTOS ESPECIFICOS ~");
        System.out.println("Dumbo (comportamientos unicos de elefante):");
        dumbo.usarTrompa();
        dumbo.duchar();
        dumbo.mostrarDetalles();
        
        System.out.println("Sombra (comportamientos unicos de puma):");
        sombra.cazar();
        sombra.correr();
        sombra.mostrarDetalles();
        
        System.out.println("Pingui (comportamientos unicos de pinguino):");
        pingui.nadar();
        pingui.deslizar();
        pingui.mostrarDetalles();
        
        System.out.println("~ DEMOSTRANDO EL PODER DE LA ABSTRACCION ~");
        System.out.println("ABSTRACCION garantiza que:");
        System.out.println("NO se puede crear Animal generico: new Animal()");
        System.out.println("TODAS las clases hijas DEBEN implementar: comer(), hacerSonido(), moverse(), getTipoHabitat()");
        System.out.println("Tenemos una PLANTILLA comun (rutinaDiaria) que funciona para TODOS");
        System.out.println("Cada animal implementa los metodos A SU MANERA (polimorfismo)");
        System.out.println("Si agregamos un Leon, DEBE implementar todos los metodos abstractos");
        
        System.out.println("POLIMORFISMO permite:");
        System.out.println("Tratar a TODOS como Animal (mismo tipo)");
        System.out.println("Pero cada uno se COMPORTA segun su clase real");
        System.out.println("Una sola rutina funciona para TODOS los animales");
    }
}