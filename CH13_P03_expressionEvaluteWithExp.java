

import java.io.*;
class CH13_P03_expressionEvaluteWithExp {
	public static void main(String[] args) throws Exception {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("Enter a number : ");
		int b = Integer.parseInt(br.readLine());

		int c=0;

		try
		{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("Error + "+e);
		}

		System.out.println("ans : "+c);


		System.out.println("Hello There !! \u3475");
	}
}