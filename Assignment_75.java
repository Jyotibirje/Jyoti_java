package pakage1;

public class Assignment_75 {

	public static void main(String[] args) {
		
		int [] age = new int[6];
		age[0]=10;
		age[1]=70;
		age[2]=30;
		age[3]=43;
		age[4]=32;
		age[5]=45;

		int sum=0;
		double average=0;
		for(int i =0;i<age.length;i++)
		{ 
			sum=sum+age[i];			
		}
		
		System.out.println(sum);
		average=sum/age.length;
		System.out.println(average);
	}

}

