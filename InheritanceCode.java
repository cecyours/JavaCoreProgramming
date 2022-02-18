

public class  InheritanceCode{
	public static void main(String[] args) {
		C c = new C();
		D d = new D();

		c.display();
		d.display();
	}
}
class A{

String nameA = "class A";
}
class B extends A{
	String nameB = "class B";
}
class C extends B{
	void display()
	{
		System.out.println("Hello i'm C: with "+nameA+"\t"+nameB);
	}
}

class D extends B{
	void display()
	{
		System.out.println("Hello i'm D: with "+nameA+"\t"+nameB);
	}
}