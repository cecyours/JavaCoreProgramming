
class CH14_P02_CharacterClass {
	public static void main(String[] args) {
		
		Character c = Character.valueOf('g');	
		System.out.println("c : "+c);


		String s = c.toString();
		System.out.println("string : "+s);

		char ch='*';
		System.out.println("isDigit : "+Character.isDigit(ch));

		ch = 'l';

		if(Character.isLowerCase(ch))
		{
			System.out.println(ch+" is in lowercase : ");
		}
	}
}