
import Component.*;
import Interface.*;
import Services.PersistenceService;
import Services.PersistenceServiceImpl;


/**
 * Created by Louisa on 02.11.2014.
 */
public class main {


    public static void main(String[] args) {

        PersistenceService persistenceService = new PersistenceServiceImpl();
        KModul modul = new KModulImpl(persistenceService);
        KFragestellung fragestellung = new KFragestellungImpl(persistenceService, modul);
        KKommunikation kommunikation = new KKommunikationImpl(persistenceService, modul);
        KFragebearbeitung fragebearbeitung = new KFragebearbeitungImpl(persistenceService, fragestellung, modul);
        KBenutzerService benutzer = new KBenutzerServiceImpl(persistenceService, modul, fragestellung, kommunikation, fragebearbeitung);


    }

}
