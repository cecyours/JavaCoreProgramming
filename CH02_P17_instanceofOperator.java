import java.util.*;
class CH02_P17_instanceofOperator{
	public static void main(String[] args) {
			
		Code c = new Code();
		boolean f;
		Scanner sc = new Scanner(System.in);

		 
			f = c instanceof Code;
			System.out.print("Status : "+f);
	 }
}
class Code{

}