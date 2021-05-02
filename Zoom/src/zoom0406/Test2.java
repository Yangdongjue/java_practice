package zoom0406;
class Rectangle {
	private int x, y, width, height; 
	
	// 필드를 초기화하는 생성자 정의
	public Rectangle(int x1, int y1, int w1, int h1) {
		this.x=x1;
		this.y=y1;
		this.width=w1;
		this.height=h1;
	}
	public void show() { // 사각형의 좌표와 넓이를 화면에 출력하는 메소드 완성
		System.out.printf("(%d, %d)에서 크기가 %dX%d인 사각형\n", this.x, this.y, this.width, this.height);
	}
	
	public int square() { //사각형 넓이 리턴하는 메소드 완성
		return this.width*this.height;
	}
	
	public boolean contains(Rectangle r) { 
		// 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
		if(this.x < r.x && this.y < r.y 
			&& this.x+this.width > r.x+r.width
			&& this.y+this.height > r.y+r.height)
			 return true;
		else 
			return false;
	}
}

public class Test2 {
	public static void main(String [] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) 
			System.out.println("t는 r을 포함합니다.");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다.");
	}
}