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
	Shape header = new Circle();//링크드리스트의 헤더. 추상메소드는 객체 생성이 안되서 circle로 만듬.
	Shape tmptNode;//임시 노드를 가리키는 변수
	Shape preNode;//이전 노드를 가리키는 변수

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
		tmptNode=header.getNext();//헤더 다음 첫 노드로 이동
			if(index>1) {//삭제할 위치가 1이상일때
				
				//노드를 이동시키는 반복문
				for(int i = 0;i<index-1;i++) {						
					//현재 노드가 존재할경우
					if(tmptNode!=null) {
						//현재 노드는 이전 노드로, 현재 노드는 다음 노드로.
						preNode=tmptNode;
						tmptNode=tmptNode.getNext();
					}
					//현재 노드가 존재하지 않을경우.
					else {
						System.out.println("삭제할 수 없습니다.");
						return false;
					}
				}
				
				//이동시키고 나서 삭제 처리
				if(tmptNode!=null) {
					preNode.setNext(tmptNode.getNext());//이전노드 다음 노드를 현재 노드 다음 노드로 설정.
					tmptNode=null;//현재 노드를 삭제
					System.out.println("정상적으로 삭제하였습니다.");
					return true;	
				}
				//현재 노드가 없을 경우.
				else {
					System.out.println("삭제할 수 없습니다.");
					return false;
				}
			}
			//삭제시킬 노드가 첫번째 노드일 경우.
			else if(index==1) {
				//노드가 존재할 경우
				if(tmptNode!=null) {
					header.setNext(tmptNode.getNext());//헤더 다음 노드를 현재 노드 다음 노드로 설정.
					tmptNode=null;//현재 노드 삭제
					System.out.println("정상적으로 삭제하였습니다.");
					return true;					
				}
				//노드가 존재 하지 않을 경우.
				else {
					System.out.println("삭제할 수 없습니다.");
					return false;
				}
			}
			//0이나 음수가 index로 올 경우.
			else {
				System.out.println("삭제할 수 없습니다.");
				return false;
			}

	}

	private void insert(int choice) {
		//입력할 shape를 null로 초기화.
		Shape insertedShape=null;
		//임시노드를 헤더에 위치시킴
		tmptNode=header;
		
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
		
		//맨 뒷자리에 입력하기 위해 임시노드를 이동시키고 연결.
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
			tmptNode.draw(); //동적바인딩
			tmptNode=tmptNode.getNext();
		}
	}
}

public class Practice5_12 {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");//생성자활용.
		ge.run();

	}

}