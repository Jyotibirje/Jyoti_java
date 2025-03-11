package pakage1;
interface Animal{
	void add();
	void sub();
}
interface birds extends Animal{
	void mul();
	void div();
}
public class Assignment51 implements birds {
	public static void main(String[] args) {
     System.out.println("100 abstraction");}
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		}
	public void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
		}
	public void mul() {
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	public void div() 
	{	int a=10;
	int b=20;
	System.out.println(a/b);
		}	
	}	
	