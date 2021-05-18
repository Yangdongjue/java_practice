package finaltest;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		hash.put("�絿��", 90);
		hash.put("������", 80);
		hash.put("������", 70);
		hash.put("�ֺ���", 60);
		
		System.out.println("HashMap�� ��� ���� : "+hash.size());
		
		Set<String> keys = hash.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name= it.next();
			int score = hash.get(name);
			System.out.println(name+" : "+ score);
		}
	}
}
