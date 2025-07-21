package dice;
import java.util.Scanner;

public class DiceMain
{
    public static void main(String[] args)
    {
        int times;
        int counter = 1;
        times = new Scanner(System.in).nextInt();
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int[] freq_array = new int[d1.get_sides_num()];
        if (times >= 1000)                  // Only calculate frequency, one behaviour
        {
            freq_array = d1.throw_dice(times);
            for(int i = 0; i < freq_array.length; i++)
            {
                System.out.println("Side" + (i+1) + " ferquencey: " + freq_array[i] + " times");
            }
            System.exit(0);
        }
        while(counter <= times)             // Another behaviour
        {
            d1.throw_dice();
            d2.throw_dice();
            System.out.println(d1.toString() + ", " + d2.toString());
            counter++;
        }
    }
}