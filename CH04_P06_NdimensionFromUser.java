/**
 * Compile time
 * */
import java.util.*;
class CH04_P05_Matrix{
	public static void main(String[] args) {
		
	 	Scanner sc = new Scanner(System.in);
	 	
	 	int i,j,k,n,m,o;


	 	System.out.print("Enter no of Table : ");
	 	n = sc.nextInt();

	 	System.out.print("Enter no of row : ");
	 	m = sc.nextInt();

	 	System.out.print("Enter no of column : ");
	 	o = sc.nextInt();

	 	int a[][][] = new int[n][m][o];

	 	int counter=0;
	 	for(i=0;i<n;i++)
	 	{
	 		for(j=0;j<m;j++)
	 		{
	 			for(k=0;k<o;k++)
	 			{
	 				a[i][j][k] = ++counter;
	 			}
	 		}
	 	}


	 	for(i=0;i<n;i++)
	 	{
	 		for(j=0;j<m;j++)
	 		{
	 			for(k=0;k<o;k++)
	 			{
	 				System.out.print(" "+a[i][j][k]);
	 			}
	 			System.out.println();
	 		}
	 			System.out.println("- -- - -- -");

	 	}

	 	System.out.println("Msg : "+a[2][1][1]);
	}
}