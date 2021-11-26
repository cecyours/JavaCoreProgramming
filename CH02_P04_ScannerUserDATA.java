
import java.util.*;
public class CH02_P04_ScannerUserDATA{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		System.out.print("Enter name : ");
		s.name = sc.nextLine();

		System.out.print("Enter rollno : ");
		s.rollno = sc.nextInt();

		System.out.print("Enter Subject : ");
		s.subject = sc.nextLine();

		System.out.print("Enter Marks : ");
		s.marks = sc.nextFloat();
		System.out.println("----------------------------------");


		System.out.println("name : "+s.name+"\t rollno : "+s.rollno+"\t Subject :"+s.subject+"\t Marks : "+s.marks);
		
		
	}
}

class Student{

	String name,subject;
	float marks;
	int rollno;

}