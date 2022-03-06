package main.memo_Code.ProgrammationObjet;


import main.memo_Code.ProgrammationObjet.entity.*;

public class Main {
    public static void main(String[] args) {
        // instanciation d'un objet
        Voiture voitureDeMichel = new Voiture();
        Voiture voitureDeThomas = new Voiture();

        // Valorisation des proprietes
        voitureDeMichel.setImmatriculation("123AZE56");
        voitureDeMichel.setMarque("Renaut");
        System.out.println("Le nombre de porte de la voiture est " + voitureDeMichel.getNbPortes());

        // Modification de la valeur d'une propriété
        voitureDeMichel.setNbPortes(5);
        System.out.println("Le nombre de porte de la voiture est maintenant" + voitureDeMichel.getNbPortes());
        System.out.println("La voiture de Michel est de marque " + voitureDeMichel.getMarque() + ", son immatriculation est " + voitureDeMichel.getImmatriculation() + " et elle a " + voitureDeMichel.getNbPortes() + " portes");

        // Appel d'une méthode sans retour (void) et sans paramétres
        voitureDeMichel.klaxonner();

        // Avec une valeur de retour (utilisation d'une variable)
        int vitesseActuelle = voitureDeMichel.donnerVitesse();
        System.out.println(vitesseActuelle);

        // Avec une valeur de retour et un parametre
        System.out.println("Vitesse de départ : 45");
        System.out.println("La nouvelle vitesse est : "+voitureDeMichel.donnerNouvelleVitesse(45));

        // Avec plusieurs parametres
        System.out.println("La vitesse actuelle = 100");
        int nouvelleVitesse = voitureDeMichel.changerVitesse(100, true, 50);
        System.out.println("La nouvelle vitesse est : " + nouvelleVitesse);


        Voiture voitureDeMartin = new Voiture();
        Moteur nouveauMoteur = new Moteur();
        nouveauMoteur.setMotorisation("Diesel");
        nouveauMoteur.setNbCylindres(4);
        voitureDeMartin.setMoteur(nouveauMoteur);

        voitureDeMartin.getMoteur().afficherMotorisation();

        int [] newTab = new int [5];

        System.out.println(newTab[0]);

        String[] newString = new String[2];
        System.out.println(newString[0]);
        int tailleString = newString.length;
        System.out.println(tailleString);

        System.out.println("***************\n* Hello World *\n***************");
        Passager passagerDurand = new Passager();

        passagerDurand.setNom("Durand");
        passagerDurand.setPrenom("David");


        //propriété static

        System.out.println("Le nombre de roues est static :" + Voiture.getNbRoues());





    }
}
