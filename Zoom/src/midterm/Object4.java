package midterm;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public double getWidth() {
		return this.radius*this.radius*3.14;
	}
}
public class Object4 {
	public static void main(String[] args) {
		Circle [] cirArr=new Circle[5];
		for (int i=0;i<cirArr.length;i++) {
			cirArr[i]=new Circle(i);
			System.out.print(cirArr[i].getWidth()+" ");
		}
	}
}
