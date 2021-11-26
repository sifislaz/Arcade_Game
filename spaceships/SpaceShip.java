package spaceships;

import javax.swing.ImageIcon;

import MainPackage.MainClass;

public abstract class SpaceShip implements Navigation{
	
	protected int xCoord = 0;
	protected int yCoord = 0;
	protected int xPace;
	protected int yPace;
	protected ImageIcon SpaceShipImageIcon;
	
	
	public int getX() {
		return xCoord;
	}
	
	public int getY() {
		return yCoord;
	}
	
	public ImageIcon getIcon() {
		return SpaceShipImageIcon;
	}
	
	public int moveUP() {
		yCoord -= yPace;
		if(yCoord < 0) yCoord += yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveDOWN() {
		yCoord += yPace;
		if(yCoord + MainClass.spaceShipHeight > MainClass.cosmosHeight) yCoord -= yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveLEFT() {
		xCoord -= xPace;
		if(xCoord < 0) xCoord += xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}
	
	
	public int moveRIGHT() {
		xCoord += xPace;
		if(xCoord + MainClass.spaceShipWidth > MainClass.cosmosWidth) xCoord += xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}


}