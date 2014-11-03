package Entities;

import Datatypes.*;

/**
 * Created by Louisa on 02.11.2014.
 */
public class Benutzer {
    // declaration
    private String name;
    private String vorname;
    private EmailTyp email;
    private String benutzername;
    private PasswordType passwort;
    private int berechtikung;
    private PhotoType anzeigebild;

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public EmailTyp getEmail() {
        return email;
    }

    public void setEmail(EmailTyp email) {
        this.email = email;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public PasswordType getPasswort() {
        return passwort;
    }

    public void setPasswort(PasswordType passwort) {
        this.passwort = passwort;
    }

    public int getBerechtikung() {
        return berechtikung;
    }

    public void setBerechtikung(int berechtikung) {
        this.berechtikung = berechtikung;
    }

    public PhotoType getAnzeigebild() {
        return anzeigebild;
    }

    public void setAnzeigebild(PhotoType anzeigebild) {
        this.anzeigebild = anzeigebild;
    }


    //Constructor
    private Benutzer(String name, String vorname, EmailTyp email,String benutzername, PasswordType passwort, int berechtikung, PhotoType anzeigebild) {
        this.name = name;
        this.vorname = vorname;
        this.email = email;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.berechtikung = berechtikung;
        this.anzeigebild = anzeigebild;
    }

    public Benutzer valueOf(String name, String vorname, EmailTyp email,String benutzername, PasswordType passwort, int berechtikung, PhotoType anzeigebild){
        return new Benutzer(name, vorname, email, benutzername, passwort, berechtikung, anzeigebild);
    }


}
