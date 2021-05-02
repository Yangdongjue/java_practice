package midterm;
import java.util.Scanner;
public class Zoom6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int input = scanner.nextInt();
			if(input>=10 && input<=99) {
				if(input%11==0) {
					System.out.println("yes~");
				}
			}
			scanner.close();	
		}
	}
}
