package pakage1;

import java.util.HashMap;
import java.util.Map;

public class Assignmet_99 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(73897293, "Jyoti");
		m1.put(454654545, "Vaibhav");
		m1.put(232132, "Shambu");
		m1.put(6547899, "Raje");
		
		System.out.println(m1);
		
		Map<Integer,String> m3=new HashMap<Integer,String>();
		m3.put(73897293, "hetal");
		m3.put(454654545, "dev");
		m3.put(232132, "Anant");
		m3.put(6547899, "neel");
	//	m2.putAll(m1);
		m3.remove(454654545);
		//m2.remove(232132, "Anant");
		m3.replace(454654545, "tarun");
		m3.replace(73897293 ,"Hetal", "hetal kumar");
			System.out.println(m3);
		
	}

}
