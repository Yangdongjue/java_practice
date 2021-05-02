package midterm;

public class Array4 {
	public static void main(String[] args) {
		double score[][] = {{1.5, 3.5},
				{3.2,4.2},{2.5,4.4},{1,2}};
		
		double sum=0;
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
			}
		}
		System.out.println(sum/(score.length*score[0].length));
	}
}
