package Exercises1JavaBasicsCoding;

public class MaxMinInArray {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int [] num= {7, 45, 77, -67,23,-56};
	    int max , min;
	    min=max = num[0];
	    for (int i = 1; i <num.length; i++) {
	        if (num[i] > max) {
	            max = num[i];
	        } else if(num[i]<min)
	        	 min=num[i];
	    }
	    System.out.println("max is:"+max+"   and  min is:"+min );

	}

}
