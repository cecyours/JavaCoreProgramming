import java.util.*;
class CH02_P13_plusMinus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		System.out.print("Enter number : ");
		try
		{
			a = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid...");
		}

		if(a<0)
			a=a*-1;

		System.out.println("Number : "+a);
	}
}