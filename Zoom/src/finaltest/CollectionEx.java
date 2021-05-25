package finaltest;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
public class CollectionEx {
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator="->";
			else
				separator="\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		ls.add("양동주");
		ls.add("홍길동");
		ls.add("정현우");
		
		Collections.sort(ls);
		printList(ls);
		
		Collections.reverse(ls);
		printList(ls);
		
		int index = Collections.binarySearch(ls, "정현우");
		System.out.println(index);
	}
}
