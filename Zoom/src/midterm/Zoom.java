package midterm;
import java.util.Scanner;

public class Zoom {
	public static void main(String[] args) {
		final int rate = 1300;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		int inputWon = scanner.nextInt();
		
		System.out.println(inputWon+"���� "+"$"+inputWon/rate+"�Դϴ�.");
		scanner.close();
	}
}
