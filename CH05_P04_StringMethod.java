class CH05_P04_StringMethod{
	
	public static void main(String ad[])
	{
		String s = "Hello";
		String x;
		System.out.println("Length : "+s.length());
		
		x = s.concat("---");
		System.out.println("concat : "+x);
		
		System.out.println("charAt() : "+s.charAt(0));
		
		int i = s.compareTo("hello");
		System.out.println("compareTo() : "+i);
		
		i = s.compareToIgnoreCase("hello");
		System.out.println("compareTo() : "+i);
		
		System.out.println("equalsIgnoreCase() : "+(s.equalsIgnoreCase("df")));

		boolean f = s.startsWith("He");
		System.out.println("startsWith ; "+f);
			
		f = s.endsWith("He");
		System.out.println("startsWith ; "+f);		
	}
}

/**

 boolean f = s1.equals(s2)
*/
