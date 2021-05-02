package midterm;

interface PhoneInterface2{
	final int TIMEOUT =10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("PHONE");
	}
}
interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	void play();
	void stop();
}
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() {
		System.out.println("따르릉");
	}
	public void receiveCall() {
		System.out.println("전화가 왓어요.");
	}
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	public void receiveSMS() {
		System.out.println("문자 옵니다.");
	}
	public void play() {
		System.out.println("실행시킬게요");
	}
	public void stop() {
		System.out.println("멈출게요.");
	}
}

public class Interface2 {
	public static void main(String[] args) {
		MobilePhoneInterface smpt = new SmartPhone();
		smpt.receiveCall();
	}
}
