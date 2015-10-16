import java.util.Scanner;

/**
 * Hello world program.  Creates an image having the sizes 
 * specified by the user.
 */
public class HelloWorldInput
{
	/**
	 * Main method that does the work
	 * 
	 * @param args array with command line arguments
	 */
	public static void main(String[] args)
	{
		run();
	}

	/**
	 * Method to take in the user input and run the general program
	 */
	static void run()
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter width");
		int width = keyboard.nextInt();
		System.out.println("Enter height");
		int height = keyboard.nextInt();

		createPicture(width, height);
	}

	/**
	 * Creates the picture with the specified size.
	 *
	 * @param width the width of the picture
	 * @param height the height of the picture
	 */
	static void createPicture(int width, int height)
	{
		// Declaring the image
		PictureExtended picture = new PictureExtended();

		// Set the width and height of the picture instance
		picture.width = width;
		picture.height = height;
		
		// Create the pixel array having the size of the area
		picture.pixels = new Pixel[picture.getArea()];

		// Print the are of the picture
		printArea(picture);
	}

	/**
	 * Print the area of a picture
	 */
	static void printArea(PictureExtended picture)
	{
		System.out.println("Area = " + picture.getArea());
	}
}
