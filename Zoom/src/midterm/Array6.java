package midterm;

public class Array6 {
	static int[] makeArray() {
		int [] ar = new int[4];
		for(int i=0; i<ar.length;i++) {
			ar[i]=i+1;
		}
		return ar;
	}
	public static void main(String[] args) {
		int [] arr = makeArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
