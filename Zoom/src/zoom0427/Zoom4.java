package zoom0427;
import java.util.Scanner;
public class Zoom4 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		for(int i=0;i<inputString.length();i++) {			
			String first=inputString.substring(0,1);
			inputString=inputString.substring(1)+first;
			System.out.println(inputString);
		}
		scanner.close();
	}
}
