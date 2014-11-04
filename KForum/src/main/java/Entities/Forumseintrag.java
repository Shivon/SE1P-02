package Entities;

import java.text.Normalizer;
import java.util.Date;

/**
 * Created by KamikazeOnRoad on 03.11.2014.
 */
public class Forumseintrag {
    // Declaration
    private String frage;
    private Date zeitstempel;

    // Getter and Setter
    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public Date getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Date zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    // Constructor
    //TODO: check where we get timestamp from
    private Forumseintrag(String frage, Date zeitstempel) {
        this.frage = frage;
        this.zeitstempel = zeitstempel;
    }

    public Forumseintrag valueOf(String frage, Date zeitstempel) {
        return new Forumseintrag(frage, zeitstempel);
    }
}
