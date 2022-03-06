package com.mycompany.boatAndCo.entity;

public class Computer {
    private static int nBPCInstanciés;

    private String marque;
    private String modele;
    private int taille;
    private Screen ecran;


    public Computer() {
        nBPCInstanciés++;
    }

    public Computer(String marque, String modele, int taille, Screen ecran) {
        this.marque = marque;
        this.modele = modele;
        this.taille = taille;
        this.ecran = ecran;
        nBPCInstanciés++;
    }

    public Computer(String marque, String modele, int taille, String ecranMarque, String ecranModéle, int ecranTaille) {
        this.marque = marque;
        this.modele = modele;
        this.taille = taille;
        this.ecran.setMarque(ecranMarque);
        this.ecran.setModéle(ecranModéle);
        this.ecran.setTaille(ecranTaille);
        nBPCInstanciés++;
    }


    public static int getnBPCInstanciés() {
        return nBPCInstanciés;
    }

    public static void setnBPCInstanciés(int nBPCInstanciés) {
        Computer.nBPCInstanciés = nBPCInstanciés;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }
}
