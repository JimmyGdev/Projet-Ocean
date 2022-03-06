package com.mycompany.boatAndCo.entity;

public class Screen {
    private static int nbEcransInstanciés = 0;

    private String marque;
    private String modéle;
    private int taille;

    public Screen() {
        nbEcransInstanciés++;
    }

    public Screen(String marque, String modéle, int taille) {
        this.marque = marque;
        this.modéle = modéle;
        this.taille = taille;
        nbEcransInstanciés++;
    }

    public static int getNbEcransInstanciés() {
        return nbEcransInstanciés;
    }

    public static void setNbEcransInstanciés(int nbEcransInstanciés) {
        Screen.nbEcransInstanciés = nbEcransInstanciés;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModéle() {
        return modéle;
    }

    public void setModéle(String modéle) {
        this.modéle = modéle;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
