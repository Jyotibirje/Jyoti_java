package pakage1;

  public class Assignment_119
 {
		private String emailid="jyoti.birje12@hdfcergo.com";
		public String getEmail()
		{
			return emailid;
		}
		public void setEmail(String emailid)
		{
			this.emailid= emailid;
		} 
		private int age=25;
		public int getAge()
		{
			return age;			
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public static void main(String[] args) {
			Assignment_119 e1= new Assignment_119();
			e1.setEmail("jyotibirje24@gmail.com");
			System.out.println(e1.getEmail());
			e1.setAge(30);
			System.out.println(e1.getAge());
		}}
	 
  
	