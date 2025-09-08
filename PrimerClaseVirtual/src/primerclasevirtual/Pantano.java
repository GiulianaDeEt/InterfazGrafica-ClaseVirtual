/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Alumno
 */
public interface Pantano { 
    void CrecerVegetacion();

    default void reaccionaconClima(String Clima, int Velocidad, int camuflaje) {
        if (Clima.equalsIgnoreCase("Lluvia")) {
            Velocidad -= 20;
            System.out.println("El pantano se inunda, la velocidad baja a " + Velocidad);
            
            CrecerVegetacion();
            camuflaje =+ 15;
            System.out.println("La vegetación crece y el camuflaje sube a " + camuflaje);
            
        } else if (Clima.equalsIgnoreCase("Seco")) {
            System.out.println("El pantano se seca, la vegetación deja de crecer y el camuflaje baja.");
        } else {
            System.out.println("El clima no afecta al pantano.");
        }
    }
}
