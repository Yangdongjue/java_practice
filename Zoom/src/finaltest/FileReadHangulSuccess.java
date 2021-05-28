package finaltest;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader reader = null;
		FileInputStream stream = null;
		
		try {
			stream=new FileInputStream("C:\\Users\\YANG\\Desktop\\hangul.txt");
			reader=new InputStreamReader(stream, "UTF-8");
			int c;
			while((c=reader.read())!=-1) {
				System.out.print((char)c);
			}
			reader.close();
			stream.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
