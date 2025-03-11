package pakage1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assigmnemt_105 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(5552222, "Tanvi");
		m1.put(4545443, "Kirti");
		m1.put(45765434, "Sai");
		m1.put(54545, "Jija");
		
		System.out.println("Iteration using iterator");
		Set<Entry<Integer,String>> s5 =   m1.entrySet();
	
		Iterator<Entry<Integer,String>> s6  =  s5.iterator();
		while(s6.hasNext())
		{
			System.out.println(s6.next());
		
		}

	}

}
