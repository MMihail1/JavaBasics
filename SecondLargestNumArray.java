package Exercises1JavaBasicsCoding;

public class SecondLargestNumArray {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int numbers[]= {8, 10, 17, 21, 35, 29, 33};
		int first=numbers[0];
		int second=numbers[0];
		
		for (int i=0; i<numbers.length;i++) {
			if (numbers[i]>first) {
				second=first;
				first=numbers[i];
			} else if(numbers[i]>second) {
				second=numbers[i];
			}
		}
		System.out.println("The second largest number is "+second);

	}

}
