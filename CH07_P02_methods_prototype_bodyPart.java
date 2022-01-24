/**
	return methodName(args ...)
	{
		//body
	}

*/
public class CH07_P02_methods_prototype_bodyPart {
	public static void main(String[] args) {
		A obj = new A();
		int me = obj.fact(5);
		System.out.println("factorial is "+me);

		System.out.println("-----------------------------");

		me = obj.fact(4);
		System.out.println("factorial is "+me);
	}
}
class A{

	int f;
	int fact(int n)
	{
		f = 1;
		if(n%2!=0)
		{
			while(n>0)
			{
				System.out.print(n+" x "+f);
				f = f*n;
				System.out.println(" = "+f);
			
				n--;
			}
		return f;

	     }
	   	//-------------->
	   while(n>0)
			{
				System.out.print(n+" x "+f);
				f = f*n;
				System.out.println(" = .."+f);
			
				n-=2;
			}
		return f;

	}

}