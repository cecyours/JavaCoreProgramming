
class CH02_P18_typeCast{
	public static void main(String[] args) {
		
		// small to large : 

		float f = 63f;
		double d = f; // no external requirement.

		System.out.println("Double : "+d+"\t float "+f);

		//large to small -> without error...

		double price = 27.38;
		int code = (int)price; 
		System.out.println("int : "+code+"\t double "+price);


	}
}