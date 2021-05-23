package zoom0518;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Buffer1 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			Scanner scanner = new Scanner(fin);
			
			int k=1;
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.print(k);
				k++;
				System.out.println(": "+line);
			}
			fin.close();
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
