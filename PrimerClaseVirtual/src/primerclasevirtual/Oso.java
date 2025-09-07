/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;
import java.io.PrintStream;
/**
 *
 * @author andyc
 */
class Oso extends Animal {
   private String tipo;        // Ejemplo: "Pardo", "Polar", "Panda"
   private boolean hiberna;    // Si hiberna o no

   // Constructor
   public Oso(String nombre, int edad, double peso, String tipo, boolean hiberna) {
      super(nombre, edad, peso, "Ursidae");
      this.setTipo(tipo);
      this.hiberna = hiberna;
   }

   // Getters
   public String getTipo() {
      return this.tipo;
   }

   public boolean isHiberna() {
      return this.hiberna;
   }

   // Setters
   public void setTipo(String tipo) {
      if (tipo != null && !tipo.trim().isEmpty()) {
         this.tipo = tipo.trim();
      } else {
         System.out.println("Error: El tipo de oso no puede estar vacío");
         this.tipo = "Desconocido";
      }
   }

   public void setHiberna(boolean hiberna) {
      this.hiberna = hiberna;
   }

   // Métodos propios del oso
   public void pescar() {
      System.out.println(this.getNombre() + " está pescando salmones en el río 🐟");
   }

   public void treparArbol() {
      System.out.println(this.getNombre() + " trepa un árbol para buscar miel 🍯");
   }

   public void hibernar() {
      if (hiberna) {
         System.out.println(this.getNombre() + " está hibernando durante el invierno ❄️");
      } else {
         System.out.println(this.getNombre() + " no hiberna");
      }
   }

   // Sobrescribir métodos de Animal
   @Override
   public void hacerSonido() {
      System.out.println(this.getNombre() + " ruge con fuerza: 'GROAARRR!' 🐻");
   }

   @Override
   public void comer() {
      System.out.println(this.getNombre() + " come frutas, miel y peces");
   }

   public void mostrarDetalles() {
      String h = this.hiberna ? "Hiberna" : "No hiberna";
      System.out.println(this.getNombre() + " - Tipo: " + this.tipo + " | Peso: " + this.getPeso() + "kg | " + h);
   }
}
