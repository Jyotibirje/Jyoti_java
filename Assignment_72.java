package pakage1;

import java.util.Arrays;

public class Assignment_72 { //Assignment 79

	public static void main(String[] args) {
		   int array[]=new int[5];
	        array[0]=54;
	        array[1]=11;
	        array[2]=50;
	        array[3]=46;
	        array[4]=100;
	        
	       int reverse[]=new int[array.length];
	       
	       for(int i=0,j=4; i<array.length;i++,j--) {
	    	   reverse [i]=array[j];
	       }
	       
	       
	       System.out.println("Enter array" +Arrays.toString(array));
	       System.out.println("Copied array from another array" +Arrays.toString(reverse));
	}
	
}
