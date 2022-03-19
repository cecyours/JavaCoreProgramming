
class P13_Inheritance{
	public static void main(String[] args) {
		Result r = new Result();
		r.name="Jay";
		r.marks=78.3;
		r.displayResult();

	}
}
class Student{

	String name;
}
class Test extends Student{
	double marks;
}
class Result extends Test{

	void displayResult(){

		if(marks>=33)
		{
			System.out.println(name+" is passed the test with "+marks+".");
		}
		else
		{
			System.out.println(name+" is failed the test with "+marks+".");	
		}
	}
}