package zoom0525;
import javax.swing.*;
import java.awt.*;
public class Gui4 extends JFrame{
	public Gui4() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		JButton button = new JButton("Click");
		button.setSize(100,30);
		button.setLocation(50,70);
		contentPane.add(button);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Gui4();
	}
}
