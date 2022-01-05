
import java.io.*;

class Code{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size : ");
		int n = Integer.parseInt(br.readLine());

		String name[] =  new String[n];

		System.out.println("Enter list : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter name : ");
			name[i] = br.readLine();
		}

		System.out.println("--------------------");

		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]+"\t"+name[i].length());
		}
	}
}

/***
int a = 10;
0----
int a;
a = 10

*/

/**

names [] = {"Gk","Jay","Asky"}
*/