import java.util.*;
class CH05_P06_StringMethod{
	public static void main(String[] args) {
		
		String s = "Hello World";

		String x = s.toLowerCase();
		System.out.println("toLowerCase : "+x);


		x = s.toUpperCase();
		System.out.println("toUpperCase : "+x);

		s = "   Hello World    ";
		x = s.trim();

		System.out.println(" org string : "+s.length()+" |\t"+s);
		System.out.println("trim string : "+x.length()+" |\t"+x);

		s = "1234567890";
		char ch[] = new char[100];
		for(int i=0;i<26;i++)
		{
			ch[i] = (char)(i+(int)'A');
		}
		s.getChars(1,6,ch,2);

		for(char i: ch)
		{
			System.out.print(" "+i);
		}


		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter statement : ");
		s = sc.nextLine();

		String code[] = s.split(" ");

		for(String i : code)
		{
			System.out.println(" "+i);
		}
	}
}