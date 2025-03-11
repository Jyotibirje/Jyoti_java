package pakage1;
import java.util.Arrays;

public class Assigment_82 {

	public static void main(String[] args) {
		String s1="RACE";
		String s2="CARE";
		if(s1.length()!=s2.length()) {
			System.out.println("Not a anagram ");
		}
		else
			{
				System.out.println("How to find out anagram");
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				
				Arrays.sort(c1);
				Arrays.sort(c2);
				System.out.println(c1);
				System.out.println(c2);
				boolean b1= Arrays.equals(c1, c2);
				System.out.println(b1);
				if(b1==true)
				{
					System.out.println("This is anagram");
	}
				else {
					System.out.println("This is not anagram");
				}}}	

	}


