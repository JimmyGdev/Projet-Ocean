package com.mycompany.boatAndCo.entity;

public class Hydravion implements Amarrable{


    int surfaceVoile;


    public Hydravion() {
    }

    public int amarrer(int vitesse){
        return this.surfaceVoile / 3 + vitesse / 4;
    }

}
