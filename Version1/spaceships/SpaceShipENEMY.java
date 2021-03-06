package spaceships;
import MainPackage.MainClass;

public class SpaceShipENEMY extends SpaceShip{
	private int xPace = 15;
	private int yPace = 15;
	
	
	public SpaceShipENEMY(int spaceShipHeight, int spaceShipWidth) {
		super(spaceShipHeight, spaceShipWidth);
		this.spaceShipHeight = super.spaceShipHeight;
		this.spaceShipWidth = super.spaceShipWidth;
		super.xCoord = MainClass.cosmosWidth - this.spaceShipWidth;
		super.yCoord = 0;
	}
	
	
	public int moveUP() {
		yCoord -= yPace;
		if(yCoord < 0) yCoord += yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveDOWN() {
		yCoord += yPace;
		if(yCoord + spaceShipHeight > MainClass.cosmosHeight) yCoord -= yPace;  // if the spaceship is about to go out of bounds
		return yCoord;
	}
	
	
	public int moveLEFT() {
		xCoord -= xPace;
		if(xCoord < 0) xCoord += xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}
	
	
	public int moveRIGHT() {
		xCoord += xPace;
		if(xCoord + spaceShipWidth > MainClass.cosmosWidth) xCoord += xPace;  // if the spaceship is about to go out of bounds
		return xCoord;
	}
	
	
	public void printCoords() {
		System.out.println("ENEMY xCoord is: " + xCoord);
		System.out.println("ENEMY yCoord is: " + yCoord);
	}
}
