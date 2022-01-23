class CH06_P08_Inheritance_A_B {
	public static void main(String[] args) {
		
		B b = new B();
		b.show();	
	}
}
// parent -> child
// A -> B
class A{

	void show()
	{
		System.out.println("Hello, I'm class A");
	}
}
class B extends A{

	void show()
	{
		System.out.println("Hello, I'm class B");
	}
}