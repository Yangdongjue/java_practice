package finaltest;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapDIcEx {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("baby", "아기");
		hash.put("car", "차");
		hash.put("dog", "개");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾고싶은 단어는..?");
		while(true) {
			String input = scanner.next();
			if(hash.containsKey(input)) {
				System.out.println(hash.get(input));
			}
			else if(input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("그런거 없습니다.");
			}
		}
		scanner.close();
	}
}
