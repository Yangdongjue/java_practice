package zoom0406;
import java.util.Scanner;

class Phone { // 사람의 정보 저장을 위한 클래스
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name; 
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}

class PhoneBook {
	private Scanner scanner;
	private Phone [] pArray;
	public PhoneBook() { 
		scanner = new Scanner(System.in);
	}
	
	void read() {  
		// 저장할 사람의 수(n)를 입력받고, 
		int n=scanner.nextInt();
		// n 명을 저장할 배열 선언
		pArray = new Phone[n];
		// 반복문을 통해서 이름, 전화 번호 입력받고, Phone 객체 생성
		for(int i = 0 ; i<pArray.length;i++) {
			String nameInput = scanner.next();
			String phoneInput = scanner.next();
			pArray[i]=new Phone(nameInput, phoneInput);
		}
		System.out.println("저장되었습니다...");
	}
	
	String search(String name) {
		// 반복문을 통해서 Phone객체 배열을 순회하여, name 검색 및 전화번호 리턴, 없을 경우에 null 리턴
		String phoneNumber=null;
		for (int i=0; i<pArray.length;i++) {
			if(pArray[i].getName().equals(name)) {
				phoneNumber=pArray[i].getTel();				
			}
			else
				continue;
		}
		return phoneNumber;

	}
	
	void run() {
		read();
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + " 이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + " 입니다.");				
		}	
		
		scanner.close();
	}
}

public class Test3 {
	public static void main(String[] args) {
		PhoneBook ph = new PhoneBook();
		ph.run();
	}
}
