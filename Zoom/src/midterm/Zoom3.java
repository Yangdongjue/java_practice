package midterm;
import java.util.Scanner;
public class Zoom3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oman, man, chun, back;
		
		System.out.println("금액을 입력하세요 >>");
		int input = scanner.nextInt();
		oman=input/50000; 
		man=input%50000/10000;
		chun=input%50000%10000/1000;
		back=input%50000%10000%1000/100;
		
		System.out.println("오만원권"+oman);
		System.out.println("만원권"+man);
		System.out.println("천원권"+chun);
		System.out.println("백원"+back);
		scanner.close();
	}
}
