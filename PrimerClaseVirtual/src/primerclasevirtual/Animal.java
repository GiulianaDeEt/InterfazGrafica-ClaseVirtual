/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

public class Animal {
   protected String nombre;
   protected int edad;
   protected double peso;
   protected String especie;

   public Animal(String nombre, int edad, double peso, String especie) {
      this.nombre = nombre;
      this.edad = edad;
      this.peso = peso;
      this.especie = especie;
   }

   public void dormir() {
      System.out.println(this.nombre + " esta durmiendo...");
   }

   public void respirar() {
      System.out.println(this.nombre + " esta respirando");
   }

   public void comer() {
      System.out.println(this.nombre + " esta comiendo");
   }

   public void mostrarInfo() {
      System.out.println("Animal: " + this.nombre + " | Especie: " + this.especie + " | Edad: " + this.edad + " anios | Peso: " + this.peso + " kg");
   }
}

