import java.io.*;
class CH07_P12_RecursionDisplayNumbers {
	public static void main(String[] args)throws Exception {
		
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number : ");
		n = Integer.parseInt(br.readLine());

		Number me = new Number();
		me.display(n);
	}
}
class Number{

	void display(int n)
	{
		if(n<0)
		{
			System.out.println("----------");
			return;
		}
		System.out.println("number  : "+n);

			display(n-2);
		
		System.out.println("number  | "+n);

	}
}