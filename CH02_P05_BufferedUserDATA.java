

import java.io.*;
public class CH02_P05_BufferedUserDATA{
	public static void main(String[] args)throws IOException {
		Student s = new Student();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter name : ");
		s.name = br.readLine();

		System.out.print("Enter rollno : ");
		s.rollno = Integer.parseInt(br.readLine());

		System.out.print("Enter subject : ");
		s.subject = br.readLine();

		System.out.print("Enter Marks : ");
		s.marks = Float.parseFloat(br.readLine());

		
		System.out.println("name : "+s.name+"\t rollno : "+s.rollno+"\t Subject :"+s.subject+"\t Marks : "+s.marks);


	}
}

class Student{
	String name,subject;
	float marks;
	int rollno;

}