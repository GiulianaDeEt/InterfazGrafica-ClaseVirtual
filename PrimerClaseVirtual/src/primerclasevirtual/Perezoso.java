/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Juani
 */
public class Perezoso extends Animal implements SelvaTropical {

    public Perezoso(String nombre, int edad, double peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo hojas lentamente.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido suave y lento: 'mmmm...'");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve muy despacio entre las ramas.");
    }

    @Override
    public String getTipoHabitat() {
        return nombre + " vive en la Selva Tropical, colgado de los árboles.";
    }

    @Override
    public void cazar(Animal presa) {
        System.out.println(nombre + " no puede cazar porque es un animal herbívoro y muy lento.");
    }

    @Override
    public void protegerseDeDepredador(Animal depredador) {
        System.out.println(nombre + " se queda inmóvil y se camufla para evitar a " + depredador.getNombre());
    }

    @Override
    public void descansar() {
        System.out.println(nombre + " duerme alrededor de 15 horas al día.");
    }

    @Override
    public void competirPorAlimento(Animal rival) {
        System.out.println(nombre + " rara vez compite por alimento, pero intenta tomar las hojas antes que " + rival.getNombre());
    }

    @Override
    public void compartirAlimento(Animal companiero) {
        System.out.println(nombre + " no comparte, simplemente deja que " + companiero.getNombre() + " tome otras hojas cercanas.");
    }

    // Método propio del perezoso
    public void colgarseDeArbol() {
        System.out.println(nombre + " se cuelga de una rama con sus largas garras.");
    }
}