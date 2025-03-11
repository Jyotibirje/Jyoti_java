package pakage1;

public class Assignmet_70 
{

	public static void main(String[] args) {
	
		String input="repaper";
		String reverse="";
		for(int i =input.length()-1;i>=0;i--)
		{
			char c1 =  input.charAt(i);
			reverse=reverse+c1;
			
			
		}
		System.out.println(reverse);
		if(input.equals(reverse))
		{
			System.out.println("My word is palindrome");
		}
		else
		{
			System.out.println("My word not is palindrome");
		}
		
	
	}

}

