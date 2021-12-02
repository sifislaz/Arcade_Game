package gui;

import javax.swing.*;

import MainPackage.MainClass;

import java.awt.*;
import java.awt.event.*;
import spaceships.*;
import java.util.Timer;
import java.util.TimerTask;

public class GamePlayScreen extends JPanel implements KeyListener{
	
	private static final long serialVersionUID = 1L;
	
	private SpaceShip userSpaceShip;
	private SpaceShipENEMY enemySpaceShip;
	private int userCounter = 0;
	private int enemyCounter = 0;
	protected static boolean userWinner = false;
	protected static boolean enemyWinner = false;
	
	GamePlayScreen(){
		addKeyListener(this);  //create key listener
		this.setVisible(true);
		this.setBackground(Color.BLACK);
		createDaemon();
	}
	
	private void createDaemon() {
		Timer timer = new Timer();
		TimerTask task = new monitorDaemonGame();
		TimerTask winCheck = new winCheck();
		timer.schedule(task, 100, 100);
		timer.schedule(winCheck,100, 100);
	}
	
	private void winningCheck() {
		userSpaceShip.lasergun.laserShotsList.forEach((tmp)->{
			if((tmp.x >= enemySpaceShip.getX() && tmp.x <= enemySpaceShip.getX()+MainClass.spaceShipWidth) && 
					(tmp.y >= enemySpaceShip.getY() && tmp.y <= enemySpaceShip.getY()+MainClass.spaceShipHeight)) {
				enemyCounter++;
				userSpaceShip.lasergun.laserShotsList.remove(tmp);
			}
			if(enemyCounter==10) {
				enemyWinner = true;
				SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
			}
		});
		enemySpaceShip.lasergun.laserShotsList.forEach((tmp)->{
			if((tmp.x >= userSpaceShip.getX() && tmp.x <= userSpaceShip.getX()+MainClass.spaceShipWidth) && 
					(tmp.y >= userSpaceShip.getY() && tmp.y <= userSpaceShip.getY()+MainClass.spaceShipHeight)) {
				userCounter++;
				enemySpaceShip.lasergun.laserShotsList.remove(tmp);
			}
			if(userCounter == 10) {
				userWinner = true;
				SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
				SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
			}
		});
	}
	
	class winCheck extends TimerTask{
		public void run() {
			try {
				winningCheck();
				if(userWinner||enemyWinner) {
					this.cancel();
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
	class monitorDaemonGame extends TimerTask{
		public void run() {
			repaint();
			if(userWinner||enemyWinner) {
				this.cancel();
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  // put the spaceship at the screen
		enemySpaceShip.huntUserSpaceship(userSpaceShip);
		userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
		enemySpaceShip.getIcon().paintIcon(this, g, enemySpaceShip.getX(), enemySpaceShip.getY());
		showLaserShootings(g);	
	}
	
	private void showLaserShootings(Graphics g) {
		userSpaceShip.lasergun.laserShotsList.forEach((tmp)->{
			g.setColor(userSpaceShip.lasergun.lasercolor);
			g.drawLine(tmp.x, tmp.y, tmp.x, tmp.y-15);
			tmp.y = tmp.y - 15; // move the beam up
		});
		
		enemySpaceShip.lasergun.laserShotsList.forEach((tmp)->{
			g.setColor(enemySpaceShip.lasergun.lasercolor);
			g.drawLine(tmp.x, tmp.y, tmp.x, tmp.y-15);
			tmp.y = tmp.y + 15; // move the beam down
		});
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) userSpaceShip.moveUP();  // if up key pressed, go up
		if(e.getKeyCode() == KeyEvent.VK_DOWN) userSpaceShip.moveDOWN();  // if down key pressed, go down
		if(e.getKeyCode() == KeyEvent.VK_LEFT) userSpaceShip.moveLEFT();  // if left key pressed, go left
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) userSpaceShip.moveRIGHT();  // if right key pressed, go right
		if(e.getKeyCode() == KeyEvent.VK_SPACE) userSpaceShip.fire(userSpaceShip.getX(), userSpaceShip.getY());  // if space key pressed, shoot
		if(e.getKeyCode() == KeyEvent.VK_B) SpaceFrame.cardLayout.previous(SpaceFrame.spaceFramePanel); // if B key pressed, change panel contained in space frame
		this.repaint();
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	void setSpaceShips(SpaceShip user) {
		userSpaceShip = user;
		enemySpaceShip = new SpaceShipENEMY();
		userCounter = 0;
		enemyCounter = 0;
		userWinner = false;
		enemyWinner = false;
	}
}

