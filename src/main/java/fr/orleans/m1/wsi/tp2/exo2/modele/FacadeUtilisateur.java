package fr.orleans.m1.wsi.tp2.exo2.modele;

import org.springframework.stereotype.Component;

@Component
public class FacadeUtilisateur {


    Map<String,Utilisateur> utilisateurs;

    public String enregistrerUtilisateur(String nom, String password) {
        Utilisateur utilisateur = new Utilisateur(nom, password);
        this.utilisateur.put(nom,utilisateur);

    }
}
