package com.mycompany.boatAndCo.entity;

public class Passager {
    private static int nbPassagersCréeé = 0;

    private String nom;
    private String prenom;
    private Adresse adresse;

    public Passager() {
        System.out.println("Un passager est instancié via le constructeur sans paramètres");
        nbPassagersCréeé++;
        if (nbPassagersCréeé == 8) {
            System.out.println("Il y a 8 passagers");
            System.out.println("Attention à l'alien!");
        }
    }

    public Passager(String nom) {
        System.out.println("Un passager est instancié via le constructeur avec nom: " + nom);
        this.nom = nom;
        nbPassagersCréeé++;
    }

    public Passager(String nom, String prenom) {
        System.out.println("Un passager est instancié via le constructeur avec nom: " + nom + " et prénom: " + prenom);
        this.nom = nom;
        this.prenom = prenom;
        nbPassagersCréeé++;
    }

    public Passager(String nom, String prenom, Adresse adresse) {
        System.out.println("Un passager est instancié via le constructeur avec nom: " + nom + " et prénom: " + prenom);
        this.nom = nom;
        this.prenom = prenom;
        nbPassagersCréeé++;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public static int getNbPassagersCréeé() {
        return nbPassagersCréeé;
    }

    public static void setNbPassagersCréeé(int nbPassagersCréeé) {
        Passager.nbPassagersCréeé = nbPassagersCréeé;
    }
}
