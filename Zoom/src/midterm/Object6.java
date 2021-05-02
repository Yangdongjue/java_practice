package midterm;
import java.util.Scanner;
public class Object6 {
	public static void printCharArray(char[] charArr) {
		for (char c : charArr) {
			System.out.print(c);
		}
	}
	public static char[] replaceSpace(char[] charArr) {
		for(int i =0; i<charArr.length;i++) {
			if (charArr[i]==' ') {
				charArr[i]=',';
			}
		}
		return charArr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] charArr = new char[5];
		String string = scanner.nextLine();
		for (int i=0; i<charArr.length;i++) {
			charArr[i]=string.charAt(i);
		}
		charArr=replaceSpace(charArr);
		printCharArray(charArr);
		scanner.close();
	}
}
