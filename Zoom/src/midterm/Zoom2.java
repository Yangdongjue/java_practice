package midterm;
import java.util.Scanner;
public class Zoom2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int inputNum = scanner.nextInt();
			
			if(inputNum>=10&&inputNum<=99) {
				int first= inputNum/10;
				int second = inputNum%10;
				if(first!=second) {
					System.out.println("NO! 자리 수들이 안맞네용");
					break;
				}
			}
		}
		scanner.close();
	}
}
