package midterm;
class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate=r;
	}
}
public class Static2 {
	public static void main(String[] args) {
		double won = 30000;
		double dollar = 2;
		
		CurrencyConverter.setRate(3.14);
		System.out.println(
				CurrencyConverter.toDollar(won)+" "+
				CurrencyConverter.toKWR(dollar)
				);
	}
}
