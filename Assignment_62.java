package pakage1;

public class Assignment_62 {

	public static void main(String[] args) {
		
		String str=null;

		 try {
				int c=1/1;
			System.out.println(c);
		
		System.out.println(str.length());

			}
			 catch(ArithmeticException a1) {
					
				 System.out.println("Handle the exception in catch block");
			}
		 catch(NullPointerException a2)
		
		 {
			 System.out.println("Handle null point exception");
		 }
		
		 finally {
			 System.out.println("This block will execute ");
		 }
	}		 
}
