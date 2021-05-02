package zoom0406;
import java.util.Scanner;

class Phone { // ����� ���� ������ ���� Ŭ����
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
		// ������ ����� ��(n)�� �Է¹ް�, 
		int n=scanner.nextInt();
		// n ���� ������ �迭 ����
		pArray = new Phone[n];
		// �ݺ����� ���ؼ� �̸�, ��ȭ ��ȣ �Է¹ް�, Phone ��ü ����
		for(int i = 0 ; i<pArray.length;i++) {
			String nameInput = scanner.next();
			String phoneInput = scanner.next();
			pArray[i]=new Phone(nameInput, phoneInput);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	String search(String name) {
		// �ݺ����� ���ؼ� Phone��ü �迭�� ��ȸ�Ͽ�, name �˻� �� ��ȭ��ȣ ����, ���� ��쿡 null ����
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
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + " �� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + tel + " �Դϴ�.");				
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
