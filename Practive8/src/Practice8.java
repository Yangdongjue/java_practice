import java.util.Scanner;
import java.util.Random;

public class Practice8 {
	static int[] arrayStatement(int num) {
		int array[] = new int[num];
		return array;
	}
	
	static int arrayRandomGet(int[] array) {
		Random random = new Random();
		int num = random.nextInt(100)+1;
		for (int i=0;i<array.length; i++) {
			if (array[i]==num) {
				num=arrayRandomGet(array);
			}
			else
				continue;
		}
		return num;
	}
	
	static void arrayInput(int[] array, int num) {
		for(int i=0; i<array.length;i++) {
			if(array[i]==0) {
				array[i]=num;
				break;
			}
		}
	}
	
	static void arrayPrint(int[] array) {
		for (int i=0; i<array.length;i++) {
			System.out.printf("%d ", array[i]);
		}
	}
	
	public static void main(String[] args ) {
		Scanner inputNum = new Scanner(System.in);
		System.out.printf("정수가 몇개? : ");
		int[] array=arrayStatement(inputNum.nextInt());
		for(int i =0; i<array.length;i++) {
			int num =arrayRandomGet(array);
			arrayInput(array, num);
		}
		arrayPrint(array);
		inputNum.close();
	}
}
