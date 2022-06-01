package Exercises1JavaBasicsCoding;

import java.util.Scanner;

public class TheSumOfTheNumbers {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values.
		// After the array is created, calculate the sum of all stored elements in that
		// array.

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			sum += numbers[i];
		}
		System.out.println("The sum of numbers is: " + sum);

		input.close();

	}

}
