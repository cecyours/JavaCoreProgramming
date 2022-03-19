
import java.util.*;
  
public class P16_Str2Chars {
  
    public static void main(String args[])
    {
        String str = "Programming";
   
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
   

   		for(int i=0;i<str.length();i++)
   		{
   			for(int j=i+1;j<str.length();j++)
   			{
   				if(ch[i]>ch[j])
   				{
   					char temp = ch[j];
   					ch[j]=ch[i];
   					ch[i] = temp;
   				}
   			}
   		}

   		 // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
    }
}