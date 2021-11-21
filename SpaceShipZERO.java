package spaceships;
import MainPackage.MainClass;

public class SpaceShipZERO extends SpaceShip{
	private int xPace = 5;
	private int yPace = 5;
	
	
	public SpaceShipZERO(int spaceShipHeight, int spaceShipWidth) {
		super(spaceShipHeight, spaceShipWidth);
		this.spaceShipHeight = super.spaceShipHeight;
		this.spaceShipWidth = super.spaceShipWidth;
	}
	
	
	public int moveUP() {
		yCoord -= yPace;
		if(yCoord < 0) yCoord += yPace;
		return yCoord;
	}
	
	
	public int moveDOWN() {
		yCoord += yPace;
		if(yCoord > MainClass.cosmosHeight) yCoord -= yPace;
		return yCoord;
	}
	
	
	public int moveLEFT() {
		xCoord -= xPace;
		if(xCoord < 0) xCoord += xPace;
		return xCoord;
	}
	
	
	public int moveRIGHT() {
		xCoord += xPace;
		if(xCoord > MainClass.cosmosWidth) xCoord += xPace;
		return xCoord;
	}
}
