package midterm;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];
		intArray=new int[5];
		int max=0;
		System.out.println("����� �Է��ϼ���.");
		for(int i=0;i<5;i++) {
			intArray[i]=scanner.nextInt();
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.print("����ū���� " +max+"�Դϴ�.");
		
		scanner.close();
	}
}