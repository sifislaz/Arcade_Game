package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import spaceships.*;

public class GamePlayScreen extends JPanel implements KeyListener{
	
	private static final long serialVersionUID = 1L;
	
	private SpaceShip userSpaceShip;
	
	GamePlayScreen(){
		addKeyListener(this);  //create key listener
		this.setVisible(true);
		this.setBackground(Color.BLACK);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  // put the spaceship at the screen
		userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) userSpaceShip.moveUP();  // if up key pressed, go up
		if(e.getKeyCode() == KeyEvent.VK_DOWN) userSpaceShip.moveDOWN();  // if down key pressed, go down
		if(e.getKeyCode() == KeyEvent.VK_LEFT) userSpaceShip.moveLEFT();  // if left key pressed, go left
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) userSpaceShip.moveRIGHT();  // if right key pressed, go right
		this.repaint();
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	void setUserSpaceShip(SpaceShip user) {
		userSpaceShip = user;
	}
}

