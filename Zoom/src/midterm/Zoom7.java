package midterm;
import java.util.Scanner;
public class Zoom7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int max; int min; int mid;
		if(n1-n2>0 && n1-n3>0) {
			max=n1;
			if(n2>n3) {
				mid=n2;
			}
			else
				mid=n3;
		}
		else if (n2-n1>0 && n2-n3>0) {
			max=n2;
			if(n1>n3)
				mid=n1;
			else
				mid=n2;
		}
		else {
			max=n3;
			if(n1>n2) {
				mid=n1;
			}
			else
				mid=n2;
		}
		System.out.println(mid);
	}
}
