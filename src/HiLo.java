import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		// Initialize scanner to receive user input
		Scanner scan = new Scanner(System.in);
		
		// Initialize playAgain variable to empty string
		String playAgain = "";

		do {
			// Initialize the number to be guessed
			int theNumber = (int)(Math.random() * 100 + 1);
			// Initialize variable to hold user input
			int guess = 0;
			// Initialize a numGuesses counter
			int numGuesses = 0;
			
			System.out.println("Guess a number between 1 and 100:");

			while (guess != theNumber) {
				// Get user input as integer, store in `guess`
				guess =  scan.nextInt();
				numGuesses++;
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again!");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again!");
				else
					System.out.println(guess + " is correct, and it only took you " + numGuesses + " tries!");
			}
			System.out.println("Would you like to play again? [y/n]");
			// Grab user input as string, store in playAgain
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
