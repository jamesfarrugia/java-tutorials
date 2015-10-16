/**
 * Hello world program.  Creates an image and calculates the area.
 */
public class HelloWorldPicture
{
	/**
	 * Main method that does the work
	 * 
	 * @param args array with command line arguments
	 */
	public static void main(String[] args)
	{
		// Declaring the image
		Picture myPicture = new Picture();
		// Set the width and height of the myPicture instance
		myPicture.width = 10;
		myPicture.height = 10;
		
		int area = myPicture.width * myPicture.height;
		myPicture.pixels = new Pixel[area];
	  	// Print out the area (width times height)
		System.out.println("Area = " + area);
	}
}
