package finaltest;
import java.util.Vector;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<>();
		vt.add(5);
		vt.add(4);
		vt.add(-1);
		
		vt.add(2,1);
		System.out.println(vt.size());
		System.out.println(vt.capacity());
		
		for(int i = 0 ; i < vt.size();i++) {
			System.out.println(vt.get(i));
		}
	}
}
