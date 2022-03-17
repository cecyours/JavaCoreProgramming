
class Task_interfaces{
	public static void main(String[] args) {
	
		D d = new D(10,5);	
	
		d.add();
		d.sub();
		d.div();
	}
}

interface A{
	public void add();
}

interface B extends A{
	public void sub();
}
interface C extends A{
	public void div();
}
class D implements B,C{
	int a,b,c;

	public D()
	{
		a= 1;
		b = 1;
	}
	public D(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		c = a+b;
		System.out.println(a+" + "+b+" = "+c);
	}
	public void sub()
	{
		c = a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
	public void div()
	{
		c = a/b;
		System.out.println(a+" / "+b+" = "+c);
	}

}