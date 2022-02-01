class CH08_P04_Hierachicalheritance{
	public static void main(String[] args) {
		Programming p = new Programming();
		p.runCode("Python");

		Scripting s = new Scripting();
		s.runCode("JavaScript");
	}
}
// A -> B
// A -> C
class ComputerLanguages{

	void runCode(String name)
	{
		System.out.println(this+"\tMy Code is Running "+name);
	}
}
class Programming extends ComputerLanguages
{

}
class Scripting extends ComputerLanguages{

}