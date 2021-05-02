package midterm;
class StaticSample{
	public int n;
	public void g() {
		m=20;
	}
	public static int m;
	public static void f() {
		m=5;
	}
}
public class Static {
	public static void main(String[] args) {
		StaticSample s1;
		s1= new StaticSample();
		s1.n=5;
		s1.g();
		s1.m=50;
		StaticSample s2 = new StaticSample();
		s2.m=10;
	}
}
