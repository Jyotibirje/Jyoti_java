package pakage1;

public class ConstructorOverloding {

	ConstructorOverloding()
	{
		System.out.println("construcor =1");
	}
	
	ConstructorOverloding(int a,char b)
	
	{
		System.out.println("construcor =2");
	}
	ConstructorOverloding(double c,boolean a)
	{
		System.out.println("construcor =3");
	}
	public static void main(String[] args) {
		
		
		new ConstructorOverloding();
		new ConstructorOverloding(20,'V');
	new ConstructorOverloding(25.2,true);

}
}
