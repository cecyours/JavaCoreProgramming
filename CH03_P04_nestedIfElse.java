 import java.util.*;
 class CH03_P01_ifStatement{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

 		int a,b,c,max;

 		System.out.print("Enter a : ");
 		a = sc.nextInt();

 		System.out.print("Enter b : ");
 		b = sc.nextInt();

 		System.out.print("Enter c : ");
 		c = sc.nextInt();


 		if(a>b)
 		{
 			if(a>c)
 				max = a;
 			else
 				max = c;
 		}
 		else
 		{
 			if(b>c)
 				max = b;
 			else
 				max = c;
 		}

 		System.out.println("Max : "+max);
 	}	
 }