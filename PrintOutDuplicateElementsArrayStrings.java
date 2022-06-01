package Exercises1JavaBasicsCoding;

public class PrintOutDuplicateElementsArrayStrings {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?
		String[] colors= {"Pink", "Blue", "White", "Black", "Pink","Red", "Yello", "Red"};
		String reference=colors[0];
		for (int i=0;i<colors.length;i++) {
			for(int j = i + 1; j < colors.length; j++) {  
	                if(colors[i] == colors[j]) {  
	                    System.out.println(colors[j]);  
	            }  
	        }  
		}

	}

}
