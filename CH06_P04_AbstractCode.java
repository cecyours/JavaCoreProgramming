
class Home{
	public static void main(String[] args) {
		
		B b = new B();
		b.sum(10,30);

	}
}
abstract class A{
	abstract void sum(int a,int b);
}

class B extends A
{
	void sum(int s,int j)
	{
		System.out.println("  	sum is "+(s+j));
	}
}