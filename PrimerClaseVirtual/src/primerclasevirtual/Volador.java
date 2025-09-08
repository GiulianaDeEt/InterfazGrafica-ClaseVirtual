/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerclasevirtual;
// INTERFACES - Contratos que definen QUÉ pueden hacer los animales
// Una clase puede implementar MÚLTIPLES interfaces (no pasa con herencia)
public interface Volador {
    void volar();
    void planear();
    double getAlturaMaximaVuelo();
    
    default void aterrizar() {
        System.out.println("Desciende gradualmente y aterriza suavemente");
    }
}
