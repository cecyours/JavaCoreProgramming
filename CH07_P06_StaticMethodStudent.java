class CH07_P06_StaticMethodStudent{
	public static void main(String[] args) {
	
		Student riya = new Student("Riya");
		Student jay = new Student("jay");
		Student gk = new Student("Gk");

		jay.display();	
		gk.display();
		riya.display();

		new Student("Hell");
		
		System.out.println("There are total "+Student.i+" Student/Students");
	}
}
class Student{
	static int i=0;
	int rollno;
	String name;

	public Student(String name)
	{
		this.name = name;
		i++;
		this.rollno = i;
	}

	void display()
	{
		System.out.println("Hello, "+name+" rollno : "+this.rollno);
	}
}