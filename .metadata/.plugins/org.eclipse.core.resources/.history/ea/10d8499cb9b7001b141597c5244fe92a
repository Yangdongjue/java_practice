package zoom0518;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferPractice {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bout = new BufferedOutputStream(System.out,50);
		File f = new File("C:\\temp\\sample.txt");
		FileReader fin = new FileReader(f);
		int c;
		while ((c=fin.read())!=-1) {
			bout.write(c);
		}
		fin.close();
		bout.close();	
	}
}
