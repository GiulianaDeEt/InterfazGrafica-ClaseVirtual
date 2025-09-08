/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerclasevirtual;

// INTERFACES - Contratos que definen QUE pueden hacer los animales
// Una clase puede implementar MULTIPLES interfaces (no pasa con herencia)
public interface Nadador {
    // Métodos abstractos (implícitamente public abstract)
    void nadar();
    void sumergirse(int profundidadMetros);
    double getVelocidadNado();
    
    // Método con implementación por defecto (desde Java 8)
    default void respirarEnAgua() {
        System.out.println("Sale a la superficie para respirar");
    }
}