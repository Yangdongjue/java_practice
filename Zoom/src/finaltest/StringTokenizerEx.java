package finaltest;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String s1 = new String("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã");
		StringTokenizer st = new StringTokenizer(s1, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
	}
}
