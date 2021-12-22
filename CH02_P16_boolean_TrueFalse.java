import java.util.*;
class CH02_P16_boolean_TrueFalse{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		Code c = new Code();

		// System.out.println("Code f : "+c.f);

		System.out.print("Enter boolean value : ");
		String data = sc.nextLine();
		c.f = Boolean.parseBoolean(data);
		System.out.println("Code f : "+c.f);

		 

	}
}	

class Code{
		boolean f;

}