/*
	normal method is instance method,
	which is only called by object of that class.
*/
class CH07_P04_instanceMethod {
	public static void main(String[] args) {
			
			Student s = new Student();
			s.setData("jay");

			System.out.println("welcome "+s.getData());
			 
		}	
}
class Student{
	String name;

	void setData(String name)
	{
		this.name = name;
	}
	String getData()
	{	
			return this.name;
	}	
}