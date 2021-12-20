
class CH02_P14_increment_decrement{
	public static void main(String[] args) {
		
		int i=10;

			System.out.println("during post increment : "+(i++)); //10
			System.out.println(" after post increment : "+(i));//11


			System.out.println("during pre increment : "+(++i)); //12
			System.out.println(" after pre increment : "+(i));//12

				System.out.println("------------------");

			System.out.println("during post decrement : "+(i--)); //12
			System.out.println(" after post decrement : "+(i));//11

			 System.out.println("during pre decrement : "+(--i)); //10
			 System.out.println(" after pre decrement : "+(i));//10
			
	}
}