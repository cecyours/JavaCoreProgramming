
class CH07_P08_valuesPassMethod{
	public static void main(String[] args) {
		
		Employee jay = new Employee();
		IncrementSalary.increment(jay.salary);

		System.out.println("New Salary : "+jay.salary+"-------------------------");
	}
}

class Employee{
	float salary = 30000.0f; 
}
class IncrementSalary{

	static void increment(float x)
	{
		x = x+10000;

		System.out.println("new Salary : "+x);
	}
}