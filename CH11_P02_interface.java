
class HOme{
	public static void main(String[] args) {

		B b = new B();

		b.display(10,220);
	}
}

// class -> extends  : body part
// interface -> implements : no body part (abstract)

// A -> B

// interface = public + abstract method
interface A{
	public void display(int a, int b);
}

class B implements A{

	public void display(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
}
