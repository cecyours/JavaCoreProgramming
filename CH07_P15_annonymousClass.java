
public class CH07_P15_annonymousClass{
	public static void main(String[] args) {
		
		Student s = new Student(){

			void display()
			{
				System.out.print("Hello There....");
			}

			int sum(int x,int y)
			{
				return x+y;
			}
		};
		
		s.display();
		int me = s.sum(10,4);
		System.out.println(me);
	}

}

abstract class Student{
	abstract void display();
	abstract int sum(int d,int i);
}
