import java.util.Scanner;
public class Practicee6_8{
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");
		//��ĳ�� ����
		Scanner scanner = new Scanner(System.in);
		//���ڿ� �Է�
		String inputString = scanner.nextLine();
		//���ڿ� ���̸�ŭ �ݺ�.
		for(int i=0;i<inputString.length();i++) {			
			//ù ���� �߶� ����.
			String first=inputString.substring(0,1);
			//ù���ڸ� �ڸ� ���ڿ� �ڿ� ù ���� �̾���̱�
			inputString=inputString.substring(1)+first;
			//���
			System.out.println(inputString);
		}
		scanner.close();
	}
}
