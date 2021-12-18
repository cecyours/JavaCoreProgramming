import java.io.*;
class Home{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float marks;

		System.out.print("Enter marks : ");
		marks = Float.parseFloat(br.readLine());
		boolean f = true;
		if(marks>100 || marks<0)
		{
			System.out.println("InValid input");
			 f = false;
		}

		if(!f)
		{
			System.out.println("error !!");
			System.exit(0);
		}
		if(marks>=33 && marks<=100)
			System.out.println("Pass");
		else
			System.out.println("Better Luck time. !!");


	}
}
/**
 * 
 * TASK : 
 * take 2 numbers from user
 * if any one of them is between 100-1000 then perform arithmetic otherwise Relations
 * 
 * */