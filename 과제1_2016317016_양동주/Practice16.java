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
			System.out.println("aiChoosing �޼ҵ� ����!");
		return returnValue;
	}
	
	static int userChoosing(String str) {
		int userSelection = -1;
		if(str.equals("����")) {
			userSelection=0;
		}
		else if(str.equals("��"))
			userSelection=5;
		else if(str.equals("����"))
			userSelection=2;
		else if(str.equals("�׸�"))
			userSelection=-1;
		else
			System.out.println("userChoosing error");
		return userSelection;
	}
	
	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.printf("���� ���� ��!>>");
			Scanner userInput = new Scanner(System.in);
			String userChoose = userInput.nextLine();
			int userChosen = userChoosing(userChoose);
			
			Random random = new Random();
			int aiSelectNum= random.nextInt(3);
			int aiChosen=aiChoosing(aiSelectNum);
			
			if (userChosen==5&&aiChosen==5)
				System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
			else if(userChosen==5&&aiChosen==2)
				System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
			else if(userChosen==5&&aiChosen==0)
				System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
			else if(userChosen==2&&aiChosen==5)
				System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
			else if(userChosen==2&&aiChosen==2)
				System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
			else if(userChosen==2&&aiChosen==0)
				System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
			else if(userChosen==0&&aiChosen==5)
				System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
			else if(userChosen==0&&aiChosen==2)
				System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
			else if(userChosen==0&&aiChosen==0)
				System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
			else if(userChosen == -1) {
				System.out.println("������ �����մϴ�.");
				userInput.close();
				break;
			}
			else
				System.out.println("matching error");
		}
	}
}
