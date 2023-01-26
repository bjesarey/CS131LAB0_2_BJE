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
		ArrayFun a= new ArrayFun();
		System.out.println("Forward method:");
		a.forward();
		System.out.println();
		System.out.println("Backward method:");
		a.backward();
		System.out.println();
		System.out.println("Sum method:");
		a.sum();
	}// End main()

}// End Application
