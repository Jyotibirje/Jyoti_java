package pakage1;

public class Equal {

	public static void main(String[] args) {
		
		String input= "jyoti";
		boolean b1= input.equals("Jyoti");
	
		System.out.println(b1);
		
		String input1 = "MOTOR Insurance";
		boolean b3=input1.equals("Health Insurance");
		System.out.println(b3);
		
		
		
		boolean b2 =  input.equalsIgnoreCase("JYOTI");
		System.out.println(b2);
		boolean b4 =input1.equalsIgnoreCase("motor insurance");
		System.out.println(b4);

	}

}


