package Gui;

import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		//타이틀 달기
		super("타이틀문자열");
		//setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		//컨텐트팬 알아내고 컴포넌트 달기
		Container c = frame.getContentPane();
		JButton b = new JButton("Click");
		c.add(b);
		//컨텐트팬 변경
		JPanel p = new JPanel();
		frame.setContentPane(p);
		
	}
}
