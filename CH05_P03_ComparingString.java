import java.util.*;
class CH05_P03_ComparingString{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter str1 : ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter str2 : ");
		String str2 = sc.nextLine();
		
		/**
			str1 : abc
			str2 : ada
		*/
		System.out.println(str1+" == "+str2+" : "+(str1==str2));
		System.out.println(str1+" != "+str2+" : "+(str1!=str2));
			
	}
}
/**	str a = "sd"
	str b = "ds"

*/
