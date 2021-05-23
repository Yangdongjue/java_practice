package finaltest;

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width=width; this.height=height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r =(Rect) obj;
		if (this.width*this.height == r.width*r.height) {
			return true;
		}
		else return false;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		
		if(a.equals(b))
			System.out.println("a is equals to b");
		if(a.equals(c))
			System.out.println("a is equals to c");
		if(b.equals(c))
			System.out.println("b is equals to c");
	}
}
