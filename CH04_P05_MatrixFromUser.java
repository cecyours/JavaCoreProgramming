/**
 * Compile time
 * */
import java.util.*;
class CH04_P05_Matrix{
	public static void main(String[] args) {
		
	 	Scanner sc = new Scanner(System.in);
	 	int n,m,i,j;

	 	System.out.print("Enter no of rows : ");
	 	n = sc.nextInt();

	 	System.out.print("Enter no of columns : ");
	 	m = sc.nextInt();
	 	
	 	int a[][] = new int[n][m];

	 	System.out.println("Enter Matrix : ");
	 	for(i=0;i<n;i++)
	 	{
	 		for(j=0;j<m;j++)
	 		{
	 			System.out.print("Enter data : ");
	 			a[i][j] = sc.nextInt();
	 		}
	 	}

	 	System.out.println("- -- -- -- - -- - ----");

	 	for(i=0;i<n;i++)
	 	{
	 		for(j=0;j<m;j++)
	 		{
	 			System.out.print(" "+a[i][j]);
	 		}
	 		System.out.println();
	 	}
	}
}