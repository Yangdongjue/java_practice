package finaltest;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	String phoneNum;
	int id;
	public Student(String phoneNum, int id) {
		this.id = id; this.phoneNum=phoneNum;
	}
	public int getID() {
		return id;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> hash = new HashMap<String, Student>();
		Scanner scanner = new Scanner(System.in);
		
		hash.put("�絿��", new Student("123",1));
		hash.put("������", new Student("456",2));
		hash.put("������", new Student("789",3));
		
		while(true) {
			System.out.println("�˻��� �̸�?");
			String input = scanner.next();
			if(input.equals("exit")) {
				System.out.println("�۵��� �����մϴ�.");
				break;
			}
			if (hash.get(input)==null) {
				System.out.println("�׷� �� �����ϴ�.");
			}
			else {
				Student inputStudent=hash.get(input);
				System.out.println(inputStudent.id+" "
						+inputStudent.phoneNum);
			}
		}
		scanner.close();
	}
}