package pakage1;

import java.util.HashMap;
import java.util.Map;

public class Assignment_101 {

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
		m1.putIfAbsent(4544454, "Kirti");
		System.out.println(m2);
		boolean b1=m1.containsKey(4545443);
				System.out.println(b1);
		boolean b2=m1.containsValue("Tanvi");
		System.out.println(b2);
		boolean b3=    m1.equals(m2);
		System.out.println(b3);
		 String s1=m1.get(73897293);
		 System.out.println(s1);
	}

}

