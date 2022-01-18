
class Home{
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("12367890");
		System.out.println("stirng "+s);

		s.append("Hii");
		System.out.println("append : "+s);

		s.insert(3,"--->");
		System.out.println("insert : "+s);

		s.delete(0,5);
		System.out.println("delete : "+s);

		s.reverse();
		System.out.println("reverse : "+s);

		String str = s.toString();
		System.out.println("toString : "+s);

		 s = new StringBuffer("peter, how are you peter..");
		 System.out.println("indexOf : "+s.indexOf("peter"));
		 System.out.println("lastIndexOf : "+s.lastIndexOf("peter"));

		 s.replace(0,5,"Stark");
		 System.out.println("replace : "+s);

	}
}
// class H{
// 	int a;
// 	public H(int a)
// 	{
// 		this.a = a;
// 	}
// }