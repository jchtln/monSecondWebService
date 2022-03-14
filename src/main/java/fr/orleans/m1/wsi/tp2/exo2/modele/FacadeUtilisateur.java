package fr.orleans.m1.wsi.tp2.exo2.modele;

import jdk.jshell.execution.Util;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FacadeUtilisateur {

    private Map<String,Utilisateur> utilisateurById;
    private Map<String,Utilisateur> utilisateurByLogin;

    private Map<Utilisateur,Video> playlistByUser;
    private Map<String,Video> videoMap;


    public FacadeUtilisateur(){
        this.utilisateurById = new HashMap<>();
        this.utilisateurByLogin = new HashMap<>();

    }


    public String enregistrerUtilisateur(String nom, String password) throws PseudoDejaPrisException{

        if(utilisateurByLogin.containsKey(nom)){
            try {
                throw new PseudoDejaPrisException();
            } catch (PseudoDejaPrisException e) {
                e.printStackTrace();
            }
        }
        Utilisateur utilisateur = new Utilisateur(nom, password);
        this.utilisateurById.put(utilisateur.getNumeroUtilisateur(),utilisateur);
        this.utilisateurByLogin.put(utilisateur.getNom(),utilisateur);
        return utilisateur.getNumeroUtilisateur();
    }


    public Utilisateur getUtilisateur(String idUtilisateur) throws UtilisateurInexistantException {
        if (this.utilisateurById.containsKey(idUtilisateur)) {
            return this.utilisateurById.get(idUtilisateur);
        }
        throw new UtilisateurInexistantException();

    }


    public String deposerVideo(String url, String description, String titre){
        Video video = new Video(url,description,titre);
        videoMap.put(video.getId(),video);
        playlistByUser.put(idUtilisateur,video);

        return ("la vdeo");
    }


}
