import Datatypes.EmailTyp;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Louisa on 02.11.2014.
 */
public class TestEmailTyp {

    @Test
     public void blaTest(){
       assertEquals(true, EmailTyp.test("marlene.klausen@aol.de"));
       assertEquals(false, EmailTyp.test("marlene.klausen@--?.de"));
       assertEquals(false, EmailTyp.test(".marlene.klausen@aol.de.com.po"));
       assertEquals(true, EmailTyp.test("mm@o-hamburg.de"));
    }
}
