import java.util.Scanner;
class CH02_P15_turnaryOperator{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// (condition)?exp1:exp2	

		System.out.print("Enter a Number : ");
		int a = sc.nextInt();

		System.out.print("Enter a Number : ");
		int b = sc.nextInt();


		int max = (a>b)?a:b;

		System.out.println("Max is "+max);

	}
}