import java.util.Random;
import java.util.Scanner;

public class Practice16 {
	static int aiChoosing(int num) {
		int returnValue= 0;
		if (num==0) {
			returnValue=2;
		}
		else if(num==1) {
			returnValue=0;
		}
		else if(num==2) {
			returnValue=5;
		}
		else
			System.out.println("aiChoosing 메소드 오류!");
		return returnValue;
	}
	
	static int userChoosing(String str) {
		int userSelection = -1;
		if(str.equals("바위")) {
			userSelection=0;
		}
		else if(str.equals("보"))
			userSelection=5;
		else if(str.equals("가위"))
			userSelection=2;
		else if(str.equals("그만"))
			userSelection=-1;
		else
			System.out.println("userChoosing error");
		return userSelection;
	}
	
	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.printf("가위 바위 보!>>");
			Scanner userInput = new Scanner(System.in);
			String userChoose = userInput.nextLine();
			int userChosen = userChoosing(userChoose);
			
			Random random = new Random();
			int aiSelectNum= random.nextInt(3);
			int aiChosen=aiChoosing(aiSelectNum);
			
			if (userChosen==5&&aiChosen==5)
				System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
			else if(userChosen==5&&aiChosen==2)
				System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
			else if(userChosen==5&&aiChosen==0)
				System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
			else if(userChosen==2&&aiChosen==5)
				System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
			else if(userChosen==2&&aiChosen==2)
				System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
			else if(userChosen==2&&aiChosen==0)
				System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
			else if(userChosen==0&&aiChosen==5)
				System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
			else if(userChosen==0&&aiChosen==2)
				System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
			else if(userChosen==0&&aiChosen==0)
				System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
			else if(userChosen == -1) {
				System.out.println("게임을 종료합니다.");
				userInput.close();
				break;
			}
			else
				System.out.println("matching error");
		}
	}
}
