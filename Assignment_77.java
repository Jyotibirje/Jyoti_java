package pakage1;

import java.util.Arrays;

public class Assignment_77 {

	public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=54;
        array[1]=11;
        array[2]=50;
        array[3]=46;
        array[4]=100;
        
       int array1[]=new int[array.length];
       for(int i=0;i<array.length;i++) {
    	   array1[i]=array[i];
       }
       
       System.out.println("Enter array" +Arrays.toString(array));
       System.out.println("Copied array from another array" +Arrays.toString(array1));

	}

}