
class CH07_P14_statickeyword  {
	

	public static void main(String[] args) {
		System.out.println("Welcome .. .");	


		System.out.println("Data : "+A.i);
			
		A.display();
	
	}
	static{ // static block
		System.out.println("Bye bye...");
	}
}
class A{

	 static int i=0; //static data member
 
	 static void display() // static method
	 {
	 	System.out.println("Hell by Me..");
	 }
}