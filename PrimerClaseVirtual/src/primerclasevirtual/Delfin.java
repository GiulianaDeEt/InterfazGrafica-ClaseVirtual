/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package primerclasevirtual;

class Delfin extends Animal {
   private double velocidadNado;
   private boolean entrenado;

   public Delfin(String nombre, int edad, double peso, double velocidadNado, boolean entrenado) {
      super(nombre, edad, peso, "Delphinidae");
      this.setVelocidadNado(velocidadNado);
      this.entrenado = entrenado;
   }

   public double getVelocidadNado() { return this.velocidadNado; }
   public boolean isEntrenado() { return this.entrenado; }

   public void setVelocidadNado(double velocidadNado) {
      if (velocidadNado >= 5 && velocidadNado <= 60) {
         this.velocidadNado = velocidadNado;
      } else {
         System.out.println("Error: La velocidad debe estar entre 5 y 60 km/h");
         this.velocidadNado = 20.0;
      }
   }

   public void setEntrenado(boolean entrenado) { this.entrenado = entrenado; }

   // --- Métodos propios ---
   public void nadar() {
      System.out.println(this.getNombre() + " nada a " + this.velocidadNado + " km/h");
   }

   public void saltar() {
      System.out.println(this.getNombre() + " salta fuera del agua haciendo piruetas");
   }

   @Override
   public void hacerSonido() {
      System.out.println(this.getNombre() + " emite chasquidos característicos: 'Click-click!'");
   }

   public void mostrarDetalles() {
      String estado = this.entrenado ? "entrenado" : "salvaje";
      System.out.println(this.getNombre() + " - Velocidad de nado: " + this.velocidadNado + " km/h, Estado: " + estado);
   }

   // Interacción opcional
   public void interactuarConPinguino(Pinguino p) {
      System.out.println(this.getNombre() + " juega con el pingüino " + p.getNombre() + " en el agua 🐧🐬");
   }
}
