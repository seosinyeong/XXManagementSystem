package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.StockViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame= frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton) e.getSource();
		StockViewer viewer =frame.getStockviewer();
		frame.setupPanel(viewer);
	}

}
