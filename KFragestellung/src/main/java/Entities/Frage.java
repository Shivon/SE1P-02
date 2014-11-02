package Entities;

import Datatypes.QuestionNumber;
import Datatypes.TextDocuType;
import Datatypes.TimeType;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Frage {

    //private Fragenart fragenart;
    private QuestionNumber frageNummer;
    private TimeType loesungszeit;
    private TextDocuType Fragestellung;
    private TextDocuType musterloesung;

    public QuestionNumber getFrageNummer() {
        return frageNummer;
    }

    public void setFrageNummer(QuestionNumber frageNummer) {
        this.frageNummer = frageNummer;
    }

    public TimeType getLoesungszeit() {
        return loesungszeit;
    }

    public void setLoesungszeit(TimeType loesungszeit) {
        this.loesungszeit = loesungszeit;
    }

    public TextDocuType getFragestellung() {
        return Fragestellung;
    }

    public void setFragestellung(TextDocuType fragestellung) {
        Fragestellung = fragestellung;
    }

    public TextDocuType getMusterloesung() {
        return musterloesung;
    }

    public void setMusterloesung(TextDocuType musterloesung) {
        this.musterloesung = musterloesung;
    }


}
