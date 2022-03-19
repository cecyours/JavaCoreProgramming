

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class P20_FileWithBytes {

    public static void main(String[] args) throws IOException {


    	 Scanner sc = new Scanner(System.in);  
		  System.out.print("Provide file name :");  
		  String sfile = sc.next();  

		  // writting 
		  try(FileOutputStream fileOutputStream = new FileOutputStream(sfile)) {
   			 String fileContent = "This is a sample text.";
			    fileOutputStream.write(fileContent.getBytes());
			} 
			catch (Exception e) {
			    // exception handling
			}

			// reading..
    
			try(FileInputStream fileInputStream = new FileInputStream(sfile)) {
			    int ch = fileInputStream.read();
			    while(ch != -1) {
			        System.out.print((char)ch);
			        ch = fileInputStream.read();
			    }
			} catch (Exception e) {
			    // exception handling
			}
    }
}