// Skriv en klass, Email, som representerar en e-postadress. Klassen ska vara ”immutable” och ha
// nedanstående funktionalitet och det ska endast gå att skapa objekt som representerar korrekta e-
// post-adresser.
// a) Skriv först en egen exception-klass, IllegalEmailAdressException. Klassen ska ärva från
// RuntimeException och ha två konstruktorer, en parameterlös och en som tar ett meddelande som
// argument.
// b) Skriv klassen Email, med nedanstående funktionalitet.
// - En klassmetod, static, som tar en text som argument och returnerar ett nytt Email-objekt. Om
// texten inte representerar en korrekt e-postadress ska ett IllegalEmailAdressException kastas1
// .
// Klassen ska inte ha någon publik konstruktor
// - getAsString, som returnerar adressen som ett String-objekt.
// - equals, som returnerar true om två adresser är lika, i annat fall false.
// Skriv ett main där skapar objekt och testar funktionaliteten.
package exceptions;

import java.util.regex.Pattern;

public class Email {
    private String emailStr;
    private Email(String name) {
        this.emailStr = name;
    }
    public static Email createEmail (String eAdress) throws IllegalEmailAdressException {
        if (!Pattern.matches("^[a-z0-9+_.-]+@[a-z.]+$", eAdress)) {
            throw new IllegalEmailAdressException("Not a valid email adress");
        }
        return new Email(eAdress);
    }
    public String getAsString() {
        return this.emailStr;
    }
    public boolean equals(Object obj) {
        if(this.emailStr == obj) return true;
        if(obj instanceof Email) {
            Email email = (Email) obj;
            if(this.emailStr == email.emailStr) return true;
        }
        return false;
    }
    public String toString() {
        return "Email: {" + this.emailStr + "}";
    }
}