package fr.orleans.m1.wsi.tp2.exo2.modele;

import java.util.UUID;

public class Video {

    private String id;
    private String url;
    private String description;
    private String titre;



    public Video(){

    }
    public Video(String url, String description, String titre) {
        this.id = UUID.randomUUID().toString();
        this.url = url;
        this.description = description;
        this.titre = titre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
