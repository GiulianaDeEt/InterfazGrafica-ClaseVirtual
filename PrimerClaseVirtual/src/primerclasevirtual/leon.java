/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Benja
 */
public class leon extends Animal {

    private String colorMelena;
    private double longitud;

    public leon(String nombre, int edad, double peso, String colorMelena, double longitud) {
        super(nombre, edad, peso, "Panthera leo");
        this.setColorMelena(colorMelena);
        this.setLongitud(longitud);
    }

    public String getColorMelena() {
        return this.colorMelena;
    }
    
    public double getLongitud() {
        return this.longitud;
    }

    public void setColorMelena(String colorMelena) {
        if (colorMelena != null && !colorMelena.trim().isEmpty()) {
            this.colorMelena = colorMelena.trim();
        } else {
            System.out.println("Error: El color de la melena no puede estar vacío");
            this.colorMelena = "Desconocido";
        }
    }
    
    public void setLongitud(double longitud){
        if (longitud != 0) {
            this.longitud = longitud;
        } else {
            System.out.println("Error: La longitud no puede estar vacía");
            this.longitud = 0;
        }
    }

    public void cazar(Animal presa) {
        System.out.println(this.getNombre() + " esta cazando " + presa.getEspecie());
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getNombre() + " ruge fuerte: ¡ROAAAAR!");
    }
    
    @Override
    public void dormir(){
        System.out.println(this.getNombre() + " esta durmiendo");
    }
    
    @Override
    public void comer(){
        System.out.println(this.getNombre() + " esta comiendo una cebra");
    }
}
