import java.io.*;
class CH07_P16_RevisionClass {
	public static void main(String[] args) throws Exception {
		int n=5;

		Student s[] = new Student[n];

		int i;
		for(i=0;i<n;i++)
		{
			s[i] = new Student();
			s[i].setData();
		}

		System.out.printf(" %5s | %7s | %7s | %7s | %5s\n","srNo","rollno","Name","marks","Status");
		for(i=0;i<n;i++)
		{
			s[i].display();
		}

	}
}
class Student
{
	int rollno,srNo;
	static int i=0;
	boolean result; // depends upon marks
	String name;
	float marks; 
	BufferedReader br;
	public Student()
	{
		this.srNo = ++i;
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	void setData() throws Exception
	{
		System.out.print("Enter your rollno : ");
		rollno = Integer.parseInt(br.readLine());

		System.out.print("Enter your name : ");
		name = br.readLine();

		System.out.print("Enter marks : ");
		marks = Float.parseFloat(br.readLine());

		if(marks>=33 && marks<=100)
			result = true;
		else
			result = false;
		System.out.println("--------");
	} 
	void display()
	{
		System.out.printf(" %5s + %7s + %7s + %7s + %5s\n","-----","-------","-------","-------","-----");
		System.out.printf(" %5d | %7d | %7s | %7.2f | ",srNo,rollno,name,marks);

		if(result)
			System.out.print("Pass\n");
		else
			System.out.print("Fail\n");

	}
}