package pakage1;

abstract class Animal1{
	abstract void makesound();
	public void sleep()
	{
		System.out.println("Animals are sleeping");
	}
}
class Concreate1 extends Animal1{
	void makesound() {
		
		System.out.println("dogs barks");
	}


	public static void main(String[] args) {
		Concreate1 d=new Concreate1();
		d.makesound();
		d.sleep();
		
	}



}
