/**
 * Create an array while using Square.
 */

/**
 * @author brandonesarey
 * @version 1.1 ArrayFun project Semester year 2023
 */
public class ArrayFun {
	Square[] myArray;

	public ArrayFun() {
		myArray = new Square[6];
		for (int i = 0; i <6; i++) {
			myArray[i] = new Square(i);
		} // for

	}// End constructor

	public void setArrayItem(int index, Square s) {
		myArray[index] = s;
	}// End setArrayItem

	public Square getArrayItem(int index) {
		return myArray[index];
	}// End getArrayItem

	public void forward() { // I'm really sorry.
		for (int i = 0; i < 6; i++) {
		System.out.println(myArray[i].getArea());
		} // for
	}// End forward() method

	public void backward() {
		for(int i=6-1; i>=0 ;i--) {
			System.out.println(myArray[i].getArea());
		}//for
	}// End backward() method

	public void sum() {
		int getSum = 0;
		for (int i = 0; i<6; i++)
			getSum = myArray[i].getArea() + getSum;
		System.out.println(getSum);
	}// End sum() method
}// End ArrayFun
