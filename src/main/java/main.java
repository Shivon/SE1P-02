
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
        KModulService modul = new KModulServiceImpl(persistenceService);
        KFragestellungService fragestellung = new KFragestellungServiceImpl(persistenceService, modul);
        KKommunikationService kommunikation = new KKommunikationServiceImpl(persistenceService, modul);
        KFragebearbeitungService fragebearbeitung = new KFragebearbeitungServiceImpl(persistenceService, fragestellung, modul);
        KBenutzerService benutzer = new KBenutzerServiceImpl(persistenceService, modul, fragestellung, kommunikation, fragebearbeitung);

    }

}
