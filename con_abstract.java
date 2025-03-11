package pakage1;

abstract class Export{
	abstract void shipping();
	void ship()
	{
		System.out.println("This is concreate method1");
	}
}

class con_abstract extends Export{
	void ship1()
	{
		System.out.println("This is concreate method2");
	}
	
	public static void main(String[] args) {
		con_abstract i= new con_abstract();
		i.ship();
		i.ship1();
		
	}
	void shipping() {
		System.out.println("This is not expose to thirty party");
		}
}

