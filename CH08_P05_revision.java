
class CH08_P05_revision{
	public static void main(String[] args) {
		C c = new C();
		c.display();
	}
}

// A -> B -> C
// A,B->C [ x ]
// A->B, A->C
class A{
	void display()
	{
		System.out.println("hello "+this);
	}
}
class B extends A{
	void display()
	{
		System.out.println("Bye "+this);
	}
}
class C extends B{
	void display()
	{
		System.out.println("main "+this);
	}	
}