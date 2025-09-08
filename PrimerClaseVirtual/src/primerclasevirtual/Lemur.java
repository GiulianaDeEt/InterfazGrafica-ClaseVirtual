/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

// LEMUR - Implementa Animal + Trepador (puede trepar)
class Lemur extends Animal implements Trepador {
    private double longitudCola;
    private String tipoLemur;
    
    public Lemur(String nombre, int edad, double peso, double longitudCola, String tipoLemur) {
        super(nombre, edad, peso, "Lemuroidea");
        this.setLongitudCola(longitudCola);
        this.tipoLemur = tipoLemur;
    }
    
    public double getLongitudCola() { return longitudCola; }
    public String getTipoLemur() { return tipoLemur; }
    
    public void setLongitudCola(double longitudCola) {
        if (longitudCola >= 0 && longitudCola <= 1.0) {
            this.longitudCola = longitudCola;
        } else {
            System.out.println("Error: La cola debe medir entre 0 y 1 metro");
            this.longitudCola = 0.6;
        }
    }
    
    // Implementación de Animal
    @Override
    public void comer() {
        System.out.println("   " + nombre + " come frutas, hojas e insectos");
        energia = Math.min(100, energia + 20);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("   " + nombre + " hace sonidos característicos: 'Ooh ooh ah ah!'");
    }
    
    @Override
    public void moverse() {
        if (energia >= 15) {
            System.out.println("   " + nombre + " se balancea de rama en rama usando su cola de " + longitudCola + "m");
            energia -= 12;
        } else {
            System.out.println("   " + nombre + " camina por el suelo (muy cansado para balancearse)");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "selvas y bosques tropicales";
    }
    
    // Implementación de Trepador
    @Override
    public void trepar() {
        if (energia >= 10) {
            System.out.println(nombre + " trepa agilmente usando brazos, piernas y cola");
            energia -= 8;
        } else {
            System.out.println(nombre + " esta demasiado cansado para trepar");
        }
    }
    
    @Override
    public void escalar(String superficie) {
        if (puedeTreeparEn(superficie) && energia >= 15) {
            System.out.println(nombre + " escala habilmente " + superficie);
            energia -= 12;
        } else if (!puedeTreeparEn(superficie)) {
            System.out.println(nombre + " no puede trepar en " + superficie);
        } else {
            System.out.println(nombre + " no tiene energia para escalar " + superficie);
        }
    }
    
    @Override
    public boolean puedeTreeparEn(String superficie) {
        superficie = superficie.toLowerCase();
        return superficie.contains("arbol") || superficie.contains("rama") || 
               superficie.contains("liana") || superficie.contains("roca");
    }
    
    // Método específico
    public void columpiar() {
        if (energia >= 12) {
            System.out.println(nombre + " se columpia alegremente usando su cola de " + longitudCola + "m");
            energia -= 10;
        } else {
            System.out.println(nombre + " no tiene energia para columpiarse");
        }
    }
}