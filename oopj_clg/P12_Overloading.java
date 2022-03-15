

class P12_Overloading{
	public static void main(String[] args) {
	
		Add task = new Add();

		System.out.println("float : "+task.add(3.4f,58.3f));
		System.out.println("String : "+task.add("Jay","vyas"));

		int a[] = {1,2,3,5};
		int b[] = {1,2,3};

		int c[] = task.add(a,b);

		for(int i:c)
		{
			System.out.println(i);
		}

	}
}

class Add{

	public float add(float a,float b)
	{
		return a+b;
	}

	public String add(String str1,String str2)
	{
		return str1+str2;
	}


	public int[]  add(int a[],int b[])
	{
		if(a.length!=b.length)
		{
			int arr[] = {0};
			System.out.println("error, both array should be same size..");
			return arr;
		}

		int c[] = new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i] + b[i];
		}

		return c;
	}



}