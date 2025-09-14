/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

public class HabitatMontaña {
    public static void main(String[] args) {
        // Animales
        Animal condor = new Condor("Andes", 12, 15.0);
        Puma puma = new Puma("Yaguá", 7, 80.0, 72.0, 60.0);

        // Cazador (implementación de la interfaz)
        Cazador2 cazador = new Cazador2("Don Ramón");

        // Mostrar información inicial
        condor.mostrarInfo();
        puma.mostrarInfo();
        puma.mostrarDetalles();

        // Interacciones entre los animales
        condor.hacerSonido();
        puma.hacerSonido();

        condor.moverse();
        puma.moverse();

        condor.jugar("Puma Yaguá");
        puma.comer();

        // Interacciones con el cazador
        cazador.observar(condor);
        cazador.estrategiaCaza();

        // Estado final
        condor.mostrarInfo();
        puma.mostrarInfo();
    }
}

