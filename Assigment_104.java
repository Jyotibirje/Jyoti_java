package pakage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assigment_104 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(5552222, "Tanvi");
		m1.put(4545443, "Kirti");
		m1.put(45765434, "Sai");
		m1.put(54545, "Jija");
		//System.out.println(m1);
		System.out.println("Fetchinh all the values and keyas");
		for(Entry<Integer,String> s4:m1.entrySet())
		{
			System.out.println(s4);
		}

	}

}


