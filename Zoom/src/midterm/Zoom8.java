package midterm;
import java.util.Scanner;
public class Zoom8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����Է�");
		int input = scanner.nextInt();
		int first = input/10;
		int second = input%10;
		
		if((first==3||first==6||first==9)&&(second==3||second==6||second==9)) {
			System.out.println("�ڼ� ¦¦");
		}
		else if ((first==3||first==6||first==9)||(second==3||second==6||second==9))
			System.out.println("�ڼ� ¦");
		
		scanner.close();
	}
}
