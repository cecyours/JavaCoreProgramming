class CH06_P09_Polymorphism  {
	public static void main(String[] args) {
		
		Code code = new Code();
		int a=19,b=3,c=10;

		System.out.println("Sum : "+code.sum(a,c));
		System.out.println("Sum : "+code.sum());
		System.out.println("Sum : "+code.sum(a,a,b));

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
}