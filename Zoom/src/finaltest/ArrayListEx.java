package finaltest;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		ar.add(scanner.next());
		ar.add(scanner.next());
		ar.add(scanner.next());
		
		int longDigitIndex=0;
		for (int i =0;i<ar.size();i++) {
			if (ar.get(longDigitIndex).length()<ar.get(i).length()) {
				longDigitIndex=i;
			}
		}
		System.out.println(ar.get(longDigitIndex));
		scanner.close();
	}
}