package midterm;
import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return this.width*this.height;
	}
}
public class Object {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rtg = new Rectangle();
		rtg.width=scanner.nextInt();
		rtg.height=scanner.nextInt();
		System.out.println(rtg.getArea());
		scanner.close();
	}
}
