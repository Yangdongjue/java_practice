package midterm;

public class Array3 {
	enum Week {��,ȭ,��,��,��,��,��}
	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		
		int sum = 0;
		for(int k : n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("���� "+sum);
		
		for(String j : names) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		for(Week day:Week.values()) {
			System.out.print(day+" ");
		}
	}
}
