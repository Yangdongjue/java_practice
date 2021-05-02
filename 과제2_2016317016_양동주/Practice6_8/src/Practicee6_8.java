import java.util.Scanner;
public class Practicee6_8{
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요.");
		//스캐너 선언
		Scanner scanner = new Scanner(System.in);
		//문자열 입력
		String inputString = scanner.nextLine();
		//문자열 길이만큼 반복.
		for(int i=0;i<inputString.length();i++) {			
			//첫 글자 잘라 저장.
			String first=inputString.substring(0,1);
			//첫글자를 자른 문자열 뒤에 첫 글자 이어붙이기
			inputString=inputString.substring(1)+first;
			//출력
			System.out.println(inputString);
		}
		scanner.close();
	}
}
