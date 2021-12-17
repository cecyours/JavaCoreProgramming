import java.io.*;
class Home{
	public static void main(String[] args) throws IOException {
	 
	 BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	 // Scanner sc = new Scanner(System.in);
	 Code obj = new Code();

	 		System.out.print("Enter x : ");
	 		obj.x = Float.parseFloat(br.readLine());

			
	 		System.out.print("Enter y : ");
	 		obj.y = Float.parseFloat(br.readLine());
	 		

	 		System.out.print("Enter z : ");
	 		obj.z = Float.parseFloat(br.readLine());

	


	 		System.out.print("Enter name : ");
	 		obj.name = br.readLine();

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