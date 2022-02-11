
class CH08_P06_this_superKeyword {
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
	}
}
class A{
	String name = "HOme";
	void display()
	{
		System.out.println("Coder ... "+this+"\t Super : "+this.name);

	}
}
class B extends A{
	String name = "Town";
	void display()
	{

		System.out.println("I'm a "+name);
		System.out.println("I'm a "+this.name);
		System.out.println("I'm a "+super.name);
		super.display();
	}
}