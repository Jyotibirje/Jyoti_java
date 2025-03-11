package pakage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Assignment_98 {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Account holder");
		
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(454654545, "Vaibha");
		m1.put(232132, "Shambu");
		m1.put(6547899, "Raje");
		
		System.out.println(m1);
		
	}
}
