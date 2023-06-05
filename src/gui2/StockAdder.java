package gui2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StockAdder extends JFrame{
	
	public StockAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ",JLabel.TRAILING);
		JTextField fieldID = new JTextField (10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelItem = new JLabel("Item: ",JLabel.TRAILING);
		JTextField fieldItem = new JTextField (10);
		labelItem.setLabelFor(fieldItem);
		panel.add(labelItem);
		panel.add(fieldItem);
		
		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldName = new JTextField (10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel,4,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
