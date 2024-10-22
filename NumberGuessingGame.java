
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(System.in)) {

            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            int maxAttempts = 5;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    hasWon = true;
                    break;
                }
            }

            if (hasWon) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }
        }
    }
}
