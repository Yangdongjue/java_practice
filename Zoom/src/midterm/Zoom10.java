package midterm;
import java.util.Scanner;
public class Zoom10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] n= new int[5];
		int i;
		int sum=0;
		int avg=0;
		int check=0;
		
		for(i=0;i<5;i++) {
			n[i]=scanner.nextInt();
			sum+=i;
		}
		avg=sum/n.length;
		for(int k:n) {
			if(k>avg) {
				check++;
			}
		}
		System.out.println(check+" "+avg);
		scanner.close();
	}
}
