
import Component.KFragestellungImpl;
import Component.KKommunikationImpl;
import Component.KModulImpl;
import Interface.*;


 /**
 * Created by Louisa on 02.11.2014.
 */
public class main {


    public static void main(String[] args) {

        KModul modul = new KModulImpl();
        KFragestellung fragestellung = new KFragestellungImpl(modul);
        KKommunikation kommunikation = new KKommunikationImpl(modul);


    }

}
