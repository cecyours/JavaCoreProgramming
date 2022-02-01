class CH08_P01_Inheritance{
	public static void main(String[] args) {
		
		B objB = new B();
		objB.display();

		A objA = new A();
		objA.display();
	}
}
// A -> B : single
// A -> B -> C : mulilevel
class A{

	void display()
	{
		System.out.println("Hello There.."+this);
	}
}

class B extends A{

}