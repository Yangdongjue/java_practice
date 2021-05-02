package midterm;

class Book2{
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book2() {
		this("","");
		System.out.println("생성자 호출");
	}
	public Book2(String title) {
		this.title=title;
		this.author="작자미상";
	}
	public Book2(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class Object3 {
	//생략
}
