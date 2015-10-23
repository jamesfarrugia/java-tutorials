import java.util.Scanner;

/**
 * Simple game to guess the value in the code.
 */
public class GuessOnce
{
	/**
	 * Main method
	 */
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter guessed value:");
		int input = keyboard.nextInt();

		if (input == 5)
			System.out.println("Correct! :D");
		else
			System.out.println("Sorry, you lost! :(");
	}
}
