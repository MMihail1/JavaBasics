package Exercises1JavaBasicsCoding;

public class SwapNumbersWithoutTemporaryVariable {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		int x = 10;  
		  int y = 20;  
		  System.out.println("The original of x:" + x);  
		  System.out.println("The original of y:" + y);  
		  System.out.println("Then after swapping");  
		  x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  System.out.println("The swapped value of x:" + x);  
		  System.out.println("The swapped value of y:" + y);

	}

}
