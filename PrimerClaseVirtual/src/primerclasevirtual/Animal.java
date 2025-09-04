/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

class Animal {
   private String nombre;
   private int edad;
   private double peso;
   private String especie;

   public Animal(String nombre, int edad, double peso, String especie) {
      this.setNombre(nombre);
      this.setEdad(edad);
      this.setPeso(peso);
      this.especie = especie;
   }

   public String getNombre() {
      return this.nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public double getPeso() {
      return this.peso;
   }

   public String getEspecie() {
      return this.especie;
   }

   public void setNombre(String nombre) {
      if (nombre != null && !nombre.trim().isEmpty()) {
         this.nombre = nombre.trim();
      } else {
         System.out.println("Error: El nombre no puede estar vacio");
         this.nombre = "Sin nombre";
      }

   }

   public void setEdad(int edad) {
      if (edad >= 0 && edad <= 100) {
         this.edad = edad;
      } else {
         System.out.println("Error: La edad debe estar entre 0 y 100 anios");
         this.edad = 0;
      }

   }

   public void setPeso(double peso) {
      if (peso > 0.0 && peso <= 10000.0) {
         this.peso = peso;
      } else {
         System.out.println("Error: El peso debe ser positivo y menor a 10000 kg");
         this.peso = 1.0;
      }

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

   public void hacerSonido() {
      System.out.println(this.nombre + " hace un sonido");
   }
/**
   public void mostrarInfo() {
     PrintStream var10000 = System.out;
      String var10001 = this.getNombre();
      var10000.println("Animal: " + var10001 + " | Especie: " + this.getEspecie() + " | Edad: " + this.getEdad() + " anios | Peso: " + this.getPeso() + " kg");
   }**/

   public void cumplirAnios() {
      this.setEdad(this.edad + 1);
      System.out.println(this.nombre + " cumplio anios! Ahora tiene " + this.edad + " anios");
   }

   public void cambiarPeso(double nuevoPeso) {
      double pesoAnterior = this.peso;
      this.setPeso(nuevoPeso);
      if (this.peso != pesoAnterior) {
         System.out.println(this.nombre + " cambio de peso: " + pesoAnterior + " kg a " + this.peso + " kg");
      } 
   }   
}

