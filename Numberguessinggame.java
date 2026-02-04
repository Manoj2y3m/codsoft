import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int number = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println(" Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (guess != number && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        if (guess != number) {
            System.out.println(" You lost! The number was: " + number);
        }

        sc.close();
    }
}
