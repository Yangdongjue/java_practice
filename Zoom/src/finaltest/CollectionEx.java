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
		ls.add("�絿��");
		ls.add("ȫ�浿");
		ls.add("������");
		
		Collections.sort(ls);
		printList(ls);
		
		Collections.reverse(ls);
		printList(ls);
		
		int index = Collections.binarySearch(ls, "������");
		System.out.println(index);
	}
}
