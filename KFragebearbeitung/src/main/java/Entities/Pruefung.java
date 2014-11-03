package Entities;

import Datatypes.*;

import java.util.Date;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Pruefung {
    private Date pruefungsbeginn;  //ehemals zeitstempel in UML
    private ProcentType korrektheit;
    private TimeType benoetigteZeit;
    private LaengeDerPruefungTyp laengeDerPruefung;

    //Länge der Prüfung befindet sich im Enum LaengeDerPruefung


    public Date getPruefungsbeginn() {
        return pruefungsbeginn;
    }

    public void setPruefungsbeginn(Date pruefungsbeginn) {
        this.pruefungsbeginn = pruefungsbeginn;
    }

    public ProcentType getKorrektheit() {
        return korrektheit;
    }

    public void setKorrektheit(ProcentType korrektheit) {
        this.korrektheit = korrektheit;
    }

    public TimeType getBenoetigteZeit() {
        return benoetigteZeit;
    }

    public void setBenoetigteZeit(TimeType benoetigteZeit) {
        this.benoetigteZeit = benoetigteZeit;
    }

    // TODO: really insert pruefungsbeginn manually? Or is it coming from DB?
    private Pruefung(Date pruefungsbeginn, ProcentType korrektheit, TimeType benoetigteZeit, LaengeDerPruefungTyp laengeDerPruefung){
        this.pruefungsbeginn = pruefungsbeginn;
        this.korrektheit = korrektheit;
        this.benoetigteZeit = benoetigteZeit;
        this.laengeDerPruefung = laengeDerPruefung;
    }

    // TODO: really insert pruefungsbeginn manually? Or is it coming from DB?
    public static Pruefung valueOf(Date pruefungsbeginn, ProcentType korrektheit, TimeType benoetigteZeit, LaengeDerPruefungTyp laengeDerPruefung){
        return new Pruefung(pruefungsbeginn, korrektheit, benoetigteZeit, laengeDerPruefung);
    }

    //IMPORTANT: while generating Pruefung/ Uebung we need to check if the questions are available!!!
}
