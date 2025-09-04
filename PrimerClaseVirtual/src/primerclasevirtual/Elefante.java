/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

import java.io.PrintStream;

class Elefante extends Animal {
   private double longitudTrompa;
   private boolean tieneColmillos;

   public Elefante(String nombre, int edad, double peso, double longitudTrompa, boolean tieneColmillos) {
      super(nombre, edad, peso, "Loxodonta africana");
      this.setLongitudTrompa(longitudTrompa);
      this.tieneColmillos = tieneColmillos;
   }

   public double getLongitudTrompa() {
      return this.longitudTrompa;
   }

   public boolean isTieneColmillos() {
      return this.tieneColmillos;
   }

   public void setLongitudTrompa(double longitudTrompa) {
      if (longitudTrompa >= 0.5 && longitudTrompa <= 3.0) {
         this.longitudTrompa = longitudTrompa;
      } else {
         System.out.println("Error: La trompa debe medir entre 0.5 y 3 metros");
         this.longitudTrompa = 1.5;
      }

   }

   public void setTieneColmillos(boolean tieneColmillos) {
      this.tieneColmillos = tieneColmillos;
   }

   public void usarTrompa() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println(var10001 + " usa su trompa de " + this.longitudTrompa + " metros");
   }

   public void duchar() {
      System.out.println(this.getNombre() + " se ducha rociándose agua con su trompa");
   }

   public void comer() {
      PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println(var10001 + " usa su trompa de " + this.longitudTrompa + "m para agarrar hierba y frutas");
   }

   public void hacerSonido() {
      System.out.println(this.getNombre() + " barita fuertemente: 'PFFFRRRR!'");
   }

   public void mostrarDetalles() {
      String colmillos = this.tieneColmillos ? "con colmillos" : "sin colmillos";
      System.out.println(this.getNombre() + " - Trompa: " + this.longitudTrompa + "m, " + colmillos);
   }
}
