

import Datatypes.EmailTyp;
import org.junit.Test;

import java.util.EnumMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Louisa on 02.11.2014.
 */
public class TestEmailTyp {

    @Test
    public void blaTest() {
        EmailTyp mail1 = EmailTyp.valueOf("abd@blubb.de");
        EmailTyp mail2 = mail1;
        EmailTyp mail3 = EmailTyp.valueOf("test");

        assertEquals(true, mail1.equals(mail2));
        assertEquals(false, mail1.equals(mail3));
        assertEquals(0, mail1.compareTo(mail2));
        assertEquals(true, EmailTyp.test("marlene.klausen@aol.de"));
        assertEquals(false, EmailTyp.test("marlene.klausen@--?.de"));
        assertEquals(false, EmailTyp.test(".marlene.klausen@aol.de.com.po"));
        assertEquals(true, EmailTyp.test("mm@o-hamburg.de"));
        }
}
