import java.util.*;
class Home{
	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("Hello World Im Home","l");

		while(s.hasMoreTokens()){

			System.out.println("Token : "+s.nextToken());
	
		}
	}
}