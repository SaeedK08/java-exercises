package kindergarten_garden;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import kindergarten_garden.KindergartenGarden;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the kindergarten garden" + "\n💐💐💐💐💐💐💐💐💐💐💐\n");
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        String kid = null;
        char[] seeds = {'G', 'C', 'R', 'V'};
        char[] garden = new char[48];
        for(int i = 0; i < garden.length; i++) {
            garden[i] = seeds[rnd.nextInt(seeds.length)];
        }
        System.out.println("[window][window][window]");
        for (int i = 0; i < garden.length; i++) {
            if (i == garden.length / 2) System.out.println();
            System.out.print(garden[i]);
        }
        System.out.println();
        System.out.println("Enter a name to get kid's palnts: ");
        System.out.println("[Alice, Bob, Charlie, David, Eve, Fred\n"+
                            "Genny, Harriet, Ilena,Joseph, Kincaid, Larry]");
        kid = scanner.nextLine();
        Plant[] plants = KindergartenGarden.getPlants(garden, kid);
        System.out.println(Arrays.toString(plants));
    }   
}
