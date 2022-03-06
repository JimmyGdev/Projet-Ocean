package main.ProgrammationObjet;

public class Voiture {
    // Propriétés
    String marque;
    String immatriculation;
    int nbPortes = 4;

    // Méthodes (comportements)

    // Mehode sans retour (void) et sans paramétres
    void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec retour
    int donnerVitesse(){
        return 100;
    }

    // Methode avec 1 parametre
    int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec plusieurs parametres
    int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
        if(accelerer){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }
    int passerUneVitesse (int vitesseEngageeCourante, boolean passerVitesseSuperieure){
        if (passerVitesseSuperieure){
            vitesseEngageeCourante = vitesseEngageeCourante+1;
        }
        else {
            vitesseEngageeCourante = vitesseEngageeCourante -1;
        }
        return vitesseEngageeCourante;
    }

    //surcharge de methode quand on prend le meme nom de méthode avec nom different

    int changerVitesse(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
        if (accelererOuRalentir == "accelerer") {
            vitesseActuelle += ecartVitesse;
        }
        else {
            vitesseActuelle -= ecartVitesse;
        }
        return vitesseActuelle;
    }

}
