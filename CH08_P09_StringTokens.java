
class Home{
	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("Hello World Im Home"," ");

		while(s.hasMoreTokens){
			System.out.println("Token : "+s.nextToken());
		}
	}
}