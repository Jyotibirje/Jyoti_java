package pakage1;

public class Assignment_60 {

	
	static {  //SIB
		
		System.out.println("This is SIB -1 and excute start from SIB");
		
	}
	static
	{

			System.out.println("This is SIB -3 and excute start from SIB");
				}
	
	{       System.out.println("This is IIB-1 and excute after run main method");
		
	}
	{       System.out.println("This is IIB-2 and excute after run main method");
	
	}
	public static void main(String[] args) {
		
		System.out.println("This is main method and excute after run SIB ");
		new Assignment_60();
	
	}

}


