package zoom0406;
import java.util.Scanner;

class Grade {
	// �ʵ� ����
	int math, science, english;
	// �ʵ� ���� �ʱ�ȭ�ϴ� ������ ����
	public Grade(int m, int s, int e) {
		this.math=m;
		this.science=s;
		this.english=e;
	}
	public int average() {// �޼ҵ� �ϼ�
		return (this.english+this.math+this.science)/3;
	}	
}
public class Test {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average()); // average()�� ����� ����Ͽ� ����
		scanner.close();
	}
}