import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // ��ũ ����
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Circle extends Shape {
	@Override
	public void draw() {
		 System.out.println("Circle");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		 System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		 System.out.println("Rect");
	}
}

class GraphicEditor { // �ʿ��ϴٸ� �޼ҵ� �߰� ����
	//�ʵ� ����
	String editorName=null;	//�������̸�
	Shape header = null;
	Shape end=null;

	Scanner scanner = new Scanner(System.in);
	//�޴� �Է� �� ����
	int selectedNum=0;
	int insertSelect=0;
	int deleteSelect=0;
	
	//������ �ۼ�
	public GraphicEditor(String editorName) {
		this.editorName=editorName;
	}


	public void run() {
		System.out.printf("�׷��� ������ %s�� �����մϴ�.\n", editorName);
		while(true) {			
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			selectedNum=scanner.nextInt();
			if (selectedNum==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				insertSelect=scanner.nextInt();//�޴� �Է¹ޱ�
				insert(insertSelect);//�޴� ó��
			}
			else if(selectedNum==2) {
				System.out.print("������ ������ ��ġ>>");
				deleteSelect=scanner.nextInt();//�޴� �Է¹ޱ�
				delete(deleteSelect);//�޴� ó��
			}
			else if(selectedNum==3) {
				showAll();//�޴� ó��
			}
			else if(selectedNum==4) {
				System.out.printf("%s�� �����մϴ�.", editorName);
				break;
			}
		}
		scanner.close();//��ĳ�� ����
	}

	private boolean delete(int index) {
		Shape current = header;
		Shape previous = header;
		
		if (header==null)
			return false;
		
		for (int i=0; i<index;i++) {
			previous = current;
			current = current.getNext();
			if(current==null)
				return false;
		}
		if (header==end) {
			header=null;
			end=null;
			return true;
		}
		if(current==header) {
			header=header.getNext();
		}
		else if (current==end) {
			end=previous;
			end.setNext(null);
		} else {
			previous.setNext(current.getNext());
		}
		return true;
	}

	private void insert(int choice) {
		//�Է��� shape�� null�� �ʱ�ȭ.
		Shape insertedShape=null;
		
		//������ ���ÿ� ���� �������ε��� ���� ��ü ����
		if (choice==1) {
			insertedShape=new Line();
			System.out.println("Line inserted.");
		}
		else if(choice==2) {
			insertedShape=new Rect();
			System.out.println("Rect inserted.");
		}
		else if(choice==3) {
			insertedShape=new Circle();
			System.out.println("Circle inserted.");
		}
		if(header==null) {
			header=insertedShape;
			end=insertedShape;
		} else {
			end.setNext(insertedShape);
			end=insertedShape;
		}
		//�� ���ڸ��� �Է��ϱ� ���� �ӽó�带 �̵���Ű�� ����.
		
	}
	private void showAll() {
		Shape current =header;
		while(current!=null) {
			current.draw(); //�������ε�
			current=current.getNext();
		}
	}
}

public class Practice5_12 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");//������Ȱ��.
		ge.run();

	}

}