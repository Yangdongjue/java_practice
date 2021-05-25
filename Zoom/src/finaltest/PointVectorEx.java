package finaltest;
import java.util.Vector;
class Point1{
	int x, y;
	public Point1(int x, int y) {
		this.x=x; this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point1> v = new Vector<>();
		v.add(new Point1(2,2));
		v.add(new Point1(3,2));
		v.add(new Point1(1,1));
		
		for(int i =0; i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
}
