package pakage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignmnet_ {

	public static void main(String[] args) {
		List<String> s1= new ArrayList<String>();		
		s1.add("jyoti");
		s1.add("tanvi");
	    s1.add("Pooja");
	    s1.add("Shital");
	    s1.add("Chhaya");
	    s1.add("Dipali");
	    s1.add("sai");
	   // System.out.println(s1);
	    Iterator i2=   s1.iterator();
	    while(i2.hasNext()) {
	    	System.out.println(i2.next());
	    }	  
	    
	    System.out.println("List Of Iteration");
	      Iterator<String> i3 =               s1.iterator();
	      System.out.println("Forward Iteration");
	      while(i3.hasNext()) {
	    	  System.out.println(i3.next());
	      } 
	      System.out.println("Backward Iteration");
	      while(i3.hasPrevious()) {
	    	  
	    	  System.out.println(i3.previous());
	      }
	    s1.add(0, "Kirti");
	    //Collections.sort(s1);
	  //  System.out.println("After using sorting-->" +s1);
          
	    

	}
}
