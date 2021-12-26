
class CH04_P01_CommandLineArray{
	public static void main(String[] ar) {
		
		System.out.println("Hello World");
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum += Integer.parseInt(ar[i]);
			System.out.println(sum+"\tData : "+ar[i]);
		}

		System.out.println("----------------------");

		for(String s : ar)
		{
			System.out.println("---------- Data : "+s);
		}

	}
}