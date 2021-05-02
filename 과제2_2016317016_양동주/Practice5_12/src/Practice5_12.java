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
	Shape header = new Circle();//��ũ�帮��Ʈ�� ���. �߻�޼ҵ�� ��ü ������ �ȵǼ� circle�� ����.
	Shape tmptNode;//�ӽ� ��带 ����Ű�� ����
	Shape preNode;//���� ��带 ����Ű�� ����

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
		tmptNode=header.getNext();//��� ���� ù ���� �̵�
			if(index>1) {//������ ��ġ�� 1�̻��϶�
				
				//��带 �̵���Ű�� �ݺ���
				for(int i = 0;i<index-1;i++) {						
					//���� ��尡 �����Ұ��
					if(tmptNode!=null) {
						//���� ���� ���� ����, ���� ���� ���� ����.
						preNode=tmptNode;
						tmptNode=tmptNode.getNext();
					}
					//���� ��尡 �������� �������.
					else {
						System.out.println("������ �� �����ϴ�.");
						return false;
					}
				}
				
				//�̵���Ű�� ���� ���� ó��
				if(tmptNode!=null) {
					preNode.setNext(tmptNode.getNext());//������� ���� ��带 ���� ��� ���� ���� ����.
					tmptNode=null;//���� ��带 ����
					System.out.println("���������� �����Ͽ����ϴ�.");
					return true;	
				}
				//���� ��尡 ���� ���.
				else {
					System.out.println("������ �� �����ϴ�.");
					return false;
				}
			}
			//������ų ��尡 ù��° ����� ���.
			else if(index==1) {
				//��尡 ������ ���
				if(tmptNode!=null) {
					header.setNext(tmptNode.getNext());//��� ���� ��带 ���� ��� ���� ���� ����.
					tmptNode=null;//���� ��� ����
					System.out.println("���������� �����Ͽ����ϴ�.");
					return true;					
				}
				//��尡 ���� ���� ���� ���.
				else {
					System.out.println("������ �� �����ϴ�.");
					return false;
				}
			}
			//0�̳� ������ index�� �� ���.
			else {
				System.out.println("������ �� �����ϴ�.");
				return false;
			}

	}

	private void insert(int choice) {
		//�Է��� shape�� null�� �ʱ�ȭ.
		Shape insertedShape=null;
		//�ӽó�带 ����� ��ġ��Ŵ
		tmptNode=header;
		
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
		
		//�� ���ڸ��� �Է��ϱ� ���� �ӽó�带 �̵���Ű�� ����.
		while(true) {
			if(tmptNode.getNext()==null) {
				tmptNode.setNext(insertedShape);
				break;
			}
			else {
				tmptNode=tmptNode.getNext();				
			}
		}
		
	}
	private void showAll() {
		tmptNode=header.getNext();
		while(tmptNode!=null) {
			tmptNode.draw(); //�������ε�
			tmptNode=tmptNode.getNext();
		}
	}
}

public class Practice5_12 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");//������Ȱ��.
		ge.run();

	}

}