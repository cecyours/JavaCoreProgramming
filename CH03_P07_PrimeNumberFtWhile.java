import java.util.*;
class CH03_P06_WhileLoop{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

 		int num,n,i=2;

 		boolean f = true;
 		System.out.print("Enter num : ");
 		n = sc.nextInt();

 		
		// num = (int)num/2; 		

 		for(int j = 2; j<=n ; j++)
 		{
 			num = j;
 			i=2;
 			f = true;
		 			while(i<=(int)num/2)
			 		{
			 			if(num%i==0)
			 			{
			 				f = false;
			 				break;
			 			}
			 			i++;
			 		}

		 		if(f)
		 		{
		 			System.out.println("Prime "+num);
		 		}
		 		else
		 		{
		 			// System.out.println("NOnPrime "+num);
		 		}


 		}
	}
}