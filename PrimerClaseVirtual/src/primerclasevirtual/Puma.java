/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

class Puma {
   public static String especie = "Puma concolor";
   public String nombre = "";
   public int edad = 0;
   public double peso = 0.0;
   public double velocidadMaxima = 0.0;
   public double territorioKm2 = 0.0;

   public Puma() {
   }

   public void comer() {
      System.out.println(this.nombre + " devora su presa con sus poderosas mandibulas");
   }

   public void cazar() {
      System.out.println(this.nombre + " acecha sigilosamente a su presa");
   }

   public void saltar() {
      System.out.println(this.nombre + " salta agilmente entre las rocas");
   }
}
