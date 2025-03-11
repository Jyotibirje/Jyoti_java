package pakage1;
import java.util.HashMap;
import java.util.Map;

public class Assigment_99 {
	public static void main(String[] args) {	
		
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(5552222, "Tanvi");
		m1.put(4545443, "Kirti");
		m1.put(45765434, "Sai");
		m1.put(54545, "Jija");
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(555656, "Kartik");
		m2.put(565331, "Makrand");
		m2.put(456545, "Youraj");
		m2.put(545344, "Rajveer");
		m2.put(45465, "Golu");
		m2.putAll(m1);
		m2.remove(565331);
		m2.remove(555656,"kartik");
		m2.replace(545344, "Sagar");
		m2.replace(456545, "Youraj", "mahesh");
		//boolean b1= m2.isEmpty();
		//System.out.println(b1);

		System.out.println(m2);		
	}

	
}
