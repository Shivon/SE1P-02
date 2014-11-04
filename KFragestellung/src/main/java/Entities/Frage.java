package Entities;


import Datatypes.Minutes;
import javax.swing.text.Document;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Frage {

    private Fragenart fragenart;
    private int frageNummer;
    private Minutes loesungszeit;
    private Document fragestellung;
    private Document musterloesung;
    private Boolean isAvailable;


    //getter and setter

    public Fragenart getFragenart() {
        return fragenart;
    }

//    public void setFragenart(Fragenart fragenart) {
//        this.fragenart = fragenart;
//    }

    public int getFrageNummer() {
        return frageNummer;
    }

//    public void setFrageNummer(int frageNummer) {
//        this.frageNummer = frageNummer;
//    }

    public Minutes getLoesungszeit() {
        return loesungszeit;
    }

//    public void setLoesungszeit(Minutes loesungszeit) {
//        this.loesungszeit = loesungszeit;
//    }

    public Document getFragestellung() {
        return fragestellung;
    }

    public void setFragestellung(Document fragestellung) {
        fragestellung = fragestellung;
    }

    public Document getMusterloesung() {
        return musterloesung;
    }

    public void setMusterloesung(Document musterloesung) {
        this.musterloesung = musterloesung;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //TODO: Fragenummer darf nicht von jedem änderbar sein... sollte automatisch generieren ~> via DB geregelt später?
    private Frage(int frageNummer, Minutes loesungszeit, Document fragestellung, Document musterloesung, Fragenart fragenart) {
        this.frageNummer = frageNummer;
        this.loesungszeit = loesungszeit;
        this.fragestellung = fragestellung;
        this.musterloesung = musterloesung;
        this.fragenart = fragenart;
        this.isAvailable = true;
    }

    //TODO: Fragenummer darf nicht von jedem änderbar sein... sollte automatisch generieren ~> via DB geregelt später?
    public Frage valueOf(int frageNummer, Minutes loesungszeit, Document fragestellung, Document musterloesung, Fragenart fragenart){
        return new Frage(frageNummer, loesungszeit, fragestellung, musterloesung, fragenart);
    }

}
