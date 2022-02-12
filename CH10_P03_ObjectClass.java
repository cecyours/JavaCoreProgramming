
class CH10_P03_ObjectClass{
	public static void main(String[] args) {
		
		int a=10,b=32;

		Code c = new Code();

		boolean f = c.status("Coder","Coder");
		System.out.println("Hello "+f);


		f = c.status(12,12);
		System.out.println("Hello "+f);
	
		Object c1 = a;
		Object c2 = b;

		String me = c1.toString()+c2.toString();
		System.out.println("Hello : "+me+"\t class : "+me.getClass()+"\t hashCode : "+me.hashCode());
	
		// -------------- Class & getClass
		Class hell = me.getClass();
		System.out.println("hell class : "+hell.getName());
	}
}

class Code{

	boolean status(Object a1,Object a2)
	{
		return a1.equals(a2);
	}
}