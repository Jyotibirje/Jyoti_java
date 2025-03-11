package pakage1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment_90 {

	public static void main(String[] args) {
		Collection<Integer> s1= new ArrayList<Integer>();		
		s1.add(456465);
		s1.add(5464565);
	    s1.add(12);
	    s1.add(465614);
	    s1.add(132);
	    s1.add(456);  
	    System.out.println(s1);
	    
	    Iterator i1=      s1.iterator();
	    
	    while(i1.hasNext()) {
	    	System.out.println(i1.next());
	    }

	}
	
}


