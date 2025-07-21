package dice;

public class Dice
{
    private int value;
    private final int sides = 6;
    private int[] freq = new int[sides];
    public Dice()
    {
        value = 1;
    }
    public int throw_dice()
    {
        value = (int) (Math.random()*6)+1;
        return value;
    }
    public int[] throw_dice(int times)
    {
        int i = 0;
        while(i < times)
        {
            int side = throw_dice();
            freq[--side]++;
            i++;
        }
        return freq;
    }
    public int get_value()
    {
        return value;
    }
    int get_sides_num()
    {
        return sides;
    }

    @Override
    public String toString()
    {
        return "The current value of dice is " + value; 
    }
}
