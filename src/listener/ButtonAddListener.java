package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.StockAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	
	private WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		StockAdder adder = frame.getStockadder();
		frame.setupPanel(adder);
	}

}
