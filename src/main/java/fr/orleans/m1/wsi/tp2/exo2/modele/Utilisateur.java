package fr.orleans.m1.wsi.tp2.exo2.modele;

import java.util.UUID;

public class Utilisateur {

    private String numeroUtilisateur;
    private String nom;
    private String password;

    public Utilisateur(String numeroUtilisateur, String nom, String password) {
        this.numeroUtilisateur = UUID.randomUUID().toString();
        this.nom = nom;
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumeroUtilisateur() {
        return numeroUtilisateur;
    }

    public void setNumeroUtilisateur(String numeroUtilisateur) {
        this.numeroUtilisateur = numeroUtilisateur;
    }
}
