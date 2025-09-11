package primerclasevirtual;

public interface Habitat_Desierto {
    void buscarAgua();

    default void reaccionarAlClima(String clima, int energia, int velocidad) {
        if (clima.equalsIgnoreCase("CalorExtremo")) {
            energia -= 20;
            velocidad -= 10;
            System.out.println("Hace mucho calor. Energía baja a " + energia + " y velocidad a " + velocidad);
            buscarAgua();
        } else if (clima.equalsIgnoreCase("TormentaDeArena")) {
            velocidad -= 20;
            System.out.println("Hay tormenta de arena. Velocidad baja a " + velocidad);
        } else {
            System.out.println("El clima es normal. Todo sigue como está.");
        }
    }
}
