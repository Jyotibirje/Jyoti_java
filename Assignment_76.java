package pakage1;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment_76 {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter total index number");
		int age=  s1.nextInt();
		
		int[] a1= new int[age];
		int[] a2=new int[age];
		
		for(int i =0;i<age ;i++)
		{
			a1[i]=s1.nextInt();	
		
		}
		if(Arrays.equals(a1,a2))
		{
			System.out.println("Number are equals");
			
		}
		else
		{
			System.out.println("Number are not equals");
		}
	}

}
