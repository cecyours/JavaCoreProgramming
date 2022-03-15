
import java.util.*;
class P05_fibonacci{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int a=-1,b=1,c;

		while(num>0)
		{
			c = a+b;

			System.out.print(" "+c);

			a = b;
			b = c;
			num--;
		}
	}
}