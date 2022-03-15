
import java.util.*;
class P06_pattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i,j;

		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(" *");
			}
			System.out.println("\n");
		}

	}
}