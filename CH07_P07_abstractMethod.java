class CH07_P07_abstractMethod {
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
// A -> B
// A.display() -> B.display();
abstract class A{

	abstract void display();
}
class B extends A{
	void display()
	{
			System.out.println("Hell is here ,.."+this);
	}
}
