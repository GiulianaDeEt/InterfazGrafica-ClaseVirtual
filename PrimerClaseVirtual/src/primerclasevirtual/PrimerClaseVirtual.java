/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {
    public static void main(String[] args) {
      //Jirafa manchitas = new Jirafa("Manchitas", 5, 800.0, 4.5, "marron");
      Elefante dumbo = new Elefante("Dumbo", 12, 4000.0, 1.8, true);
      Puma sombra = new Puma("Sombra", 3, 65.0, 80.0, 50.0);
      Pinguino pingui = new Pinguino("Bartolo", 2, 4.5, 0.7, 8.0);
      System.out.println("=== INFORMACION DE LOS ANIMALES ===");
      //manchitas.mostrarInfo();
      dumbo.mostrarInfo();
      sombra.mostrarInfo();
      pingui.mostrarInfo();
      System.out.println("=== COMPORTAMIENTOS COMUNES ===");
      //manchitas.respirar();
      dumbo.dormir();
      sombra.respirar();
      pingui.dormir();
      System.out.println("=== COMPORTAMIENTOS ESPECIFICOS ===");
     // manchitas.estirarCuello();
     // manchitas.comer();
      dumbo.usarTrompa();
      dumbo.duchar();
      sombra.cazar();
      sombra.correr();
      pingui.nadar();
      pingui.deslizar();
      System.out.println("=== INTERACCIONES ENTRE ANIMALES ===");
     // dumbo.ducharA(manchitas);
      dumbo.ducharA(sombra);
      dumbo.ducharA(pingui);
      System.out.println("=== DEMOSTRACION DE POLIMORFISMO BASICO ===");
     // Animal[] animales = new Animal[]{manchitas, dumbo, sombra, pingui};
      System.out.println("Hora de comer:");
      //Animal[] var6 = animales;
      //int var7 = animales.length;
/**
      for(int var8 = 0; var8 < var7; ++var8) {
         Animal animal = var6[var8];
         animal.comer();
      }**/
 }
}

   
