package spaceships;

import javax.swing.ImageIcon;
import java.awt.Color;
import MainPackage.MainClass;
import spaceships_laserguns.Lasergun;

public abstract class SpaceShip implements Navigation{
	
	protected int xCoord = 0;
	protected int yCoord = 0;
	protected int xPace;
	protected int yPace;
	protected ImageIcon SpaceShipImageIcon;
	public Lasergun lasergun;
	
	public SpaceShip(Color gunColor) {
		lasergun = new Lasergun(gunColor);
	}
	public int getX() {
		return xCoord;
	}
	
	public int getY() {
		return yCoord;
	}
	
	public ImageIcon getIcon() {
		return SpaceShipImageIcon;
	}
	
	
	public void fire(int x, int y) {
		lasergun.fire(x,y);
	}
	
	public int moveUP() {
		yCoord -= yPace;
		if(yCoord < 0) yCoord += yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveDOWN() {
		yCoord += yPace;
		if(yCoord + MainClass.spaceShipHeight > MainClass.cosmosHeight - MainClass.yOffset) yCoord -= yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveLEFT() {
		xCoord -= xPace;
		if(xCoord < 0) xCoord += xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}
	
	
	public int moveRIGHT() {
		xCoord += xPace;
		if(xCoord + MainClass.spaceShipWidth > MainClass.cosmosWidth) xCoord -= xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}


}