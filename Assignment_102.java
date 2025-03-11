package pakage1;

import java.util.HashMap;
import java.util.Map;
//Assignment 103
public class Assignment_102 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(5552222, "Tanvi");
		m1.put(4545443, "Kirti");
		m1.put(45765434, "Sai");
		m1.put(54545, "Jija");
		//System.out.println(m1);
		System.out.println("Fetchinh all the values");
		for(String s1         :m1.values())
		{
			System.out.println(s1);
		}
	}

}

