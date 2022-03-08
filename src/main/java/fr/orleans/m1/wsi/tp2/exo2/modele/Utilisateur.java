package fr.orleans.m1.wsi.tp2.exo2.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.UUID;

public class Utilisateur implements Serializable {


    private String id;
    private String nom;
    @JsonIgnore
    private String password;


    public Utilisateur() {
    }

    public Utilisateur(String nom, String password) {
        this.id = UUID.randomUUID().toString();
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
        return id;
    }

    public void setNumeroUtilisateur(String numeroUtilisateur) {
        this.id = numeroUtilisateur;
    }
}
