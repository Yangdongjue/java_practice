package zoom0525;
import javax.swing.*;
import java.awt.*;
public class Gui1 extends JFrame {
	public Gui1() {
		setTitle("Boarder Layout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("EAST"),BorderLayout.EAST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Gui1();
	}
}
