
class CH07_P08_valuesPassMethod{
	public static void main(String[] args) {
		
		Employee jay = new Employee();
		IncrementSalary.increment(jay);

		System.out.println("New Salary : "+jay.salary+"-------------------------");
 
	}
}

class Employee{
	float salary = 30000.0f; 
}
class IncrementSalary{

	static void increment(Employee emp)
	{
		emp.salary = emp.salary+10000;

		System.out.println("new Salary : "+emp.salary);
	}
}