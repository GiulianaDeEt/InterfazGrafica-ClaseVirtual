/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package primerclasevirtual;

public class PrimerClaseVirtual {
   public static void main(String[] args) {
      System.out.println("~ CREACION DE ANIMALES CON VALIDACIONES ~");
      
      Elefante dumbo = new Elefante("Dumbo", 12, 4000.0, 1.8, true);
      Puma sombra = new Puma("Sombra", 3, 65.0, 80.0, 50.0);
      Delfin flipper = new Delfin("Flipper", 5, 200.0, 30.0, true);

      System.out.println("~ DETALLES ESPECIFICOS ~");
      dumbo.mostrarDetalles();
      sombra.mostrarDetalles();
      flipper.mostrarDetalles();

      System.out.println("~ DEMOSTRANDO ACCIONES ~");
      dumbo.hacerSonido();
      sombra.cazar();
      flipper.nadar();
      flipper.saltar();

      System.out.println("~ INTERACCION ENTRE ANIMALES ~");
      // si descomentas Pinguino.java podes probar esto
      Pinguino pingu = new Pinguino("Pingu", 2, 12.0, 0.6, 10.0);
      flipper.interactuarConPinguino(pingu);
   }
}


   
