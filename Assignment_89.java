package pakage1;
import java.util.ArrayList;
import java.util.Collection;
public class Assignment_89 {
	public static void main(String[] args) {
		
		Collection<Integer> s1= new ArrayList<Integer>();		
		s1.add(456465);
		s1.add(5464565);
	    s1.add(12);
	    s1.add(465614);
	    s1.add(132);
	    s1.add(456);  
	    s1.remove(12);
	    System.out.println(s1);
	    	    
		Collection<String> s2= new ArrayList<String>();		
		s2.add("vaibhav");
		s2.add("Tanvi");	    
	    System.out.println(s2);
       Collection<Double> s3= new ArrayList<Double>();		
		s3.add(10.11);
		s3.add(15.10);	 		
	     System.out.println(s3);
	     boolean b2= s3.contains(200.10);
	     System.out.println(b2);
	    Collection<Boolean> s4= new ArrayList<Boolean>();		
	  		s4.add(true);
	  		s4.add(false);
	  		boolean b1= s3.isEmpty();
	  	  System.out.println(s4);
	  	  boolean b3=s4.containsAll(s1);
	  	  System.out.println(b3);
	  	 
	    
}
}