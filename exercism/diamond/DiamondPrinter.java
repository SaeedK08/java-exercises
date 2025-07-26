package diamond;

public class DiamondPrinter {
    public char[][] formShape(char letter)
    {
        int size = (letter - 'A') * 2 + 1;    
        int leftIndex = letter - 'A';              
        int rightIndex = letter - 'A';             
        char filler = 'A';
        char[][] letters = new char[size][size];
        boolean reverse = false;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if(j == leftIndex || j == rightIndex)
                {
                    letters[i][j] = filler;
                }
                else 
                {
                    letters[i][j] = '.';
                }
            }
            if (!reverse)
            {
                filler++;
                if(filler > letter)
                {
                    reverse = true;
                    filler = (char) (letter - 1);
                    leftIndex++;
                    rightIndex--;
                    continue;
                }
                leftIndex--;
                rightIndex++;
            }
            else 
            {
                filler--;
                leftIndex++;
                rightIndex--;
            }
        }
        return letters;
    }
}