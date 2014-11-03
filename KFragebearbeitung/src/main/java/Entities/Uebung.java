package Entities;

import Datatypes.*;

import java.security.UnrecoverableEntryException;
import java.util.Date;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Uebung {

    private Date zeitpunkt;
    private ProcentType korrektheit;
    private TimeType benoetigteZeit;

    //getter and setter
    public Date getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(Date zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public ProcentType getKorrektheit() {
        return korrektheit;
    }

    public void setKorrektheit(ProcentType korrektheit) {
        korrektheit = korrektheit;
    }

    public TimeType getBenoetigteZeit() {
        return benoetigteZeit;
    }

    public void setBenoetigteZeit(TimeType benoetigteZeit) {
        this.benoetigteZeit = benoetigteZeit;
    }

    // TODO: really insert zeitpunkt manually? Or is it coming from DB?
    private Uebung(Date zeitpunkt, ProcentType korrektheit, TimeType benoetigteZeit){
        this.zeitpunkt = zeitpunkt;
        this.korrektheit = korrektheit;
        this. benoetigteZeit = benoetigteZeit;
    }

    // TODO: really insert zeitpunkt manually? Or is it coming from DB?
    public static Uebung valueOf(Date zeitpunkt, ProcentType korrektheit, TimeType benoetigteZeit){
        return new Uebung(zeitpunkt, korrektheit, benoetigteZeit);
    }

    //IMPORTANT: while generating Pruefung/ Uebung we need to check if the questions are available!!!
}
