package Now;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class Jframea {

	public JTextPane textPane1 = null;

	public Jframea() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLayout(new GridLayout(1, 2));

		/* 加入一个textpane */
		textPane1 = new JTextPane();
		textPane1.setBorder(new LineBorder(Color.BLUE));
		frame.getContentPane().add(textPane1);
		frame.setVisible(true);
	}

	public void p(String a) {
		this.textPane1.setText(a);
	}

}
