import java.util.Scanner;

public class Practice14 {
	static String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
	static int score [] = {95, 88, 76, 62, 55};
	
	static int outputScore(String str) {
		int num=0;
		for(int i =0 ; i<course.length; i++) {
			if(str.equals(course[i])) {
				num=i;
				break;
			}
			else if (str.equals("그만")) {
				num=-1;
				break;
			}
			else
				num=-2;
		}
		return num;
	}
	public static void main(String[] args) {
		while(true) {		
			System.out.printf("과목이름>>");
			Scanner inputCourse = new Scanner(System.in);
			String courseName=inputCourse.nextLine();
			int scoreIndex=outputScore(courseName);
			
			if(scoreIndex>=0) {
				System.out.printf("%s의 점수는 %d\n",courseName, score[scoreIndex]);
				continue;
			}
			else if (scoreIndex==-2) {
				System.out.println("없는 과목입니다.");
				continue;
			}
			else if(scoreIndex==-1) {
				break;
			}
			inputCourse.close();
		}
		
	}
	
}
