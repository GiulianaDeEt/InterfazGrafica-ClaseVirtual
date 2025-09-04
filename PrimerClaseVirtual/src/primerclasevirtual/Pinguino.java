/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

class Pinguino {
   public static String especie = "Spheniscus humboldti";
   public String nombre = "";
   public int edad = 0;
   public double altura = 0.0;
   public boolean puedeVolar = false;
   public double velocidadNado = 0.0;

   public Pinguino() {
   }

   public void comer() {
      System.out.println(this.nombre + " come pescado fresco");
   }

   public void nadar() {
      System.out.println(this.nombre + " nada rápidamente bajo el agua");
   }

   public void deslizar() {
      System.out.println(this.nombre + " se desliza sobre su barriga en el hielo");
   }
}
