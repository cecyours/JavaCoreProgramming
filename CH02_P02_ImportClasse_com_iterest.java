
import java.util.Scanner;
import java.lang.*;
public class CH02_P02_ImportClasse_com_iterest{
	
	public static void main(String[] args) {
		
		int n,p,t;
		float r;
		double A;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter P : ");
		p= sc.nextInt();

		System.out.print("Enter n : ");
		n = sc.nextInt();

		System.out.print("Enter t : ");
		t=sc.nextInt();

		System.out.print("Enter r : ");
		r= sc.nextFloat();


		A = p*Math.pow((1+r/n),n*t);

		System.out.println("Ans : "+A);



	}
}