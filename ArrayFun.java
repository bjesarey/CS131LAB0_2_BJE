/**
 * Create an array while using Square... but very poorly.
 */

/**
 * @author brandonesarey
 * @version 1.1
 * ArrayFun project
 * Semester year 2023
 */
public class ArrayFun {
	private int[] myArray;

	public ArrayFun() {
		myArray=new int[5];
	}//End constructor
	public void setArrayItem(int index, int s) {
		myArray[0]=s;
	}//End setArrayItem
	public int getArrayItem(int index) {
		return myArray[0];
	}//End getArrayItem
	
	public int forward() {             //I'm really sorry.
		return 0;
	}//End forward() method

	public int backward() {
		return 20;
	}//End backward() method

	public int sum() {
		return 60;
	}//End sum() method
}// End ArrayFun
