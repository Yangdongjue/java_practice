package finaltest;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String s1 = new String("ȫ�浿/��ȭ/ȫ��/����/����");
		StringTokenizer st = new StringTokenizer(s1, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
	}
}
