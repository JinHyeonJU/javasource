import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing extends JFrame {
	public Swing() {
		super("Hello World");
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome to Swing");
		getContentPane().add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		Swing app = new Swing();
	}
}
