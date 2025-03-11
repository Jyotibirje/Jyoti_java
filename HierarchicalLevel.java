package pakage1;
class School{
	void head() {
		System.out.println("All rules decided by head");
	}
}		class Teacher extends School
	{	void lec()
		{
			System.out.println("Lectures are divided between all techers");
		}
	}
	class Student extends School
	{
		void book()
		{
			System.out.println("Student require Notebook for each subject");
		}
}
public class HierarchicalLevel {

	public static void main(String[] args) {
		Teacher T=new Teacher();
		T.head();
		T.lec();
		System.out.println("------------------------------");
		Student S= new Student();
		S.head();
		S.book();
}}
