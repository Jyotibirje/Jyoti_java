package pakage1;
interface Heights{
	
	void bmi1();
	void bmi2();
}
interface Weights{
	void bmi3();
	void bmi4();
}
public class GoogleDemo implements Heights,Weights {

	public static void main(String[] args) {
		System.out.println("Calculte BMI ");

	}public void bmi3() {
	System.out.println("BMI should be 17 to 35");
		
	}
	public void bmi4() {		
		
		System.out.println("BMI should not be <17 to 35>");
	}	
	public void bmi1() {		
		System.out.println("Maximum BMI should 35");
	}
	public void bmi2() {	
		System.out.println("Minimum BMI should be");
	}

}
