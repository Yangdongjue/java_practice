
import java.util.Scanner;

class CalculateClass{	
	int [] unit= {50000,10000,1000,500,100,50,10,1};
	void calculate(int inputNumber) {
		for(int i=0;i<unit.length;i++) {
			int value = inputNumber / unit[i];
			inputNumber=inputNumber % unit[i];
			if(value!=0) {				
				System.out.printf("%d원 짜리 : %d개", unit[i], value );
				System.out.println();
			}
		}
	}
}
public class Practice6 {
	public static void main(String[] agrs) {		
		Scanner inputNumber = new Scanner(System.in);
		CalculateClass calculateclass = new CalculateClass();
	
		calculateclass.calculate(inputNumber.nextInt());
		inputNumber.close();
	}
}