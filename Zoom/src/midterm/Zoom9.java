package midterm;
import java.util.Scanner;
public class Zoom9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInt= scanner.nextInt();
		String secondChar = scanner.next();
		int lastInt = scanner.nextInt();
		
		switch (secondChar) {
		case "+":
			System.out.println(firstInt+lastInt);
			break;
		case "-":
			System.out.println(firstInt-lastInt);
			break;
		default:
			break;
		}
		scanner.close();
	}
}
