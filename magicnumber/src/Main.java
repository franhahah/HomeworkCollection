import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int maxGuessesAllowed = 4;

        // This is the standard pseudo-random number generator
        Random random = new Random();
        int magicNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 10

        // The scanner is a standard functionality that can read from an input stream,
        //   in this case your terminal (console)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic Number Game!");

        int guesses = 0;
        boolean notGuessedYet = true;

        while(guesses++ < maxGuessesAllowed && notGuessedYet) {
            // we can use the scanner to read 'typed' values from the input.
            System.out.println("Guess the magic number between 1 and 100");
            System.out.printf("You have %d guesses left: ", maxGuessesAllowed - guesses + 1);
            int userGuess = scanner.nextInt();

            // compare magicNumber and userGuess
            if (magicNumber == userGuess) {
                // tell the program the player guessed it
                notGuessedYet = false;
                // tell the player they guessed it
                System.out.println("Good job!");
            } else {
                // tell the player they didn't guess it
                if (userGuess < magicNumber) {
                    System.out.println("Higher!");
                }

                if (userGuess > magicNumber) {
                    System.out.println("Lower!");
                }
            }
        }

        if (notGuessedYet) {
            System.out.println("You lose! Unfortunately Peanut Butter!");
        }


        // close the scanner at the end of your program
        scanner.close();
    }
}