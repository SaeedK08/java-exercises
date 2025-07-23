package guess_the_number;

import java.util.Scanner;

public class GuessMyNumberIO
{
    public static void main(String[] args)
    {
        GuessMyNumberModel guessModel = new GuessMyNumberModel(100); 
        Scanner scanner = new Scanner(System.in);
        System.out.println(guessModel.getNumOfGuesses());
        String cont = "y";
        while(cont.toLowerCase().charAt(0) == 'y')
        {
            guessModel.initGame();
            int guess;
            do
            {
                System.out.println("Make a guess [1..." + guessModel.getUpperBound() + "]: ");
                String numStr = scanner.nextLine();
                guess = Integer.parseInt(numStr);
                guessModel.setGuess(guess);
                System.out.println("Your guess is " + guessModel.compareGuessToString());
                System.out.println("Number of guesses: " + guessModel.getNumOfGuesses());
            } while(guessModel.compareGuess() != 0);
            System.out.println("Congratiulation!");
            System.out.println("Continue (y/n)?");
            cont = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Thamks for playing");
    }
}