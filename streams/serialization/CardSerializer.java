package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;

/*
 * Important note:          1. Children classes of a parent that implements Serializable will do so as well
 *                          2. Static fields are not serializable (they belong to the class, not a specific object)
 *                          3. Fields declared as #transient" are not serialized, they are ignored.
 *                          4. serialVersionUID is a uniqe veriosn ID for each class.
 */


public class CardSerializer {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new Card(Rank.ACE, Suit.HEARTS));
        deck.add(new Card(Rank.ACE, Suit.SPADES));
        deck.add(new Card(Rank.ACE, Suit.DIAMONDS));
        deck.add(new Card(Rank.ACE, Suit.CLUBS));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("deck.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(deck);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fos.close();
                oos.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
        /*
         *  Get the UID of the serialized class. 
         *  The diserilized class on the other end needs to have an identical class to the serialized one,
         *  ohterwise the UID will differ and an exceptoins will be thrown
         */
        
        //Long serialVeriosnUID = ObjectStreamClass.lookup(deck.getClass()).getSerialVersionUID();
        //System.out.println(serialVeriosnUID);
    }
}