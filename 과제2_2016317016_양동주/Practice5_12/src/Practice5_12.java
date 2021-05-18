import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // 링크 연결
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

class GraphicEditor { // 필요하다면 메소드 추가 가능
	//필드 선언
	String editorName=null;	//에디터이름
	Shape header = null;
	Shape end=null;

	Scanner scanner = new Scanner(System.in);
	//메뉴 입력 수 변수
	int selectedNum=0;
	int insertSelect=0;
	int deleteSelect=0;
	
	//생성자 작성
	public GraphicEditor(String editorName) {
		this.editorName=editorName;
	}


	public void run() {
		System.out.printf("그래픽 에디터 %s을 실행합니다.\n", editorName);
		while(true) {			
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			selectedNum=scanner.nextInt();
			if (selectedNum==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				insertSelect=scanner.nextInt();//메뉴 입력받기
				insert(insertSelect);//메뉴 처리
			}
			else if(selectedNum==2) {
				System.out.print("삭제할 도형의 위치>>");
				deleteSelect=scanner.nextInt();//메뉴 입력받기
				delete(deleteSelect);//메뉴 처리
			}
			else if(selectedNum==3) {
				showAll();//메뉴 처리
			}
			else if(selectedNum==4) {
				System.out.printf("%s를 종료합니다.", editorName);
				break;
			}
		}
		scanner.close();//스캐너 종료
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
		//입력할 shape를 null로 초기화.
		Shape insertedShape=null;
		
		//유저의 선택에 따라 동적바인딩을 위한 객체 생성
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
		//맨 뒷자리에 입력하기 위해 임시노드를 이동시키고 연결.
		
	}
	private void showAll() {
		Shape current =header;
		while(current!=null) {
			current.draw(); //동적바인딩
			current=current.getNext();
		}
	}
}

public class Practice5_12 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");//생성자활용.
		ge.run();

	}

}