package midterm;
abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] b);
}
class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a , int b) {
		return a-b;
	}
	public double average(int[] b) {
		double sum=0;
		for(int i=0; i<b.length;i++) {
			sum+=b[i];
		}
		return sum/b.length;
	}
}
public class Abstract {
	public static void main(String[] args) {
		int a=7;
		int b=3;
		int [] arr= {1,2,4};
		GoodCalc gc = new GoodCalc();
		System.out.println(gc.add(a,b));
		System.out.println(gc.subtract(a,b));
		System.out.println(gc.average(arr));
	}
}
