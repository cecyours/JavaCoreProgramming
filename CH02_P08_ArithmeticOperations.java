import java.io.*;
class Home{
	public static void main(String[] args) throws IOException {
		Operations s = new Operations();
		s.code();	
	}
}

class Operations{

	private int a,b,c;

	public Operations() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("Enter b : ");
		b = Integer.parseInt(br.readLine());

	}
	void code()
	{

		c = a+b;
		System.out.println(a+" + "+b+" = "+c);

		c = a-b;
		System.out.println(a+" - "+b+" = "+c);
		
		c = a*b;
		System.out.println(a+" x "+b+" = "+c);
		
		c = a/b;
		System.out.println(a+" / "+b+" = "+c);
		
		c = a%b;
		System.out.println(a+" % "+b+" = "+c);

	}
}
