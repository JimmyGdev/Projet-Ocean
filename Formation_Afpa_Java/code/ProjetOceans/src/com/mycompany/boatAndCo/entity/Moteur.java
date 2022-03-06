package com.mycompany.boatAndCo.entity;

public class Moteur {

    private static String motorisation = "Diesel";


    private int nbCylindres;
    private String anneeFabricationMoteur;

    public void afficherMotorisation() {
        System.out.println("Il s'agit d'un moteur " + motorisation);
    }

    public void demarrer() {
        System.out.println("Je demarre");
    }

    public void demarrer(int duree) {
        System.out.println("Je démarre pendant " + duree + " minutes");
    }

    public int getNbCylindres() {
        return nbCylindres;
    }

    public void setNbCylindres(int nbCylindres) {
        this.nbCylindres = nbCylindres;
    }

    public static String getMotorisation() {
        return motorisation;
    }

    public static void setMotorisation(String motorisation) {
        Moteur.motorisation = motorisation;
    }

    public String getAnneeFabricationMoteur() {
        return anneeFabricationMoteur;
    }

    public void setAnneeFabricationMoteur(String anneeFabricationMoteur) {
        this.anneeFabricationMoteur = anneeFabricationMoteur;
    }

}
