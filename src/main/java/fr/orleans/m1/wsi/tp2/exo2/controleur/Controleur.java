package fr.orleans.m1.wsi.tp2.exo2.controleur;


import fr.orleans.m1.wsi.tp2.exo2.modele.FacadeUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mpws")
public class Controleur {

    @Autowired
    private FacadeUtilisateur facadeUtilisateur;

    @PostMapping("/utilisateur")
    public ResponseEntity<String> creerUtilisateur(@RequestParam String nom, @RequestParam String password){

        facadeUtilisateur.enregistrerUtilisateur(nom,password);
    }


    @
}
