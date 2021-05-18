package zoom0518;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Buffer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File file1 = new File(scanner.next());
		File file2 = new File(scanner.next());
		File file3 = new File("appended.txt");
		int c;
		try {
			FileReader fr2 = new FileReader(file2);
			FileReader fr1 = new FileReader(file1);
			FileWriter fw = new FileWriter(file3);
			while((c=fr1.read())!=-1) {
				fw.write((char)c);
			}
			while((c=fr2.read())!=-1) {
				fw.write((char)c);
			}
			
			fr1.close();
			fr2.close();
			fw.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일복사오류");
		}
		scanner.close();
	}
}
