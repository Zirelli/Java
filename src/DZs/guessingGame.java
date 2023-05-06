import java.util.Scanner;
import java.util.Random;
public class guessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int guessesLeft = 0;
        System.out.println("I have a number from 1 to 10, guess it!");
        while (guessesLeft < 4) {
            guessesLeft++;
            int userGuesses = input.nextInt();
            if (userGuesses == number) {
                System.out.println("Grats!");
                break;
            } else if (guessesLeft == 4) {
                System.out.println("Sorry, out of guesses!");
            } else {
                System.out.println("Try again!");
            }
        }

    }
}

