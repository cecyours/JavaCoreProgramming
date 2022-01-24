class CH07_P01_methods {
	public static void main(String[] args) {
			
			A obj;
			obj = new A();
			/**
				int a;
				a = 10;
			*/
			obj.display();
			obj.display();
		}	
}

class A{

	 void display() //method
	{
		System.out.println("Hello There "+this);
	}
}
