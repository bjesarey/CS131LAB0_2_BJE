/**
 * Demonstrate how objects can be used from different classes.
 */

/**
 * @author brandonesarey
 * @version 1.1 
 * Application project 
 * Semester year 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		ArrayFun a= new ArrayFun();
		System.out.println("Square area: " + s.getArea());
		System.out.println("Square area from smallest to largest: "+ a.forward());
		System.out.println("Square area from largest to smallest: "+ a.backward());
		System.out.println("Sum of every area: "+ a.sum());
	}// End main()

}// End Application
