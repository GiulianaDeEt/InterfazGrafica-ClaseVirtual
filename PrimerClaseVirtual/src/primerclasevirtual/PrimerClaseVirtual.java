/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {
    public static void main(String[] args) {
      System.out.println("~ CREACION DE ANIMALES CON VALIDACIONES ~");
      //Jirafa manchitas = new Jirafa("Manchitas", 5, 800.0, 4.5, "marron oscuro");
      Elefante dumbo = new Elefante("Dumbo", 12, 4000.0, 1.8, true);
      Puma sombra = new Puma("Sombra", 3, 65.0, 80.0, 50.0);
       Oso baloo = new Oso("Baloo", 10, 300, "Pardo", true);

      System.out.println("~ INFORMACIPN INICIAL ~");
      //manchitas.mostrarInfo();
      //dumbo.mostrarInfo();
      //sombra.mostrarInfo();
      System.out.println("~ DETALLES ESPECIFICOS ~");
      //manchitas.mostrarDetalles();
      dumbo.mostrarDetalles();
      sombra.mostrarDetalles();
      System.out.println("~ DEMOSTRANDO VALIDACIONES (datos incorrectos) ~");
      //Jirafa jirafaMala = new Jirafa("", -5, -100.0, 10.0, "");
      //jirafaMala.mostrarInfo();
      System.out.println("~ MODIFICANDO DATOS CON SETTERS ~");
      //manchitas.cambiarPeso(850.0);
      //manchitas.cumplirAnios();
      System.out.println("Intentando cambios invalidos:");
      dumbo.setEdad(150);
      dumbo.setPeso(-500.0);
      sombra.setVelocidadMaxima(200.0);
      System.out.println("~ ESTADO FINAL (datos protegidos) ~");
      //manchitas.mostrarInfo();
      //dumbo.mostrarInfo();
      //sombra.mostrarInfo();
      System.out.println("~ DEMOSTRANDO ACCESO CONTROLADO ~");
      //System.out.println("Nombre de la jirafa: " + manchitas.getNombre());
      System.out.println("Edad del elefante: " + dumbo.getEdad() + " anios");
      System.out.println("Velocidad del puma: " + sombra.getVelocidadMaxima() + " km/h");
      System.out.println("Los datos estan protegidos y validados gracias a la encapsulacion");
      baloo.mostrarDetalles();
      baloo.pescar();
      baloo.treparArbol();
      baloo.hibernar();
      baloo.comer();
      baloo.hacerSonido();
   }
}

   
