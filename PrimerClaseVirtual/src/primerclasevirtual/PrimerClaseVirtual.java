/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {
     public static void main(String[] args) {
        System.out.println("~ZOOLOGICO VIRTUAL - INTERFACES Y POLIMORFISMO COMPLETO~");
        
        // Creando animales con diferentes capacidades
        Elefante dumbo = new Elefante("Dumbo", 15, 4500.0, 1.8, true);
        Puma sombra = new Puma("Sombra", 4, 70.0, 80.0, 60.0);
        Pinguino pingu = new Pinguino("Pingu", 3, 5.0, 0.8, 10.0);
        Aguila altair = new Aguila("Altair", 7, 4.5, 2.2);
        Lemur bongo = new Lemur("Bongo", 5, 15.0, 0.7, "Capuchino");
        
        
        System.out.println("~ POLIMORFISMO POR SOBRECARGA - Diferentes formas de dormir ~");
        
        // Mismo método 'dormir' con diferentes parametros
        pingu.dormir();                        // Sin parametros
        pingu.dormir(8);                       // Con duracion
        pingu.dormir("cueva de hielo");        // Con lugar
        pingu.dormir(6, "nido calido");        // Con duracion Y lugar
        
        System.out.println();
        
        // Mismo método 'jugar' con diferentes parámetros
        altair.jugar();                        // Solo
        altair.jugar("Bongo");                 // Con companiero
        altair.jugar("Pingu", 30);             // Con companiero y tiempo
        
        System.out.println();
        
        System.out.println("~ INTERFACES - Capacidades especificas ~");
        
        // Polimorfismo con interfaces - podemos tratar objetos por sus capacidades
        System.out.println("~ Animales nadadores ~");
        Nadador nadador = pingu; // Polimorfismo: Pinguino ES UN Nadador
        nadador.nadar();
        nadador.sumergirse(50);
        nadador.respirarEnAgua(); // Metodo default de la interface
        
        System.out.println();
        
        System.out.println("~ Animales voladores ~");
        Volador volador = altair; // Polimorfismo: Aguila ES UN Volador
        volador.volar();
        volador.planear();
        System.out.println("Altura maxima de vuelo: " + volador.getAlturaMaximaVuelo() + "m");
        volador.aterrizar(); // Metodo default
        
        System.out.println();
        
        System.out.println("~ Animales cazadores ~");
        Cazador cazador = altair; // Polimorfismo: Aguila ES UN Cazador
        System.out.println("Presa preferida: " + cazador.getTipoPresa());
        cazador.estrategiaCaza(); // Metodo default que usa los implementados
        
        System.out.println();
        
        System.out.println("~Animales trepadores ~");
        Trepador trepador = bongo; // Polimorfismo: Lemur ES UN Trepador
        trepador.trepar();
        trepador.escalar("arbol alto");
        trepador.escalar("pared lisa"); // No puede trepar en esto
        
        System.out.println();
        
        System.out.println("~DEMOSTRACION DE MULTIPLES INTERFACES ~");
        System.out.println("El aguila implementa Volador Y Cazador:");
        
        // altair implementa MÚLTIPLES interfaces
        if (altair instanceof Volador) {
            System.out.println("Altair ES un volador");
        }
        if (altair instanceof Cazador) {
            System.out.println("Altair ES un cazador");
        }
        if (altair instanceof Nadador) {
            System.out.println("Altair ES un nadador");
        } else {
            System.out.println("Altair NO es un nadador");
        }
        
        System.out.println();
        
        System.out.println("~ POLIMORFISMO CON ARRAYS DE INTERFACES ~");
        
        // Array de nadadores (solo animales que implementen Nadador)
        Nadador[] nadadores = {pingu}; // Solo pingu puede nadar
        System.out.println("Actividades acuaticas:");
        for (Nadador n : nadadores) {
            Animal animal = (Animal) n; // Cast para acceder a metodos de Animal
            System.out.println("- " + animal.getNombre() + " (Energia: " + animal.getEnergia() + "%)");
            n.nadar();
            n.sumergirse(30);
        }
        
        System.out.println();
        
        // Array de voladores
        Volador[] voladores = {altair}; // Solo altair puede volar
        System.out.println("Actividades de vuelo:");
        for (Volador v : voladores) {
            Animal animal = (Animal) v;
            System.out.println("- " + animal.getNombre() + " (Energia: " + animal.getEnergia() + "%)");
            v.volar();
            v.planear();
        }
        
        System.out.println();
        
        System.out.println("~ REGLAS DE NEGOCIO - Control de energia ~");
        
        // Mostrar cómo la energía afecta las acciones
        Animal[] animales = {pingu, altair, bongo, sombra, dumbo};
        
        System.out.println("Estado inicial de energia:");
        for (Animal animal : animales) {
            animal.mostrarInfo();
        }
        
        System.out.println("Realizando muchas actividades para cansar a los animales...");
        
        // Cansar a los animales
        pingu.nadar();
        pingu.sumergirse(80);
        pingu.moverse();
        
        altair.volar();
        altair.atacar();
        altair.volar();
        
        bongo.trepar();
        bongo.columpiar();
        bongo.moverse();
        
        System.out.println("Estado despues de actividades:");
        for (Animal animal : animales) {
            animal.mostrarInfo();
        }
        
        System.out.println("Intentando mas actividades con poca energia:");
        // dumbo.nadar(); // No debería poder
        sombra.correr(); // No debería poder  
        pingu.sumergirse(50);
        altair.volar(); // No debería poder
        bongo.trepar(); // No debería poder
        
        System.out.println("Recargando energia durmiendo...");
        dumbo.dormir(8, "orilla del rio");
        sombra.dormir(6, "cueva en las montanias");
        pingu.dormir("nido calido");
        altair.dormir(7);
        bongo.dormir("copa del arbol");
        
        System.out.println("Estado despues de descansar:");
        for (Animal animal : animales) {
            animal.mostrarInfo();
        }
        
        System.out.println("~ DEMOSTRANDO COMPORTAMIENTOS ESPECIFICOS DESPUES DEL DESCANSO ~");
        
        System.out.println("Comportamientos unicos de Dumbo:");
        dumbo.duchar();
        dumbo.mostrarDetalles();
        
        System.out.println("Comportamientos unicos de Sombra:");
        sombra.cazar();
        sombra.mostrarDetalles();
        
        System.out.println("Comportamientos unicos de Pingu:");
        pingu.deslizar();
        
        System.out.println("Comportamientos unicos de Altair:");
        altair.planear();
        
        System.out.println("Comportamientos unicos de Bongo:");
        bongo.columpiar();
        
        System.out.println("~RESUMEN DE CONCEPTOS DEMOSTRADOS~");
        System.out.println("HERENCIA: Todas las clases extienden Animal");
        System.out.println("ABSTRACCION: Animal es abstracta, define metodos obligatorios");
        System.out.println("INTERFACES: Definen capacidades especificas (Nadador, Volador, etc.)");
        System.out.println("POLIMORFISMO (Sobrecarga): dormir(), jugar() con diferentes parametros");
        System.out.println("POLIMORFISMO (Interfaces): tratar objetos por sus capacidades");
        System.out.println("MULTIPLES IMPLEMENTACIONES: Aguila implementa Volador Y Cazador");
        System.out.println("REGLAS DE NEGOCIO: Control de energia, validaciones, restricciones");
        System.out.println("ENCAPSULACION: Atributos privados con getters/setters validados");
        
        System.out.println("Proyecto completado con exito!");
    }
}