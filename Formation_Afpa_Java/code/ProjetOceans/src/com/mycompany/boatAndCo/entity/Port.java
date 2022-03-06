package com.mycompany.boatAndCo.entity;

public class Port {
    private int nbEmplacementsLibres;
    private Ville ville;
    private int nbEmplacements;
    private Bateau[] emplacements;

    public Port() {

    }

    public Port(int nbEmplacements, Ville ville) {
        this.nbEmplacements = nbEmplacements;
        this.ville = ville;
    }

    public boolean restePlaceDisponible(Bateau[] emplacements) {
        for (int i = 0; i <= emplacements.length - 1; i++) {   // Soit i < emplacements.length ou i < emplacements.length -1
            if (emplacements[i] == null) {
                System.out.println("reste une place disponible");
                return true;
            }
        }
        System.out.println("le port est remplis!");
        return false;
    }

    public int getNbEmplacementsLibres() {
        return nbEmplacementsLibres;
    }

    public void setNbEmplacementsLibres(int nbEmplacementsLibres) {
        this.nbEmplacementsLibres = nbEmplacementsLibres;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public int getNbEmplacements() {
        return nbEmplacements;
    }

    public void setNbEmplacements(int nbEmplacements) {
        this.nbEmplacements = nbEmplacements;
    }

    public Bateau[] getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Bateau[] emplacements) {
        this.emplacements = emplacements;
    }
}