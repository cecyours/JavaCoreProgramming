
class Home{
	public static void main(String[] args) {
		
		// a = 10
		// 10
	
	Cons s = new Cons(10+"Hell"); // #1
	Cons d = new Cons(10,"Hell"+"_"+"Code");		

		}
}
class Cons{
	
	public Cons()
	{
		System.out.println("Hello World #0 "+this);
	}

	public Cons(String s)
	{
		System.out.println("Hello World #1 : "+s);
	}

	public Cons(int i)
	{
		System.out.println("Hello World #2 : "+i);
	}

	public Cons(int a,String name)
	{
		System.out.println(a+" Hello World #3 : "+name);
	}

}