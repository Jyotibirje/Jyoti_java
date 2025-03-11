package pakage1;

public class GlobalVariable {
	static int a=100;
	static int b=200;
	static int n;
	double pi=3.14; // 
	static double r=7.7;
	int f=10;
	static double c=3.1;
	static void add() {
		int c=100;  //local
		System.out.println(a+b);
	}
static void sub() {
		
	System.out.println(a-b);
	}
static void mul() {	
	System.out.println(a*b);
}
	public static void main(String[] args) {		
		add();
		sub();
		mul();
		System.out.println(n);
		GlobalVariable g=new GlobalVariable();
		double area =g.pi*r*r;
		System.out.println(area);
	}}