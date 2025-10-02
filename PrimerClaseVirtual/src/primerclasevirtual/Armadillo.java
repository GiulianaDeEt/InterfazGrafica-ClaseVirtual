/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Usuario
 */
public class Armadillo extends Animal implements HabitatLlanura {
    private int longitudCaparazon;
    private boolean estaEnrollado;
    
    public Armadillo(String nombre, int edad, double peso, int longitudCaparazon) {
        super(nombre, edad, peso, "Armadillo");
        this.setLongitudCaparazon(longitudCaparazon);
        this.estaEnrollado = false;
    }
    
    // Getters y Setters con validación
    public int getLongitudCaparazon() { return longitudCaparazon; }
    
    public void setLongitudCaparazon(int longitud) {
        if (longitud > 0 && longitud <= 100) {
            this.longitudCaparazon = longitud;
        } else {
            System.out.println("Error: Longitud del caparazón debe ser entre 1-100 cm");
            this.longitudCaparazon = 30;
        }
    }
    
    public boolean isEstaEnrollado() { return estaEnrollado; }
    
    // Métodos abstractos de Animal
    @Override
    public void comer() {
        if (energia >= 10) {
            System.out.println(nombre + " está comiendo hormigas e insectos");
            energia -= 10;
        } else {
            System.out.println(nombre + " está demasiado cansado para comer");
        }
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Grunt grunt!");
    }
    
    @Override
    public void moverse() {
        if (energia >= 15) {
            System.out.println(nombre + " se mueve lentamente buscando comida");
            energia -= 15;
        } else {
            System.out.println(nombre + " no tiene energía para moverse");
        }
    }
    
    @Override
    public String getTipoHabitat() {
        return "Llanura y pastizales";
    }
    
    // Métodos de HabitatLlanura
    @Override
    public void pastar() {
        if (energia >= 5) {
            System.out.println(nombre + " busca insectos en el pasto");
            energia -= 5;
        }
    }
    
    @Override
    public void excavarMadriguera() {
        if (energia >= 25) {
            System.out.println(nombre + " excava una madriguera con sus garras");
            energia -= 25;
        } else {
            System.out.println(nombre + " no tiene energía para excavar");
        }
    }
    
    @Override
    public void camuflarse() {
        System.out.println(nombre + " se confunde con la tierra y pasto seco");
    }
    
    @Override
    public String getTipoVegetacion() {
        return "Pastizales y arbustos bajos";
    }
    
    // Métodos específicos del Armadillo
    public void enrollarse() {
        if (energia >= 5) {
            estaEnrollado = true;
            System.out.println(nombre + " se enrolla formando una bola protectora");
            energia -= 5;
        }
    }
    
    public void desenrollarse() {
        estaEnrollado = false;
        System.out.println(nombre + " se desenrolla");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caparazón: " + longitudCaparazon + "cm - Enrollado: " + estaEnrollado);
    }
}
