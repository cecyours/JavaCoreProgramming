
class CH05_P01_ConstructorOfClass{
	public static void main(String[] args) {
	
	Student a = new Student("Hell");
	new Student();
	new Student(3,7);
	new Student(8);

	// System.out.println("Hello "+a.name);	
	}
}


class Student{
	String name;

	public Student()
	{
		System.out.println("C1 : Hello World....");
	}
	public Student(String m)
	{
		System.out.println("C2 : Welcome "+m);
	}
	public Student(int d)
	{
		System.out.println("Good Jay.....");

	}
	public Student(int a,int b)
	{
		System.out.println("Jay.....");
	}

}