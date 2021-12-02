package gui;

import javax.swing.*;
import java.awt.*;


public class WinnerScreen extends JPanel{
	private static final long serialVersionUID = 1L;
	
	WinnerScreen(){
		this.setLayout(new BorderLayout());
		this.add(createNorthPanel(), BorderLayout.NORTH);
		this.add(createCenterPanel(), BorderLayout.CENTER);
	}
	
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();  // create panel
		panel.setPreferredSize(new Dimension(100,100));  // set panel dimensions
		panel.setBackground(Color.BLACK);  // panel's background color
		return panel;
	}
	
	private JPanel createCenterPanel() {
		JPanel panel = new JPanel();  // create panel
		panel.setPreferredSize(new Dimension(100,100));  // set panel dimensions
		JLabel label = new JLabel("YOU WIN!");
		label.setFont(new Font("Arcade Classic", Font.BOLD, 35));  // set label's font
		label.setForeground(Color.GREEN);  // label's color
		panel.setBackground(Color.BLACK);  // panel's background color
		panel.add(label);  // add label to the panel
		return panel;
	}
	
}