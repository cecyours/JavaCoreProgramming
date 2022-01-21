
class Home{
	public static void main(String[] args) {
		
		B b = new B();
		b.sum(10,30);
 	
 		// System.out.println("new code : "+new A().x);
	}
}
 class A{

 protected int x=10;
 
}

class B extends A
{
	void sum(int s,int j)
	{
		System.out.println(x+"  	sum is "+(s+j));
	}
}
 