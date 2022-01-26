
class CH07_P11_Recursion{
	public static void main(String[] args) {
		Number n = new Number();
		n.display();
	}	
}
class Number{
	int i=0;
	void display()
	{
		i++;
		System.out.println("Hello World"+i);
		display();
	}
}