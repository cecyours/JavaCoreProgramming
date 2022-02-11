
class CH09_P01_Polymorphism{
	public static void main(String[] args) {
		Code me = new Code();

		System.out.println("sum "+me.sum());
		System.out.println("sum "+me.sum(23,34));
		System.out.println("sum "+me.sum(2,3,4));
		System.out.println("sum "+me.sum(23.43f,34.43f));
		System.out.println("sum "+me.sum("Cm","r43"));

	}
}

class Code{

	int sum()
	{
		return 0;
	}

	int sum(int a,int b)
	{
		return a+b;
	}
	int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	float sum(float a,float b)
	{
		return a+b;
	}

	String sum(String a,String b)
	{
		return a+b;
	}
}