
class Home{
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display("Gk");
		s.me("Jay");
	}
}

/**
	class = member(variable)+method(function)
*/

class Student{

	void display(String m)
	{
		System.out.println("Hello World..."+m);
	}
	void me(String code)
	{
		display(code);
	}
}