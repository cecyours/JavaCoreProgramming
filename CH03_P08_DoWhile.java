import java.util.*;
class CH03_P06_WhileLoop{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

 		int n;

 		boolean f = true;
 		System.out.print("Enter num : ");
 		n = sc.nextInt();

 		 do
		 {
		 	
		 	System.out.println("Line "+n);
		 	n--;
		 }while(n>0);		

	}
}