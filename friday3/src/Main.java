import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int guesses=0;
        final int maxguesses=4;
        boolean notGuessJet = true;

        // This is the standard pseudo-random number generator
        Random random = new Random();
        int magicNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 10

        // The scanner is a standard functionality that can read from an input stream,
        //   in this case your terminal (console)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic Number Game!");
        System.out.print("Guess the magic number between 1 and 100: ");


        // we can use the scanner to read 'typed' values from the input.

        while ( (guesses < maxguesses) && notGuessJet ) {

            int userGuess = scanner.nextInt();
            //YOUR CODE GOES HERE
            System.out.println( "nr:"+ (guesses+1));

            // compare magicNumber and userGuess
            if (magicNumber == userGuess) {
                // tell the player they guessed it;
                System.out.println("Good job!");
                notGuessJet = false;
                scanner.close();

            } else {
                // tell the player they didn't guess it

                if (userGuess > magicNumber) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");

                }
                System.out.println("nr =" + magicNumber);
            }

            guesses=guesses+1;
            System.out.println("You have " + (maxguesses-(guesses-1))  + "  left" );


        }


        System.out.println("You lose! Unfortunately Peanut Butter!");

        // close the scanner at the end of your program
        scanner.close();

    }
}

