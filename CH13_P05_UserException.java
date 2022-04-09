
import java.util.*;
class CH13_P05_UserException  {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String user="jayV";
			String pass="123";


			System.out.print("Enter userName@password : ");
			String data = sc.nextLine();

			String codes[] = data.split("@");
			String userName = codes[0];
			String userPass = codes[1];


			try
			{

				if(!(user.equals(userName) && pass.equals(userPass)))
				{
						throw new UserNotFoundException("Invalid login...");
				}
				System.out.println("userName : "+userName+"\t "+userPass);
			}
			catch (UserNotFoundException e) {
				System.out.println("error : "+e);
			}


	}
}
class UserNotFoundException extends Exception{

	public UserNotFoundException(String msg)
	{
		super(msg);
	}
}