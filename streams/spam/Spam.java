package spam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// Note: You need to create a template file in the parent directory with "#N#" as the token for name.

public class Spam {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("No provided arguments\n" + "Usage: java Spam original_file spam_file name");
            System.exit(1);
        }

        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line = null;
        
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            writer = new BufferedWriter(new FileWriter(args[1]));

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("#N#", args[2]);
                writer.write(line + "\n");
                writer.flush();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            try {
                if(reader != null) {reader.close();}
                if(writer != null) {writer.close();}
            }
            catch(IOException e) {
                System.out.println(e);
            }
            
        }
    }
}