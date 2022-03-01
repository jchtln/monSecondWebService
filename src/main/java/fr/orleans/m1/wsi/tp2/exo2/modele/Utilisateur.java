package fr.orleans.m1.wsi.tp2.exo2.modele;

public class Utilisateur {

    private String nom;
    private String password;

    public Utilisateur(String nom, String password) {
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
}
