package finaltest;

import java.io.FileReader;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader ("C:\\Users\\YANG\\Desktop\\hey.txt");
		int c;
		
		while((c=fin.read())!=-1) {
			System.out.print((char)c);
		}
		fin.close();
	}
}
