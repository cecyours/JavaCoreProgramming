
class CH08_P07_finalKeyword{
	public static void main(String[] args) {
		A a = new A();
		a.display();
	}
}


final class A{
	final float pr = 34.43f;

	final void display()
	{
		// pr = 39.00f; // #error
		System.out.println("pr : "+pr);
	}
}
class B /*extends A error */{

	// void display() # error
	// {
	// 	System.out.println("Coder ----");
	// }
}