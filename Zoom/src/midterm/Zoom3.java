package midterm;
import java.util.Scanner;
public class Zoom3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oman, man, chun, back;
		
		System.out.println("�ݾ��� �Է��ϼ��� >>");
		int input = scanner.nextInt();
		oman=input/50000; 
		man=input%50000/10000;
		chun=input%50000%10000/1000;
		back=input%50000%10000%1000/100;
		
		System.out.println("��������"+oman);
		System.out.println("������"+man);
		System.out.println("õ����"+chun);
		System.out.println("���"+back);
		scanner.close();
	}
}
