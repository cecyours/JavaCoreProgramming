
/**
A.display() -> C
B.display() -> C
*/

class home{
	public static void main(String[] args) {
		C c = new C();

		c.display(); // class A
		c.displayShow(); // interface B
	}
}
class A{
	public void display()
	{
		System.out.println("class A");
	}
}

interface B{
	public void displayShow();
} 

class C extends A implements B{
	// ?	

	public void displayShow()
	{
		System.out.println("interface B");
	}
}






