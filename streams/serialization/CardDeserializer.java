package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CardDeserializer {
    @SuppressWarnings ("unchecked")
    public static void main(String[] args) {
        ArrayList<Card> deserializedDexk = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream("deck.ser");
            ois = new ObjectInputStream(fis);
            deserializedDexk = (ArrayList<Card>) ois.readObject();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try {
            if (fis != null) {fis.close();}
            if (ois != null) {ois.close();}
        }
        catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(deserializedDexk.toString());
    }
}