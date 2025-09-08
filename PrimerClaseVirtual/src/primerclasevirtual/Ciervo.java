/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerclasevirtual;

/**
 *
 * @author Fede
 */
class Ciervo extends Animal implements HabitatBosque {

    public Ciervo(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Cervus elaphus");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " ramonea hojas y pasto del bosque");
        energia = Math.min(100, energia + 15);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " brama fuertemente");
    }

    @Override
    public void moverse() {
        if (energia >= 12) {
            System.out.println(nombre + " trota entre los árboles del bosque");
            energia -= 10;
        } else {
            System.out.println(nombre + " está cansado para moverse");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Bosques y praderas";
    }

    // Métodos del HabitatBosque
    @Override
    public void refugiarse() {
        System.out.println(nombre + " se esconde entre la vegetación densa");
    }

    @Override
    public void buscarComidaBosque() {
        System.out.println(nombre + " busca brotes tiernos en el bosque");
    }

    @Override
    public void marcarTerritorio() {
        System.out.println(nombre + " raspa los árboles con sus astas");
    }
}