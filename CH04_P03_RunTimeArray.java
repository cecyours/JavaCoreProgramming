
import java.util.*;
class CH04_P03_RunTimeArray{
	public static void main(String[] ar) {
		 
		 Scanner sc = new Scanner(System.in);

		

		 System.out.print("Enter size : ");
		 int n = sc.nextInt();
		 // int i;
		 int a[] = new int[n];

		 System.out.println("Enter array : \n");
		 for(int i=0;i<n;i++)
		 {
		 	System.out.printf("Enter data[ %d ] : ",i);
		 	a[i] = sc.nextInt();
		 }

		 for(int i:a)
		 {
		 		if(i>0)
		 			System.out.println("+ve : "+i);
		 }

		 System.out.print(" [ ");
		  for(int i:a)
		 {
		 		if(i<=0)
		 			System.out.print(" "+i);
		 }
		 System.out.print(" ] ");


	}	
}