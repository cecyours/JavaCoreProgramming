import java.util.*;
class CH03_P06_WhileLoop{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

 		int num;

 		System.out.print("Enter num : ");
 		num = sc.nextInt();

 		
 		while(num>0)
 		{
 			if(num%2==0)
 				System.out.println("NUmber : "+num);
 			num--;
 		}

	}
}