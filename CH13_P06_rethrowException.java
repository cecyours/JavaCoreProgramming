
class CH13_P06_rethrowException{
	public static void main(String[] args) throws Throwable {
		
		
		try
		{

			User.display();
		}
		catch(Exception e)
		{
				System.out.println("Coder "+e);	
		}
	}
}
class User{

	static void display() throws Throwable
		{
			try
			{
				throw new Exception("try 1");
			}
			catch (Exception e) {
				
				System.out.println("Coder "+e);	
				throw new Exception("try 2");
			}
		}

}