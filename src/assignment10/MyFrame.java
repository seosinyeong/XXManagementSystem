package assignment10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		 
		 
		JPanel panel = new JPanel();
		JLabel label1= new JLabel("Welcome to JAVA pizza. Choose the type of pizza.");
		JLabel label2 = new JLabel("count");
		JButton button1 = new JButton("Combination Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Roasted meat Pizza");

		JTextField field = new JTextField("          ");
		
		panel.add(label1);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3); 
		panel.add(label2);
		panel.add(field);
		
		this.add(panel);
		setVisible(true);

}

}