package main.java.Entities;

import main.java.Datatypes.*;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Frage {

    private Fragenart fragenart;
    private int frageNummer;
    private TimeType loesungszeit;
    private TextDocuType fragestellung;
    private TextDocuType musterloesung;

    //getter and setter

    public Fragenart getFragenart() {
        return fragenart;
    }

    public void setFragenart(Fragenart fragenart) {
        this.fragenart = fragenart;
    }

    public int getFrageNummer() {
        return frageNummer;
    }

    public void setFrageNummer(int frageNummer) {
        this.frageNummer = frageNummer;
    }

    public TimeType getLoesungszeit() {
        return loesungszeit;
    }

    public void setLoesungszeit(TimeType loesungszeit) {
        this.loesungszeit = loesungszeit;
    }

    public TextDocuType getFragestellung() {
        return fragestellung;
    }

    public void setFragestellung(TextDocuType fragestellung) {
        fragestellung = fragestellung;
    }

    public TextDocuType getMusterloesung() {
        return musterloesung;
    }

    public void setMusterloesung(TextDocuType musterloesung) {
        this.musterloesung = musterloesung;
    }

    private Frage(int frageNummer, TimeType loesungszeit, TextDocuType fragestellung, TextDocuType musterloesung, Fragenart fragenart) {
        this.frageNummer = frageNummer;
        this.loesungszeit = loesungszeit;
        this.fragestellung = fragestellung;
        this.musterloesung = musterloesung;
        this.fragenart = fragenart;
    }

    public Frage valueOf(int frageNummer, TimeType loesungszeit, TextDocuType fragestellung, TextDocuType musterloesung, Fragenart fragenart){
        return new Frage(frageNummer, loesungszeit, fragestellung, musterloesung, fragenart);
    }

}
