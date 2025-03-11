package pakage1;

public class Assignment_86 {

	public static void main(String[] args) {

		
		StringBuffer s1=new StringBuffer("Jyoti ");
		s1.append("anand birje");
		System.out.println("Insert method-->"  + s1.insert(7, "Aasha"));
		System.out.println("Replace method-->"  + s1.replace(15, 22, "Dhawane"));
		System.out.println("Delete Method-->"  +  s1.delete(7, 11));
		System.out.println("SubString -->"  +  s1.substring(0,5));
		StringBuffer s2=new StringBuffer("Vaibhav");
		System.out.println("Reverse method-->"  + s2.reverse());
		
                             
	}

}
