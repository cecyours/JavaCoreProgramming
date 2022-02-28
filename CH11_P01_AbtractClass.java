
class Home{
	public static void main(String[] args) {
		
		B b = new B();

		b.display("jay..");

		// A a = new A(); // error...
	}
}

// concrete vs abstract
abstract class A{
	abstract void display(String name); // abstract method..
	// abstract void show(); // 
}
class B extends A{
 	// 
 	void display(String name)
 	{
 		System.out.println("Hello There "+name);
 	}
}