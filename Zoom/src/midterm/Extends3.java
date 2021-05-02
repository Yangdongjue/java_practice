package midterm;
class Weapon{
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
}

public class Extends3 {
	public static void main(String[] args) {
		Weapon weapon;
		weapon=new Weapon();
		System.out.println(weapon.fire());
		
		weapon = new Cannon();
		System.out.println(weapon.fire());
	}
}
