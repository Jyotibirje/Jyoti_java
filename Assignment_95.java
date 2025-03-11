package pakage1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//aasignment_96
public class Assignment_95 {

	public static void main(String[] args) {
		
		Set<Integer> s1= new HashSet<Integer>();
		s1.add(456465);
		s1.add(5464565);
	    s1.add(12);
	    s1.add(465614);
	    s1.add(132);
	    s1.add(456); 
	    s1.add(456); 
	    s1.add(null);
	    System.out.println(s1);
	    
	    Iterator i2=   s1.iterator();
	    while(i2.hasNext()) {
	    	System.out.println(i2.next());
	    }	  
	    
     
	}

}
