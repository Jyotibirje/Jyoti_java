package pakage1;

public class Class_method {

	private static void privateclass()
	{
		System.out.println("This is private class");
	}
	protected static void protectedclass()
	{
		System.out.println("This is protected class");
	}
	

	static void defaultclass()
	{
		System.out.println("This is default class");
	}
	 public static void publicclass()
		{
			System.out.println("This is public class");
		}
		
	 
	public static void main(String[] args) {
		
		privateclass();
		protectedclass();
		defaultclass();
		publicclass();
				

	}

}
