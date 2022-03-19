

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class P21_CopyFileWithBytes {

    public static void main(String[] args) throws IOException {


  		Scanner sc = new Scanner(System.in);  
		  System.out.print("Provide source file name :");  
		  String sfile = sc.next();  
		  System.out.print("Provide destination file name :");  
		  String dfile = sc.next();  
		 
	        var source = new File(sfile);
	        var dest = new File(dfile);

        try (var fis = new FileInputStream(source);
             var fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {

                fos.write(buffer, 0, length);
            }
        }
    }
}