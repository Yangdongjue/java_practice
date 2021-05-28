package zoom0525;
import javax.swing.*;
import java.awt.*;

public class Gui3 extends JFrame{
	public Gui3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		c.add(new JButton("Click"));
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Gui3(); 
	}
}
