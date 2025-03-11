package pakage1;

public class Finalvariable {

	final static double pi=3.14;
	static void area1() {
	double pi=3.14;
	int radius=7;
	double area =pi*radius*radius;
	System.out.println(area);
	}
	public static void main(String[] args) {
		
        area1();
		 //pi=10;
		System.out.println(pi);
	}

}

