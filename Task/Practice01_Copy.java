
import java.io.*;

class Practice01_Copy{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter fileName : ");
		String file1 = br.readLine();

		FileReader f1 = new FileReader(file1);
		FileWriter f2 = new FileWriter("output.md");
		int ch;
		while((ch=f1.read())!=-1)
		{
				System.out.print((char)ch);
				f2.write((char)ch);

		}
		f2.close();
		f1.close();
	}
}