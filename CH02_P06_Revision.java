import java.util.Scanner;

class Home{
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 Code obj = new Code();

	 		System.out.print("Enter x : ");
	 		obj.x = sc.nextFloat();

			System.out.print("Enter y : ");
	 		obj.y = sc.nextFloat();
		
			System.out.print("Enter z : ");
	 		obj.z = sc.nextFloat();
			
	 		System.out.print("Enter Name : ");
	 		obj.name = sc.nextLine();


	 		

	 	obj.avg = (obj.x+obj.y+obj.z)/3;

	 	System.out.println(obj.name+"avg : "+obj.avg);

		 }
}
/*
	properties -> members : variable
		actions: method:function
*/
class Code{
	float x,y,z;
	float avg;
	String name;
}