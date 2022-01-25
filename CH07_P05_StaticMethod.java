class CH07_P05_StaticMethod{
	public static void main(String[] args) {
		Code c = new Code();
		c.display(); // way 1: object.method(args...)
		Code.display(); // way 2: class.method(args...);
	}
}
class Code{

	static String name = "jay";
	static void display()
	{
		System.out.println("welcome "+name);
	}
}