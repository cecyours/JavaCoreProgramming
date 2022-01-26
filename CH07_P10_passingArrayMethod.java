import java.io.*;
class CH07_P10_passingArrayMethod  {
	public static void main(String[] args)throws Exception {
		Data me = new Data();

		Reverse.display(me.a);
	}
}
class Data{
	int a[];
	int n;
	int i;
	BufferedReader br;
	public Data() throws Exception
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size : ");
		n = Integer.parseInt(br.readLine());
		
		a = new int[n];

		System.out.println("Enter "+n+" elements : ");
		for(i=0;i<n;i++)
		{
			System.out.print("Enter data for a [ "+i+" ] : ");
			a[i] = Integer.parseInt(br.readLine());
		}

		// code to get array from user
	}
}

class Reverse{

	static void display(int x[])
	{
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println("data -> "+x[i]);
		}
	}
}