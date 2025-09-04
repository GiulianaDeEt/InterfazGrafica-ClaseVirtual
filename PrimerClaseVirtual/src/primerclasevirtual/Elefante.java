/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

class Elefante {
   public static String especie = "Loxodonta africana";
   public String nombre = "";
   public int edad = 0;
   public double peso = 0.0;
   public double longitudTrompa = 0.0;
   public boolean tieneColmillos = true;

   public Elefante() {
   }

   public void comer() {
      System.out.println(this.nombre + " usa su trompa para agarrar hierba y frutas");
   }

   public void caminar() {
      System.out.println(this.nombre + " camina pesadamente haciendo temblar el suelo");
   }

   public void duchar() {
      System.out.println(this.nombre + " se ducha tirandose agua con su trompa");
   }
}
