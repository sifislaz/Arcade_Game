package gui;

import javax.swing.*;
import java.awt.*;


public class SpaceFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	static int width, height;
	static SelectSpaceShipScreen selectScreen = new SelectSpaceShipScreen();  // create the select screen
	static GamePlayScreen playScreen = new GamePlayScreen();  // create the gameplay screen
	static CardLayout cardLayout = new CardLayout();  // create a card layout object
	
	static JPanel spaceFramePanel = new JPanel();  // create the frame's panel
	
	public SpaceFrame(int width, int height) {
		// set window's dimensions
		SpaceFrame.width = width;
		SpaceFrame.height = height;
		this.setSize(width, height);
		
		this.setTitle("Spaceship Arcade Game");  // set window's title
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);  // set that 'X' button of the window terminates the program
		this.setLocationRelativeTo(null);
		this.setFocusable(true);
		setupMasterPanel();  // configure the master panel
		setResizable(false);
		this.setVisible(true);  // print the window
	}
	
	void setupMasterPanel() {
		spaceFramePanel.setLayout(cardLayout);
		spaceFramePanel.add(selectScreen);
		spaceFramePanel.add(playScreen);
		this.add(spaceFramePanel);
	}
}
