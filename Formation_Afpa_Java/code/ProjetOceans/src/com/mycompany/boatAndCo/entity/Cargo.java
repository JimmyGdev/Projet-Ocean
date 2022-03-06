package com.mycompany.boatAndCo.entity;

public class Cargo extends Bateau implements Amarrable{
    private int tonnageMax;
    private int weight;


    public Cargo() {
        super();
    }

    public Cargo(String name, String couleur) {
        super(name, couleur);
    }

    public Cargo(String name, String couleur, int tonnageMax) {
        super(name, couleur, tonnageMax);
    }

    public int amarrer(int vitesse){
        return this.weight / 2 * vitesse / 4;
    }
}
