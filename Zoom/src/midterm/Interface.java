package midterm;
interface PhoneInterface{
	final int TIMEOUT =10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("�츮��");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�..");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� ������..");
	}

}
public class Interface {
	public static void main(String[] args) {
		SamsungPhone galaxy	= new SamsungPhone();
		galaxy.printLogo();
		galaxy.sendCall();
		galaxy.receiveCall();
		galaxy.flash();
	}
	
}
