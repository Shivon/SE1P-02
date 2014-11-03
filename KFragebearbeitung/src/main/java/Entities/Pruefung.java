package Entities;

import Datatypes.*;

import java.time.Duration;
import java.util.Date;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Pruefung {
    private Date pruefungsbeginn;  //ehemals zeitstempel in UML
    private ProcentType korrektheit;
    private Duration benoetigteZeit;
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

    public Duration getBenoetigteZeit() {
        return benoetigteZeit;
    }

    public void setBenoetigteZeit(Duration benoetigteZeit) {
        this.benoetigteZeit = benoetigteZeit;
    }

    // TODO: really insert pruefungsbeginn manually? Or is it coming from DB?
    private Pruefung(Date pruefungsbeginn, ProcentType korrektheit, Duration benoetigteZeit, LaengeDerPruefungTyp laengeDerPruefung){
        this.pruefungsbeginn = pruefungsbeginn;
        this.korrektheit = korrektheit;
        this.benoetigteZeit = benoetigteZeit;
        this.laengeDerPruefung = laengeDerPruefung;
    }

    // TODO: really insert pruefungsbeginn manually? Or is it coming from DB?
    public static Pruefung valueOf(Date pruefungsbeginn, ProcentType korrektheit, Duration benoetigteZeit, LaengeDerPruefungTyp laengeDerPruefung){
        return new Pruefung(pruefungsbeginn, korrektheit, benoetigteZeit, laengeDerPruefung);
    }

    //TODO: IMPORTANT: while generating Pruefung/ Uebung we need to check if the questions are available!!!
}
