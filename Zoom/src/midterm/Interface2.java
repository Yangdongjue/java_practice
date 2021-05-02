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
		System.out.println("������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Ӿ��.");
	}
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�.");
	}
	public void receiveSMS() {
		System.out.println("���� �ɴϴ�.");
	}
	public void play() {
		System.out.println("�����ų�Կ�");
	}
	public void stop() {
		System.out.println("����Կ�.");
	}
}

public class Interface2 {
	public static void main(String[] args) {
		MobilePhoneInterface smpt = new SmartPhone();
		smpt.receiveCall();
	}
}
