 import java.util.*;
 class CH03_P01_ifStatement{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int day;

 		System.out.print("Enter str : ");
 		day = sc.nextInt();
 	
 		if(day==1)
 			System.out.println("MOnday...");

 		else if(day==2)
 			System.out.println("Tuesday...");

 		else if(day==3)
 			System.out.println("Wednesday...");

 		else if(day==4)
 			System.out.println("Thurday...");

 		else if(day==5)
 			System.out.println("Fri...");

 		else if(day==6)
 			System.out.println("Sat...");

 		else if(day==7)
 			System.out.println("Sunday...");

 		else
 			System.out.println("In valid,else ");

 	}
 }