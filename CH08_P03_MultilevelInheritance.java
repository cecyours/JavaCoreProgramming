class CH08_P03_MultilevelInheritance{
	public static void main(String[] args) {
		C objC = new C();
		objC.display();
	}
}
// A->B->C
class A{

	void display()
	{
		System.out.println("Hello There..."+this);
	}
}
class B extends A{

}
class C extends B{

}