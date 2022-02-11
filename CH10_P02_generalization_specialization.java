
class CH10_P02_generalization_specialization{
	public static void main(String[] args) {
		

		Professor f = (Professor) new Student();
		f.display1();
		///
		// Professor -> Student

		Professor p;
		p = (Professor) new Student();

		Student s = (Student)p;
		s.display2();
	}
}

class Professor{

	void display1()
	{
		System.out.println("Teaching "+this);
	}
}
class Student extends Professor{
	void display2()
	{
		System.out.println("Studing "+this);
	}
}