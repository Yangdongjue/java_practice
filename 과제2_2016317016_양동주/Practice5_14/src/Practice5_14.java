interface Shape {
	final double PI = 3.14;
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();	
	}
}

class Circle implements Shape{
	//필드 선언
	int radius;
	//생성자
	public Circle(int radius) {
		this.radius=radius;
	}
	//메소드 선언
	public void draw() {
		System.out.printf("반지름이 %d인 원입니다.\n",radius);
	}
	public double getArea() {
		 return PI*radius*radius;
	}
}

class Oval implements Shape{
	//필드 선언
	int width; int height;
	//생성자
	public Oval(int width, int height) {
		this.width=width;
		this.height=height;
	}
	//메소드
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.\n", width, height);
	}
	
	public double getArea() {
		return PI*(width/2)*(height/2);
	}
}

class Rect implements Shape{
	//필드
	int width; int height;
	//생성자
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	//메소드
	public void draw() {
		System.out.printf("%dx%d크기의 사각형 입니다.\n", width, height);
	}
	public double getArea() {
		return width*height;
	}
}


public class Practice5_14 {
	public static void main(String[] args) {
		Shape [] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형

		for(int i=0; i<list.length; i++) 
			list[i].redraw();
		for(int i=0; i<list.length; i++) 
			System.out.println("면적은 " + list[i].getArea());
	}
}