package Datatypes;

/**
 * Created by Louisa on 02.11.2014.
 */
public class LaengeDerPruefungTyp {
    LaengeDerPruefung laenge;

    private LaengeDerPruefungTyp(LaengeDerPruefung laenge){
        this.laenge = laenge;
    }

    public LaengeDerPruefungTyp valueOf(LaengeDerPruefung laenge){
        return new LaengeDerPruefungTyp(laenge);
    }

    public int laengeInMinuten() {
        switch (laenge){
            case SHORT_FORTYFIVE:
              return 45;

            case LONG_NINETY:
                return 90;

            default:
                return 0;
        }
    }

}
