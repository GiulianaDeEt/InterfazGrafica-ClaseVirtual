/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerclasevirtual;

public class PrimerClaseVirtual {

    public static void main(String[] args) {
        System.out.println("~ECOSISTEMA VIRTUAL~");

        MonoAullador titi = new MonoAullador("Titi", 3, 14.4, "Alouatta caraya");
        Perezoso perez = new Perezoso("Perez", 5, 43, "Bradypus variegatus");
        Guacamayo lolo = new Guacamayo("Lolo", 2, 1.4, "Ara macao");
        AnacondaVerde corcho = new AnacondaVerde(5, 26 ,"Corcho", 26, 34, "Eunectes murinus");
        RanaVenenosa pepeDark = new RanaVenenosa("Pepe Dark", 1, 1, "Dendrobates tinctorius");
        Jaguar mernuel = new Jaguar("Mernuel", 2, 56, "Panthera Onca");

        titi.comer();
        titi.hacerSonido();
        titi.moverse();
        System.out.println(titi.getTipoHabitat());

        perez.comer();
        perez.hacerSonido();
        perez.moverse();
        System.out.println(perez.getTipoHabitat());

        lolo.comer();
        lolo.hacerSonido();
        lolo.moverse();
        System.out.println(lolo.getTipoHabitat());

        corcho.comer();
        corcho.hacerSonido();
        corcho.moverse();
        System.out.println(corcho.getTipoHabitat());

        pepeDark.comer();
        pepeDark.hacerSonido();
        pepeDark.moverse();
        System.out.println(pepeDark.getTipoHabitat());

        mernuel.comer();
        mernuel.hacerSonido();
        mernuel.moverse();
        System.out.println(mernuel.getTipoHabitat());

        if (titi instanceof SelvaTropical) {
            titi.cazar(perez);
            titi.protegerseDeDepredador(lolo);
            titi.descansar();
            titi.competirPorAlimento(lolo);
            titi.compartirAlimento(perez);
        }
        if (perez instanceof SelvaTropical) {
            perez.cazar(pepeDark);
            perez.protegerseDeDepredador(corcho);
            perez.descansar();
            perez.competirPorAlimento(lolo);
            perez.compartirAlimento(titi);
        }
        if (lolo instanceof SelvaTropical) {
            lolo.cazar(titi);
            lolo.protegerseDeDepredador(pepeDark);
            lolo.descansar();
            lolo.competirPorAlimento(titi);
            lolo.compartirAlimento(perez);
        }
        if (corcho instanceof SelvaTropical) {
            corcho.cazar(perez);
            corcho.protegerseDeDepredador(lolo);
            corcho.descansar();
            corcho.competirPorAlimento(pepeDark);
            corcho.compartirAlimento(titi);
        }
        
        if (pepeDark instanceof SelvaTropical) {
            pepeDark.cazar(lolo);
            pepeDark.protegerseDeDepredador(perez);
            pepeDark.descansar();
            pepeDark.competirPorAlimento(corcho);
            pepeDark.compartirAlimento(titi);
        }
        
        if (mernuel instanceof SelvaTropical) {
            mernuel.cazar(lolo);
            mernuel.protegerseDeDepredador(corcho);
            mernuel.descansar();
            mernuel.competirPorAlimento(pepeDark);
            mernuel.compartirAlimento(perez);
        }

    }
}
