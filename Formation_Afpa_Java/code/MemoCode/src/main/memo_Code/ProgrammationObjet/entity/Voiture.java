package main.memo_Code.ProgrammationObjet.entity;

import main.memo_Code.ProgrammationObjet.entity.Moteur;

public class Voiture {
    // Propriétés
    private String marque;
    private String immatriculation;
    private int nbPortes = 4;
    private Moteur moteur;
    private static int nbRoues = 4;

    // Méthodes (comportements)

    // Methode sans retour (void) et sans paramètres
    public static void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec retour
    public int donnerVitesse(){
        return 100;
    }

    // Methode avec 1 paramètre
    public int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec plusieurs parametres
    public int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
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

    public void transporter(Passager passager){
        System.out.println("Je transport le passager " + passager);
    }
    /**public void transporter(Passager passager, Ville ville){
        System.out.println("Je transport le passager " + passager + "En partant de " + ville);
    }*/

    public Ville transporter(Passager passager, Ville ville){
        System.out.println("Je transport le passager " + passager + "En partant de " + ville);
        Ville nouvelleVille = new Ville();
        nouvelleVille.nom = "Paris";
        return nouvelleVille;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public static int getNbRoues() {
        return nbRoues;
    }

    public static void setNbRoues(int nbRoues) {
        Voiture.nbRoues = nbRoues;
    }
}
