
import java.io.*;
class Home{
	public static void main(String[] args) {
			
		int a=7,b=2,c;

		/** bitwise AND &
			   8 4 2 1
			   -------	  	
   		 * 7 : 0 1 1 1
		 * 2 : 0 0 1 0
		 * ------------
		 * & : 0 0 1 0 : 2
 	
 		 * */
		c = a&b;
		System.out.println(a+" & "+b+" = "+c);

		/** bitwise OR |
			   8 4 2 1
			   -------	  	
   		 * 7 : 0 1 1 1
		 * 2 : 0 0 1 0
		 * ------------
		 * | : 0 1 1 1 : 7
 	
 		 * */
		c = a|b;
		System.out.println(a+" | "+b+" = "+c);

		/** bitwise EX ^
			   8 4 2 1
			   -------	  	
   		 * 7 : 0 1 1 1
		 * 2 : 0 0 1 0
		 * ------------
		 * ^ : 0 1 0 1 : 5
 	
 		 * */
		c = a^b;
		System.out.println(a+" ^ "+b+" = "+c);

		/** bitwise left <<
		 *
		 *  c = a*b^2
		 *    = 7*2^2
		 *    = 7*4
		 *    = 28
 		 * */
		c = a<<b;
		System.out.println(a+" << "+b+" = "+c);

		/** bitwise right >>
		 *
		 *  c = a/b^2
		 *    = 7/2^2
		 *    = 7/4
		 *    = 1.~
 		 * */
		c = a>>b;
		System.out.println(a+" >> "+b+" = "+c);

		/**
		 *  negation ~
		 *  c =~a
		 *    = -(a+1)
		 *    = -8
		 * 
		 * */
		c = ~a;
		System.out.println(" ~"+a+" = "+c);
	}
}