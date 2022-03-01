package fr.orleans.m1.wsi.tp2.exo2.modele;

import org.springframework.stereotype.Component;

@Component
public class FacadeUtilisateur {

    public String enregistrerUtilisateur(String nom, String password) {

        Etudiant etudiant = new Etudiant(nom,prenom,adresse);
        this.etudiants.put(etudiant.getNumeroEtudiant(),etudiant);
        return etudiant.getNumeroEtudiant();
    }
}
