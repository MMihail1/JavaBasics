package Exercises1JavaBasicsCoding;

public class TwoDArrayIntCalculateSumEvenOdd {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the
		// sum of even and odd numbers for that array.
		int sumeven = 0;
		int sumodd = 0;
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// outer loop iterates over rows
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					sumeven += numbers[row][col];
				} else if (numbers[row][col] % 2 == 1) {
					sumodd += numbers[row][col];
				}
			}
		}
		System.out.println("Sum of even numbers for this array is " + sumeven);
		System.out.println("Sum of odd numbers for this array is " + sumodd);
	}
}