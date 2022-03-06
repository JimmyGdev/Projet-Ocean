package com.mycompany.boatAndCo.entity;

public class Adresse {
    private int numeros;
    private String rue;
    private int codePostal;
    private String ville;

    public Adresse() {

    }

    public Adresse(int numeros, String rue, int codePostal, String ville) {
        this.numeros = numeros;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
