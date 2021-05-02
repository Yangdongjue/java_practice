package zoom0406;
import java.util.Scanner;

class Grade {
	// 필드 선언
	int math, science, english;
	// 필드 값을 초기화하는 생성자 정의
	public Grade(int m, int s, int e) {
		this.math=m;
		this.science=s;
		this.english=e;
	}
	public int average() {// 메소드 완성
		return (this.english+this.math+this.science)/3;
	}	
}
public class Test {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴
		scanner.close();
	}
}