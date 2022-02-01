// parent class, super class
// child class, base class

class CH08_P02_SingleInheritance{
	public static void main(String[] args) {
		B objB = new B();
		objB.display();
	}
}
// A -> B
class A{
	String name = "Class A";
	void display()
	{
		System.out.println("Code : "+name);
	}
}
class B extends A{
	String name = "Jay";
	void display()
	{
		System.out.println("program : "+name);
	}
}