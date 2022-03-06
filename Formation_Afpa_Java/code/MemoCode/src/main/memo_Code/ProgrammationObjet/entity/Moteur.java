package main.memo_Code.ProgrammationObjet.entity;

public class Moteur {
    private int nbCylindres;
    private String motorisation;

    public void afficherMotorisation(){
        System.out.println("Il s'agit d'un moteur " + motorisation);
    }

    public int getNbCylindres() {
        return nbCylindres;
    }

    public void setNbCylindres(int nbCylindres) {
        this.nbCylindres = nbCylindres;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(String motorisation) {
        this.motorisation = motorisation;
    }
}
