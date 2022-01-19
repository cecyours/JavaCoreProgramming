
class CH06_P02_StudentClass{
	public static void main(String[] args) {
		
		Student s1 = new Student("Jay",23,76.6f); 
		
		}
}
class Student{

	String name;
	int rollno;
	float marks;

	public Student()
	{
 			System.out.println("Hello World..."+this);
	}

	public Student(String name, int rollno, float marks)
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		
		System.out.println("Data covered 1...");
		display();
		System.out.println("Data covered 2...");

	}	 

	 void display()
	 {
	 	System.out.println("  name : "+name);
	 	System.out.println("rollno : "+rollno);
	 	System.out.println(" marks : "+marks);
	 	if(marks > 33)
	 	{
			System.out.println("pass");
	 	}
	 	else
			System.out.println("Better luck next TIME..");

	 }
}