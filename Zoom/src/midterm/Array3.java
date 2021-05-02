package midterm;

public class Array3 {
	enum Week {월,화,수,목,금,토,일}
	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		for(int k : n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		for(String j : names) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		for(Week day:Week.values()) {
			System.out.print(day+" ");
		}
	}
}
