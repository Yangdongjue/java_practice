package midterm;
import java.util.Scanner;

class Book3{
	String title;
	String author;
	Book3(String title){
		this.title=title;
		this.author="작가 미상";
	}
	Book3(String title, String author){
		this.title=title;
		this.author=author;
	}
}
public class Object5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book3[] bk=new Book3[2];
		for (int i=0;i<bk.length;i++) {
			String title=scanner.next();
			String author=scanner.next();
			bk[i]=new Book3(title, author);
			System.out.println(bk[i].author+" "+bk[i].title);
		}
		scanner.close();
	}
}
