package zoom0504;
import java.util.Scanner;
import java.util.ArrayList;
public class zoom1 {
	public static void main(String[] args) {
		ArrayList<String> score = new ArrayList<>(6);
		Scanner scanner = new Scanner(System.in);
		float scoreSum=0;
		String input =null;
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		for(int i =0; i<6;i++) {
			input=scanner.next();
			score.add(input);
			
			switch (input){
				case "A" : scoreSum +=4.0;
					break;
				case "B" : scoreSum +=3.0;
					break;
				case "C" : scoreSum += 2.0;
					break;
				case "D" : scoreSum += 1.0;
					break;
				case "F" : scoreSum += 0;
					break;
			}
		}
		System.out.println(scoreSum/6);
		scanner.close();
	}
}
