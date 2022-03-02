

class CH11_P04_multipleInheritanceWithInterfaces{
	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.show();
	}
}

//A(class)-> C
// B,D(interface) -> C

class A{
	public void display()
	{
		System.out.println("Class A");
	}
}
interface B{
	public void display();
}
interface D{
	public void show();
}
class C extends A implements B,D{
	// methods >>
	public void show()
	{
		System.out.println("Hello interface...");
	}
}



