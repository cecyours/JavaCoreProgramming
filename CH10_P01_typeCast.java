
import java.io.*;
class CH10_P01_typeCast{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//  widening : small -> large
		// int -> float
		int i;
		float f;
		System.out.print("Enter int values : ");
		i = Integer.parseInt(br.readLine());

		f = i; // float <- int

		System.out.println("data : i "+i+"\t f "+f);

		///----------------------------------->
		//  narrowing : large -> small, forcefully
		// flaot -> int

		System.out.print("Enter float value : ");
		f = Float.parseFloat(br.readLine());

		i = (int)f; // int <- float
		System.out.println("data : i "+i+"\t f "+f);


	}
}