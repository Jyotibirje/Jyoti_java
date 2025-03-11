package pakage1;

import java.util.Date;

public class Assignmet_85 {

	public static void main(String[] args) {
		           
		Date d1= new Date();
		System.out.println(d1);
		Date d2=new Date(d1.getTime()+(1000*60*60*24*7));
		System.out.println(d2);
		Date d3=new Date(d1.getTime()-(1000*60*60*24*15));
		System.out.println(d3);
		
		      String format= d1.toString();
		
		    String Month=  format.substring(4, 7);
		      System.out.println(Month);
		      String Day=  format.substring(8, 10);
		      System.out.println(Day);
		      String Year=  format.substring(format.length()-4);
		      System.out.println(Year);	
		      String format2= Day.concat("-").concat(Month).concat("-").concat(Year);
		      System.out.println(format2);
		      String format3= Day.concat("/").concat(Month).concat("/").concat(Year);
		      System.out.println(format3);
		      
		      		      
		      	}

}
