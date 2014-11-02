package Entities;

import Datatypes.LaengeDerPruefungTyp;
import Datatypes.ProcentType;
import Datatypes.TimeType;

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

    private Pruefung(Date pruefungsbeginn, ProcentType korrektheit, TimeType benoetigteZeit, LaengeDerPruefungTyp laengeDerPruefung){
        this.pruefungsbeginn = pruefungsbeginn;
        this.korrektheit = korrektheit;
        this.benoetigteZeit = benoetigteZeit;
        this.laengeDerPruefung = laengeDerPruefung;

    }
}
