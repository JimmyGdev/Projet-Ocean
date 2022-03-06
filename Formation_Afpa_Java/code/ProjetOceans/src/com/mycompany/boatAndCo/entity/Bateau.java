package com.mycompany.boatAndCo.entity;

public class Bateau {


    // attributs static
    private static int nbBateauxCrees = 0;


    //--------------------------------- attributs private ---------------------------------
    private String name;
    private String marque;
    private String couleur;
    private Moteur moteur;
    private int tonnageMax;

    //--------------------------------- constructeurs ---------------------------------
    public Bateau() {
        nbBateauxCrees++;
        System.out.println("Il y a " + nbBateauxCrees + " de bateaux");
    }
    public Bateau(String name, String couleur, int tonnageMax){
        this.name = name;
        this.couleur = couleur;
        this.tonnageMax = tonnageMax;
    }

    public Bateau(String name, String couleur) {
        this.couleur = couleur;
        this.name = name;
    }

    //--------------------------------- méthodes ---------------------------------
    public void naviguer() {
        System.out.println("Je navigue avec mon pass navigo!");
    }

    public void rentrerAuPort(Port newPort) {
        if (newPort.restePlaceDisponible(newPort.getEmplacements())) {
            System.out.println("Je rentre au port");
        } else {
            System.out.println("Il n'y a plus de place disponible");
        }

    }

    public static int parcour(int dureeNavigationH, int vitesseKM) {
        return dureeNavigationH * vitesseKM;
    }



    //--------------------------------- getter setter ---------------------------------

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public static int getNbBateauxCrees() {
        return nbBateauxCrees;
    }

    public static void setNbBateauxCrees(int nbBateauxCrees) {
        Bateau.nbBateauxCrees = nbBateauxCrees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTonnageMax() {
        return tonnageMax;
    }

    public void setTonnageMax(int tonnageMax) {
        this.tonnageMax = tonnageMax;
    }
}
