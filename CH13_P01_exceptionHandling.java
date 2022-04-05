
/**
	1. syntax  -> Error
	2. logical -> handle -> ExceptionHandling
*/
public class CH13_P01_exceptionHandling {
	public static void main(String[] args)  {
		
		//

		String s = "3x10";

		try
		{
			int i = Integer.parseInt(s);
			System.out.println("value : "+i);
		}
		catch (Exception e) 
		{
			System.out.println("There is an error. sorry \u2675 "+e);
		}

		System.out.println("Hello World...");
	}
}