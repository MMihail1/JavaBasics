package Exercises1JavaBasicsCoding;

public class PrintFirstTenNumFibonacci {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci
		// series.(0,1,1,2,3.....)

		int n = 10;
		int first = 0, next = 1;// the 2 first terms in Fibonacchi sequence
		System.out.println("The first 10 numbers of fibonnacci series");

		System.out.print(first + " " + next);
		for (int i = 1; i <= n - 2; i++) {
			int sum = first + next;
			first = next; // switch
			next = sum; // switch
			System.out.print(" " + sum);

		}

	}
}
