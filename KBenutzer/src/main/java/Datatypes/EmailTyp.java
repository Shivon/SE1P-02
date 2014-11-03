package Datatypes;

import java.util.regex.Pattern;

/**
 * Created by Louisa on 02.11.2014.
 */
public class EmailTyp {

    private String email;

   //getter and setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Constructor
    private EmailTyp(String email){
        this.email = email;
    }

    public static EmailTyp valueOf(String email){
        //Regex for emailadresses http://www.regular-expressions.info/email.html
        boolean stringMatch = Pattern.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
               + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", email);

        if (stringMatch){
            return new EmailTyp(email);
        }

        throw new IllegalArgumentException("the emailadress  is illegal");
    }



//    public static boolean test(String email){
//        boolean stringMatch = Pattern.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
//                + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", email);
//
//        if (stringMatch){
//           return true;
//        }
//        return false;
//    }
}
