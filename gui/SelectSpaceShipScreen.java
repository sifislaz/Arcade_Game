package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import spaceships.*;

public class SelectSpaceShipScreen extends JPanel{
	private static final long serialVersionUID = 1L;
	SelectSpaceShipScreen(){
		this.setLayout(new BorderLayout());  // Use the border layout to split the panel in two categories 
		this.add(createNorthPanel(), BorderLayout.NORTH);
		this.add(createCenterPanel(), BorderLayout.CENTER);
		
	}
	
	private JPanel createNorthPanel() {  // northern panel manager
		JPanel panel = new JPanel();  // create panel
		panel.setPreferredSize(new Dimension(100,100));  // set panel dimensions
		JLabel label = new JLabel("Choose your spaceship ");  // create a label to put in the panel
		label.setFont(new Font("Arcade Classic", Font.PLAIN, 25));  // set label's font
		label.setForeground(Color.WHITE);  // label's color
		panel.setBackground(Color.BLACK);  // panel's background color
		panel.add(label);  // add label to the panel
		return panel;
	}
	
	private JPanel createCenterPanel() {
		// create buttons for the spaceships
		JButton btnSpZero = new JButton();
		JButton btnSpAlpha = new JButton();
		JButton btnSpBeta = new JButton();
		JButton btnSpGama = new JButton();
		JButton btnSpDelta = new JButton();
		// bind action listeners to the buttons
		btnSpZero.addActionListener(new SpaceShipSelectButtonHandler("ZERO"));
		btnSpAlpha.addActionListener(new SpaceShipSelectButtonHandler("ALPHA"));
		btnSpBeta.addActionListener(new SpaceShipSelectButtonHandler("BETA"));
		btnSpGama.addActionListener(new SpaceShipSelectButtonHandler("GAMA"));
		btnSpDelta.addActionListener(new SpaceShipSelectButtonHandler("DELTA"));
		
		// put the image of the spaceship on the button
		btnSpZero.setIcon(new ImageIcon(SpaceShipZERO.img));
		btnSpAlpha.setIcon(new ImageIcon(SpaceShipALPHA.img));
		btnSpBeta.setIcon(new ImageIcon(SpaceShipBETA.img));
		btnSpGama.setIcon(new ImageIcon(SpaceShipGAMA.img));
		btnSpDelta.setIcon(new ImageIcon(SpaceShipDELTA.img));
		
		// make buttons transparent
		transparentButton(btnSpZero);
		transparentButton(btnSpAlpha);
		transparentButton(btnSpBeta);
		transparentButton(btnSpGama);
		transparentButton(btnSpDelta);
		
		JPanel panel = new JPanel();  // create panel
		panel.setLayout(new GridLayout());  // set the layout of the panel
		panel.setBackground(Color.BLACK);  // set background color
		// add buttons
		panel.add(btnSpZero);
		panel.add(btnSpAlpha);
		panel.add(btnSpBeta);
		panel.add(btnSpGama);
		panel.add(btnSpDelta);
		
		return panel;
	}

	// make buttons transparent
	private static void transparentButton(JButton btn) {
		btn.setOpaque(false);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
	}
}

// Action handler class
class SpaceShipSelectButtonHandler implements ActionListener{
	String name;
	
	public SpaceShipSelectButtonHandler(String x) {
		name = x;  // get the spaceship's name
	}
	
	public void actionPerformed(ActionEvent e) {
		SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);  // change the panel contained in the card layout
		SpaceFrame.playScreen.setFocusable(true);
		SpaceFrame.playScreen.requestFocus();
		// generate an instance for the spaceship chosen
		if(name.equalsIgnoreCase("ZERO")) SpaceFrame.playScreen.setUserSpaceShip(new SpaceShipZERO());
		if(name.equalsIgnoreCase("ALPHA")) SpaceFrame.playScreen.setUserSpaceShip(new SpaceShipALPHA());
		if(name.equalsIgnoreCase("BETA")) SpaceFrame.playScreen.setUserSpaceShip(new SpaceShipBETA());
		if(name.equalsIgnoreCase("GAMA")) SpaceFrame.playScreen.setUserSpaceShip(new SpaceShipGAMA());
		if(name.equalsIgnoreCase("DELTA")) SpaceFrame.playScreen.setUserSpaceShip(new SpaceShipDELTA());
	}
}