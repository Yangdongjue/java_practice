package midterm;

class Test{
	public int i;
	public Test() {
		this(30);
	}
	public Test(int i) {
		return;
	}
	public void set(int i) {
		this.i=i;
	}
}
public class Zoom11 {
	public static void main(String[] args) {
		Test t = new Test();
		t.i=10;
		t.set(20);
	}
}
