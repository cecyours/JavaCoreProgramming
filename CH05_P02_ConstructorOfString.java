

class CH05_P02_ConstructorOfString{
	public static void main(String[] args) {
		//Ways to define Constructors / value

		String str1 = "Hello World"; // no Constructor
		String str2 = new String("----Cefs");

		char a[] = {'a','b','c','d','e'};

		String str3 = new String(a);
			System.out.println("Str3 : "+str3);

		String str4 = new String(a,1,2);
			System.out.println("Str4 : "+str4);


		byte x[] = {65,87,22,44,12,1,2,3,4};
		String str5 = new String(x);
			System.out.println("Str5 : "+str5);

	}
}