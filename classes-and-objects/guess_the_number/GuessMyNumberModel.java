package guess_the_number;

import java.util.Random;

public class GuessMyNumberModel
{   
    private int number;
    private int guess;
    private int numOfGuesses;
    private int upperBound;
    private Random random;
    GuessMyNumberModel(int upperBound)
    {
        this.upperBound = upperBound;
        random = new Random();
    }
    int getUpperLimit()
    {
        return upperBound;
    }
    void initGame()
    {
        numOfGuesses = 0;
        number = random.nextInt(upperBound) + 1;
    }
    void setGuess(int guess)
    {
        numOfGuesses++;
        this.guess = guess;
    }
    int compareGuess()
    {
        return guess - number;
    }
    String compareGuessToString()
    {
        if (guess == number)    return "Correct";
        else if (guess > number) return "high";
        else return "low";
    }
    int getNumOfGuesses()
    {
        return numOfGuesses;
    }
    int getUpperBound()
    {
        return upperBound;
    }
}