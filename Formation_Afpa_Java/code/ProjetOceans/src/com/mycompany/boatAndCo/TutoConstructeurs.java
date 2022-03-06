package com.mycompany.boatAndCo;

import com.mycompany.boatAndCo.entity.*;

public class TutoConstructeurs {
    public static void main(String[] args) {
        Passager passagerDupont = new Passager();
        Passager passagerDurand = new Passager();
        Passager passagerDuland = new Passager();
        Passager passagerDumand = new Passager();
        Passager passagerDutand = new Passager();
        Passager passagerDupand = new Passager();
        Passager passagerDuyand = new Passager();
        Passager passagerDuzand = new Passager();

        Passager passagerMarin = new Passager("Marin");

        Passager passagerLux = new Passager("Delma", "Lux");

        Adresse adresseOfDupond = new Adresse(21, "Valer", 4, "Bordeaux");
        passagerDupont.setAdresse(adresseOfDupond);

        Passager passagerLola = new Passager("Kzma", "Lola", adresseOfDupond);

        System.out.println("Le nombre de passagers est : " + Passager.getNbPassagersCréeé());


        System.out.println("***Exercices sur des écrans et PC***");

        Screen newEcran = new Screen("Acer", "BSGABD47", 24);
        Computer newPc = new Computer("Fujitsu", "ZESCBAF147", 10, newEcran);

        System.out.printf("Le nouveau Pc a pour marque %s, en modèle %s avec comme taille? %d et avec un écran de marque %s, de modèle %s et de la taille %d pouces", newPc.getMarque(), newPc.getModele(), newPc.getTaille(), newPc.getEcran().getMarque(), newPc.getEcran().getModéle(), newPc.getEcran().getTaille());
        ;


    }
}
