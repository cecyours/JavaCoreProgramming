
import java.util.*;
class CH13_P04_throwException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAc user = new BankAc("jay");

		System.out.print("Enter amount : ");
		double withdraw = sc.nextDouble();

		try{

			if(user.balance-withdraw<0)
			{
				throw new Exception("not enough amount : "+withdraw);
			}
			user.balance-= withdraw;
		}
		catch (Exception e) {
			System.out.println("Error : "+e);
		}

		user.printReceipt();


	}
}

class BankAc{

	String userName;
	double balance = 1000;

	public BankAc(String userName)
	{
		this.userName = userName;
	}
	void printReceipt()
	{
		System.out.println("hello "+userName+"\t current balance : "+balance);
	}
}
/**

	user input as num

	try
	{
		if(num%5==0)
		{
			throw new exception('hell of code')
		}
		S.o.p(number is valid)
	}
	catch(exceptton e)
	{
		s.o.p(error+e)
	}

*/