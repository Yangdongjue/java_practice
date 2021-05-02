package midterm;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<intArray.length;i++) {
			intArray[i]=scanner.nextInt();
			sum+=intArray[i];
		}
		
		scanner.close();
		System.out.println((double)sum/intArray.length);
	}
}
