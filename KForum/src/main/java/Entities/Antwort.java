package Entities;

import java.util.Date;

/**
 * Created by KamikazeOnRoad on 03.11.2014.
 */
public class Antwort {
    // Declaration
    private String antwort;
    private Date zeitstempel;
    private Forumseintrag forumseintrag;

    // Getter and Setter
    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }

    public Date getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Date zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    public Forumseintrag getForumseintrag() {
        return forumseintrag;
    }

    // Constructor
    //TODO: check where we get timestamp from
    private Antwort(String antwort, Date zeitstempel, Forumseintrag forumseintrag) {
        this.antwort = antwort;
        this.zeitstempel = zeitstempel;
        this.forumseintrag = forumseintrag;
    }

    public Antwort valueOf(String antwort, Date zeitstempel, Forumseintrag forumseintrag) {
        return new Antwort(antwort,zeitstempel, forumseintrag);
    }
}
