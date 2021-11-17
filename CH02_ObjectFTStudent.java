
import java.util.Scanner;
public class CH02_ObjectFTStudent{
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

		 Student s = new Student();
		 // ---

		 // --
		 s.setName("Heema");

		 System.out.println("Hello "+s.getName());

	}
}

class Student{

	private String name;

	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		System.out.println("Student : "+this);
		return name;
	}
}