package zoom0427;

import java.util.StringTokenizer;
public class Zoom1 {
	public static void main(String[] args) {
		int sum=0;
		int temp=0;
		String next=null;
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		while (st.hasMoreTokens()) { 
			next = st.nextToken();	
			System.out.println(next);
			if(st.countTokens()%2==0) {
				temp=Integer.parseInt(next);
				sum+=temp;
			}
		}
		System.out.println("���� "+sum);
	}
}