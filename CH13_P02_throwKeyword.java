
import java.util.*;
class CH13_P02_throwKeyword {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter number : ");
		int n = sc.nextInt();

		try{

			if(n<0)
			{
				throw new Exception("My -ve");
			}
			System.out.println("hell of Code "+n);
		}
		catch (Exception e)
		{

			System.out.println("msg : "+e);
		}
	}
}
