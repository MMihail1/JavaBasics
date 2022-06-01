package Exercises1JavaBasicsCoding;

public class CheckWhetherNumberPrime {
	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		int num = 7;
		boolean f = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non prime number
			if (num % i == 0) {
				f = true;
				break;
			}
		}
		if (!f)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}