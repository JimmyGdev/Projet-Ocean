package com.mycompany.boatAndCo.entity;

public class Ville {
    private String nom;
    private Port port;


    public Ville() {

    }

    public Ville(String nom, Port port) {
        this.nom = nom;
        this.port = port;
    }

    public Ville(Port port) {
        this.port = port;
    }

    public Ville(String nom, int nbEmplacement) {
        this.nom = nom;
        this.port.setNbEmplacements(nbEmplacement);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }
}

