package zoom0504;
import java.util.Scanner;
import java.util.Vector;
public class Zoom2 {
	public static void main(String[] args) {
		int input=-1;
		int rainSum=0;
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> rain = new Vector<>();
		
		while(true) {			
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			input = scanner.nextInt();
			if(input==0)
				break;
			
			rain.add(input);
			rainSum+=input;
			for(int i = 0 ; i<rain.size() ; i++) {
				System.out.print(rain.get(i)+" ");
			}
			
			System.out.println();
			System.out.println("���� ��� "+ rainSum/rain.size());
		}
		scanner.close();
	}
}