package midterm;
import java.util.Scanner;

public class Zoom {
	public static void main(String[] args) {
		final int rate = 1300;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		int inputWon = scanner.nextInt();
		
		System.out.println(inputWon+"원은 "+"$"+inputWon/rate+"입니다.");
		scanner.close();
	}
}
