/**
 * Create a Square object and give it a value, along with an area method.
 */

/**
 * @author Brandon Esarey
 * @version 1.1 
 * Square project 
 * Semester year 2023
 */
public class Square {
	private int x;// Will be used as the side of the square.

	public Square() {
		x = 1;
	}// End Constructor

	public Square(int side) {
		x = side;
	}// End Constructor

	public void setX(int side) {
		x = side;
	}// End SetX

	public int getX() {
		return x;
	}// End GetY

	public int getArea() {
		return x * x;
	}// End area() method
}// End Square
