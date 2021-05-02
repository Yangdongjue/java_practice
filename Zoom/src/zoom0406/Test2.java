package zoom0406;
class Rectangle {
	private int x, y, width, height; 
	
	// �ʵ带 �ʱ�ȭ�ϴ� ������ ����
	public Rectangle(int x1, int y1, int w1, int h1) {
		this.x=x1;
		this.y=y1;
		this.width=w1;
		this.height=h1;
	}
	public void show() { // �簢���� ��ǥ�� ���̸� ȭ�鿡 ����ϴ� �޼ҵ� �ϼ�
		System.out.printf("(%d, %d)���� ũ�Ⱑ %dX%d�� �簢��\n", this.x, this.y, this.width, this.height);
	}
	
	public int square() { //�簢�� ���� �����ϴ� �޼ҵ� �ϼ�
		return this.width*this.height;
	}
	
	public boolean contains(Rectangle r) { 
		// �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
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
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) 
			System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
	}
}