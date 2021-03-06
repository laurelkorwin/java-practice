import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		
		// get ready for the player to use the keyboard
		Scanner scan = new Scanner(System.in);
		
		//play again string
		String playAgain = "";
		
		//game loop
		do {
		
			// create a random number from 1-100
			//(int) casts the number to an int
			int theNumber = (int)(Math.random()*100 + 1);
	
			int guess = 0;
			
			int numberOfTries = 0;
			
			while ( guess != theNumber ) {
				System.out.println("Guess a number between 1 and 100:");
				
				//get the user's guess
				guess = scan.nextInt();
				
				numberOfTries++;
				
				if ( guess < theNumber )
					System.out.println(guess + " is too low, try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high, try again.");
				else
					System.out.println(guess + " is correct. You win!");
			}
			System.out.println("It only took you " + numberOfTries +  " tries! "
					+ "Good work.");
			
			//ask for 'y' to play again
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
			
		} while (playAgain.equalsIgnoreCase("y"));
		
		//thank the user for playing
		System.out.println("Thank you for playing, goodbye.");
	}

}
