package pakage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_92 {
	public static void main(String[] args) {
		
		List<String> s1= new ArrayList<String>();		
		s1.add("jyoti");
		s1.add("tanvi");
	    s1.add("Pooja");
	    s1.add("Shital");
	    s1.add("Chhaya");
	    s1.add("Dipali");
	    s1.add("sai");
	    System.out.println(s1);
	  
	    s1.add(0, "Kirti");
	    Collections.sort(s1);
	    System.out.println("After using sorting-->" +s1);
          
	    List<String> s2= new ArrayList<String>();		
		s2.add("Sagar");
		s2.add("Raj");
	    s2.add("Mahesh");
	    s2.add("Vaibhav");
	    System.out.println(s2);
	    s2.addAll(1, s1);
	    System.out.println(s2);

	}

}
