/**
 * Our own definition of a Picture having an array of pixels, 
 * the width and height.
 */
public class PictureExtended
{
  /** Width of the image in pixels */
  int width;
  /** Height of the image in pixels */
  int height;
  /** Actual pixels in the image */
  Pixel[] pixels;

  public int getArea()
  {
    return width * height;
  }
}
