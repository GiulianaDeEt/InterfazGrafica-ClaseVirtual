/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerclasevirtual;

// INTERFACES - Contratos que definen QUE pueden hacer los animales
// Una clase puede implementar MULTIPLES interfaces (no pasa con herencia)
public interface Cazador {
    void acechar();
    void atacar();
    String getTipoPresa();
    
    // Método por defecto con logica
    default void estrategiaCaza() {
        System.out.println("Inicia la caza:");
        acechar();
        atacar();
        System.out.println("Caza completada");
    }
}