package com.mycompany.boatAndCo.entity;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String dateOfBirth;
    private int vitesse;
    private Bateau bateau;
    private Adresse adresse;

    //Méthodes


    public void sePresenter() {
        System.out.printf("Je m'apelle %s %s et j'ai %d ans\n", firstName, lastName, age);
    }

    public void coucou() {
        System.out.println("Coucou");
    }

    public int renvoyerAge() {

        return age;
    }

    public void sePresenter(boolean cotisAJour) {
        if (cotisAJour) {
            System.out.println("Mes cotisations sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
    }

    public void sePresenter(String cotisAJour) {
        if (cotisAJour == "cotisAJour") {
            System.out.println("Mes cotisations sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
    }

    public int vieillir(int anneAjoute) {
        int nouvelAge = anneAjoute += 10;
        return nouvelAge;
    }

    public int getAge() {
        return age;
    }

    public int vieillirVraiment(int annee) {
        this.age += annee;
        return annee;
    }

    public int calculerAnciennete(int anneArrive, boolean cotisAJour) {
        if (cotisAJour) {
            System.out.println("Mes cotisation sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
        return 2022 - anneArrive;
    }


    //getter setter
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public Bateau getBateau() {
        return bateau;
    }

    public void setBateau(Bateau bateau) {
        this.bateau = bateau;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
