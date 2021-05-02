package midterm;
import java.util.Scanner;
public class Zoom8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Á¤¼öÀÔ·Â");
		int input = scanner.nextInt();
		int first = input/10;
		int second = input%10;
		
		if((first==3||first==6||first==9)&&(second==3||second==6||second==9)) {
			System.out.println("¹Ú¼ö Â¦Â¦");
		}
		else if ((first==3||first==6||first==9)||(second==3||second==6||second==9))
			System.out.println("¹Ú¼ö Â¦");
		
		scanner.close();
	}
}
