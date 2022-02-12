
class CH10_P04_Clone{
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Rohit");

		Student s2 = (Student)s1.clone();

		System.out.println("Name : "+s1.name);
		System.out.println("Name : "+s2.name);

	}
}
class Student
{
	String name;
	public Student(String name)
	{
		this.name = name;
	}
	protected Object clone()throws CloneNotSupportedException
	{
		return this;
	}
}