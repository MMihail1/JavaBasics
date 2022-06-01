package Exercises1JavaBasicsCoding;

public class TwoDArrayIntegerOddEvenPrintEven {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// outer loop iterates over rows
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					System.out.print(numbers[row][col] + " ");
				}

			}
			System.out.println(" ");
		}

	}

}
