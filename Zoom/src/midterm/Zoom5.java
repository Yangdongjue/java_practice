package midterm;
import java.util.Scanner;
public class Zoom5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String in = sc.next();
		
		switch(in) {
		case "����":
			System.out.println(1);
			break;
		case "����":
			System.out.println(2);
			break;
		case "��":
			System.out.println(3);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}
}
