package com.mycompany.boatAndCo;

import com.mycompany.boatAndCo.entity.*;

public class BoatAndCoApplication {
    public static void main(String[] args) {
        System.out.println("### Les variables");
        int nbEspecesEn2018 = 182854;
        int ndEspecesQuidisparait = 26000;
        int nbEspecesEn2019 = nbEspecesEn2018 - ndEspecesQuidisparait;
        int valeurActuelle;

        String texteAAfficher;
        texteAAfficher = "Chaque année, 26000 espèces disparaissent de la surface de la planète.";
        System.out.println(texteAAfficher);

        texteAAfficher = "En 2018, elles étaient au nombre de ";
        System.out.println(texteAAfficher + nbEspecesEn2018 + ".");

        valeurActuelle = nbEspecesEn2018 - ndEspecesQuidisparait;
        texteAAfficher = "En 2019 elles n’étaient plus que ";
        System.out.println(texteAAfficher + valeurActuelle + ".");

        texteAAfficher = "En une journée, elles sont peut être passée de " + valeurActuelle + " à " + --valeurActuelle;
        System.out.println(texteAAfficher);

        System.out.println();

        System.out.println("### If");

        if (valeurActuelle <= 156854) {
            System.out.println("ça craint");
        } else {
            System.out.println("On est sauvés");
        }
        System.out.println();

        System.out.println("### Operateur ternaire");
        System.out.println(valeurActuelle <= 156854 ? "ça craint" : "On est sauvés");

        System.out.println("switch case");
        int nbEspeces = 15;
        switch (nbEspeces) {
            case 156854:
                System.out.println("ça craint");
                break;
            case 157000:
                System.out.println("c'est un peu mieux");
                break;

            default:
                System.out.println("valeur non traitée");

        }
        System.out.println();

        System.out.println("### For");
        for (int nb = 0; nb < 7; nb++) {
            System.out.println("Les océans sont magnifique");
        }

        System.out.println();

        System.out.println("### While");
        int compteur = 0;
        while (compteur < 7) {
            System.out.println("Les océans sont magnifique");
            compteur++;
        }
        System.out.println();

        System.out.println("### do - while");
        do {
            System.out.println("Les océans sont magnifique");
            compteur--;
        }
        while (compteur != 0);
        Person clientDupont = new Person();
        clientDupont.setAge(22);
        clientDupont.setDateOfBirth("25 janvier 2000");
        clientDupont.setFirstName("Jeremy");
        clientDupont.setLastName("Dupont");
        Person clientDurand = new Person();
        clientDurand.setAge(20);
        clientDurand.setDateOfBirth("14 Mars 1992");
        clientDurand.setFirstName("Max");
        clientDurand.setLastName("Durand");
        System.out.println(clientDupont.getFirstName() + " " + clientDupont.getLastName() + " " + clientDupont.getDateOfBirth() + " " + clientDupont.getAge() + " ans");
        System.out.println(clientDurand.getFirstName() + " " + clientDurand.getLastName() + " " + clientDurand.getDateOfBirth() + " " + clientDurand.getAge() + " ans");
        clientDupont.sePresenter();
        clientDurand.sePresenter();
        System.out.println("Mr durand a " + clientDurand.getAge() + " ans ");
        int nouvelAge = clientDurand.vieillir(45);
        System.out.println("Mr Durand a maintenant " + nouvelAge);
        System.out.println("Monsieur" + clientDurand.getFirstName() + " " + clientDurand.getLastName() + " a " + clientDurand.calculerAnciennete(2007, true) + " d'ancienneté");

        //surcharge de methode
        clientDupont.sePresenter();
        clientDupont.sePresenter(true);
        clientDupont.sePresenter("cotisAJour");

        //encapsulation de classes

        System.out.println("### Bateau de Pierre");
        Bateau bateauDePierre = new Bateau();
        bateauDePierre.setCouleur("Rouge");
        bateauDePierre.setMarque("Zodiac");
        Moteur nouveauMoteur = new Moteur();
        nouveauMoteur.setAnneeFabricationMoteur("2022");
        //nouveauMoteur.motorisation = "Gazoil";
        nouveauMoteur.setNbCylindres(4);

        bateauDePierre.setMoteur(nouveauMoteur);

        bateauDePierre.getMoteur().demarrer();
        bateauDePierre.getMoteur().afficherMotorisation();
        System.out.println("Le moteur a " + bateauDePierre.getMoteur().getNbCylindres() + " cylindres");
        System.out.println("Il a été fabriqué en " + bateauDePierre.getMoteur().getAnneeFabricationMoteur());
        System.out.println("et bénéficie d'une motorisation " + bateauDePierre.getMoteur().getMotorisation());

        bateauDePierre.naviguer();

        bateauDePierre.getMoteur().demarrer(26);

        //Nouvelle instanciation de la classe Adresse avec la classe Person

        Adresse newAdresse = new Adresse();
        newAdresse.setCodePostal(33800);
        newAdresse.setNumeros(40);
        newAdresse.setRue("Des Oliviers");
        newAdresse.setVille("Caudéran");
        clientDurand.setAdresse(newAdresse);

        System.out.printf("Le client Durand a pour adresse:\n%d rue %s dans la ville de %s qui a pour code postal %d\n", clientDurand.getAdresse().getNumeros(), clientDurand.getAdresse().getRue(), clientDurand.getAdresse().getVille(), clientDurand.getAdresse().getCodePostal());

        //Instanciation de ports

        System.out.println("Exercice sur les ports");

        Port portDeCalais = new Port();
        portDeCalais.setNbEmplacements(5);

        Bateau boat1 = new Bateau();
        Bateau boat2 = new Bateau();
        Bateau boat3 = new Bateau();
        Bateau boat4 = new Bateau();
        Bateau boat5 = new Bateau();

        Bateau[] emplacements = {boat1, boat2, boat3, boat4, boat5};

        portDeCalais.setEmplacements(emplacements);
        portDeCalais.restePlaceDisponible(emplacements);

        //Propriétés statiques
        System.out.println("La motorisation des moteurs est: " + Moteur.getMotorisation());

        int nombreKM = 5;
        int tempsH = 2;

        System.out.println("Nous avons parcouru " + Bateau.parcour(tempsH, nombreKM) + " kilomètres grâce au moteur " + Moteur.getMotorisation() + " du bateau");

        Ville villeDeCalais = new Ville("Calais", portDeCalais);

        System.out.println("############ Heritage #############");
        Cargo costarica = new Cargo("costarica", "rouge",47);
        System.out.println("Le " + costarica.getName() + " est un cargo de couleur " + costarica.getCouleur() + " de tonnage " + costarica.getTonnageMax());

        System.out.println("################Interface #####################");
        Cargo bateau25 = new Cargo("bateau25","jaune", 25);
        int cordesBateau = bateau25.amarrer(85);

        Hydravion hydravion25 = new Hydravion();
        int cordesHydra = hydravion25.amarrer(56);

        System.out.println("cordes bateau " + cordesBateau + " et corde hydravion " + cordesHydra);
    }
}

