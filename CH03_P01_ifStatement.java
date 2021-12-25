 import java.util.*;
 class CH03_P01_ifStatement{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		String str;

 		System.out.print("Enter str : ");
 		str = sc.nextLine();

 		boolean f = Boolean.parseBoolean(str);


 		System.out.println("Value : "+f);

 		if(f)
 			System.out.println("Welcome नमस्ते");


 	}
 }