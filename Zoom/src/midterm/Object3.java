package midterm;

class Book2{
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book2() {
		this("","");
		System.out.println("������ ȣ��");
	}
	public Book2(String title) {
		this.title=title;
		this.author="���ڹ̻�";
	}
	public Book2(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class Object3 {
	//����
}
