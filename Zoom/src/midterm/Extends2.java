package midterm;
class Shape{
	public Shape next;
	public Shape() {next=null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class Extends2 {
	public static void main(String[] args) {
		Shape start, last, obj;
		start= new Line();
		last = start;
		obj=new Rect();
		last.next=obj;
		last=obj;
		obj=new Circle2();
		last.next=obj;
		
		Shape p = start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}
	}
}
