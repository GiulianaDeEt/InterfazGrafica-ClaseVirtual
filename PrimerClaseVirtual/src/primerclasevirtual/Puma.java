/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;
import java.io.PrintStream;

class Puma extends Animal {
   private double velocidadMaxima;
   private double territorioKm2;

   public Puma(String nombre, int edad, double peso, double velocidadMaxima, double territorioKm2) {
      super(nombre, edad, peso, "Puma concolor");
      this.setVelocidadMaxima(velocidadMaxima);
      this.setTerritorioKm2(territorioKm2);
   }

   public double getVelocidadMaxima() {
      return this.velocidadMaxima;
   }

   public double getTerritorioKm2() {
      return this.territorioKm2;
   }

   public void setVelocidadMaxima(double velocidadMaxima) {
      if (velocidadMaxima >= 30.0 && velocidadMaxima <= 100.0) {
         this.velocidadMaxima = velocidadMaxima;
      } else {
         System.out.println("Error: La velocidad debe estar entre 30 y 100 km/h");
         this.velocidadMaxima = 65.0;
      }

   }

   public void setTerritorioKm2(double territorioKm2) {
      if (territorioKm2 >= 10.0 && territorioKm2 <= 200.0) {
         this.territorioKm2 = territorioKm2;
      } else {
         System.out.println("Error: El territorio debe estar entre 10 y 200 km2");
         this.territorioKm2 = 50.0;
      }

   }

   public void cazar() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println(var10001 + " acecha sigilosamente en sus " + this.territorioKm2 + " km² de territorio");
   }

   public void correr() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println(var10001 + " corre a " + this.velocidadMaxima + " km/h");
   }

   public void comer() {
      System.out.println(this.getNombre() + " devora su presa con sus poderosas mandibulas");
   }

   public void hacerSonido() {
      System.out.println(this.getNombre() + " grunie amenazadoramente: '¡GRRRRR!'");
   }

   public void mostrarDetalles() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println(var10001 + " - Velocidad: " + this.velocidadMaxima + " km/h, Territorio: " + this.territorioKm2 + " km2");
   }
}
