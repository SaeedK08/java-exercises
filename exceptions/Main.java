package exceptions;

public class Main {

    public static void main(String[] args) {

        Email anders = Email.createEmail("anderslm@kth.se");
        System.out.println(anders);
        Email saeed = Email.createEmail("skassab@kth.se");
        System.out.println(saeed);
        System.out.println(anders.equals(saeed));

        Email reine = Email.createEmail("reineb@");
        System.out.println(reine);
    }
}