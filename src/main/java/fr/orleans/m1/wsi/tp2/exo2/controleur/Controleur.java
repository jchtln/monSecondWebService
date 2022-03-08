package fr.orleans.m1.wsi.tp2.exo2.controleur;


import fr.orleans.m1.wsi.tp2.exo2.modele.FacadeUtilisateur;
import fr.orleans.m1.wsi.tp2.exo2.modele.PseudoDejaPrisException;
import fr.orleans.m1.wsi.tp2.exo2.modele.Utilisateur;
import fr.orleans.m1.wsi.tp2.exo2.modele.UtilisateurInexistantException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static fr.orleans.m1.wsi.tp2.exo2.controleur.Paths.*;

@RestController
@RequestMapping(URI_WS)
public class Controleur {

    @Autowired
    private FacadeUtilisateur facadeUtilisateur;


    @PostMapping(value = URI_UTILISATEUR, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> creerUtilisateur(@RequestBody Utilisateur utilisateur) {

        try {

            String id = this.facadeUtilisateur.enregistrerUtilisateur(utilisateur.getNom(), utilisateur.getPassword());
            return ResponseEntity.created(URI.create(SERVEUR + URI_WS + URI_UTILISATEUR + "/" + id))
                    .body("L'utilisateur est crée");

        } catch (PseudoDejaPrisException e) {

            return ResponseEntity.status(HttpStatus.CONFLICT).body("Pseudo déjà pris !");
        }
    }


    @PostMapping(URI_UTILISATEUR + "{idUtilisateur}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable String idUtilisateur,
                                                          @RequestParam String nom,
                                                          @RequestParam String password) {

        try {
            Utilisateur utilisateur = facadeUtilisateur.getUtilisateur(idUtilisateur);
            if (utilisateur.getNom().equals(nom) && utilisateur.getNom().equals(password)) {
                return ResponseEntity.ok(utilisateur);
            } else {
                return  ResponseEntity.notFound().build();
            }
        } catch (UtilisateurInexistantException e) {
            return ResponseEntity.notFound().build();
        }
    }
}



//    @PostMapping(URI_UTILISATEUR)
//    public ResponseEntity<String> deposerVideo(@RequestParam String url,@RequestParam String description, @RequestParam String titre){
//
//        String numVideo = facadeUtilisateur.deposerVideo(url, description, titre);
//        return ResponseEntity.created(URI.create("http://localhost:8080/msws/deposer/"+numVideo))
//                .body(("La vidéo a bie été deposée"));
//    }




// POST/GET /utilisateur/{id}/playlist?LOGIN=&PASSWORD=
//  nomPlaylist

// POST /utilisateur/{idUtilisateur}/video?LOGIN=&PASSWORD=
  // {titre __, contenu,__}
//GET /video
