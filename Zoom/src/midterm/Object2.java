package midterm;

class Book{
	String title;
	String author;
	Book(String title){
		this.title=title;
		this.author="작가 미상";
	}
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
}
public class Object2 {
	Book bk= new Book("미친 자바", "한진섭");
	Book bk2=new Book("양동주 자서전");
}
