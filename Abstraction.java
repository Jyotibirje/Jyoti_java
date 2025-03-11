package pakage1;

abstract class AB1{
	abstract void add();
	void login()
	{
		System.out.println("logic is implementation1");
	}
	static void logout() {

	System.out.println("logic is implementation2");
	}
}
abstract class AB2 extends AB1{
	abstract void sub();
	void login()
	{
		System.out.println("logic is implementation3");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		//AB2 a= new AB2(); 
		Abstraction a= new Abstraction();
     a.sub();
		
}	void sub() {

		System.out.println("Not expose logic 2");
	}
	void add() {
		System.out.println("Not expose logic");
			}

	}
	
	

