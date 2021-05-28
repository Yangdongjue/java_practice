package finaltest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputOutput2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream input;
		input = new FileInputStream("C:\\Users\\YANG\\Desktop\\hey2.txt");
		
		InputStreamReader reader = null;
		
		try {
			
			reader = new InputStreamReader(input, "MS925");
			int c;
			while ((c=reader.read())!=-1) {
				System.out.print((char)c);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
