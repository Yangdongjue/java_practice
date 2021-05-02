package zoom0413;

class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	String color;
	public ColorPoint() {
		super(0,0);
		this.color="Black";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color="Black";
	}
	void setXY(int x, int y) {
		super.move(x,y);
	}
	void setColor(String colorInput) {
		color=colorInput;
	}
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}
public class Test {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
