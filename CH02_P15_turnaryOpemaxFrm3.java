import java.util.Scanner;
class CH02_P15_turnaryOperator{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 	

		System.out.print("Enter a Number : ");
		int a = sc.nextInt();

		System.out.print("Enter a Number : ");
		int b = sc.nextInt();

		System.out.print("Enter a Number : ");
		int c = sc.nextInt();
						 //expr1       //expr2
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);

		System.out.println("Max is "+max);

	}
}

