import java.io.*;
class Home{
	
	public static void main(String[] args)throws IOException {
		int a,b;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("Enter b : ");
		b = Integer.parseInt(br.readLine());

		System.out.println(a+" > "+b+" = "+(a>b));
		System.out.println(a+" < "+b+" = "+(a<b));
		System.out.println(a+" >= "+b+" = "+(a>=b));
		System.out.println(a+" <= "+b+" = "+(a<=b));
		System.out.println(a+" != "+b+" = "+(a!=b));
		System.out.println(a+" == "+b+" = "+(a==b));

	}
}
