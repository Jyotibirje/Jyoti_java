package pakage1;
public class Assignment_83 {
	public static void main(String[] args) {
		
		int no_of_alphabet=0;
		int no_of_digit=0;
		int no_of_space=0;
		String s1="jy o ti 4 56  %%  * @";
		char c1[]= s1.toCharArray();
     for(int i=0;i<c1.length;i++)
     { 	 
    	boolean b1= Character.isAlphabetic(c1[i]);
    	boolean b2=Character.isDigit(c1[i]);
    	boolean b3=Character.isWhitespace(c1[i]);
    	if(b1==true)
    		
    	{
    		no_of_alphabet++;
    	}
    	if(b2==true)
    	{
    		no_of_digit++;
    	}
    	if(b3==true)
    	{
    		no_of_space++;
    	}    
    	}
     int no_of_specialchar =s1.length()-(no_of_alphabet+no_of_digit+no_of_space);
     System.out.println("Total SecialChar-> " +no_of_specialchar);
     System.out.println("Total Alphabet ->  " + no_of_alphabet);
     System.out.println("Total Digit no ->  " +  no_of_digit);
     System.out.println("Total Space    ->  " + no_of_space);				
	}
}
