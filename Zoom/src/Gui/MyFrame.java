package Gui;

import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		//Ÿ��Ʋ �ޱ�
		super("Ÿ��Ʋ���ڿ�");
		//setTitle("300x300 ���� ������ �����");
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		//����Ʈ�� �˾Ƴ��� ������Ʈ �ޱ�
		Container c = frame.getContentPane();
		JButton b = new JButton("Click");
		c.add(b);
		//����Ʈ�� ����
		JPanel p = new JPanel();
		frame.setContentPane(p);
		
	}
}
