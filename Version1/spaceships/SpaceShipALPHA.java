package spaceships;
import MainPackage.MainClass;

public class SpaceShipALPHA extends SpaceShip{

	private int xPace = 10;
	private int yPace = 10;
	
	
	public SpaceShipALPHA(int spaceShipHeight, int spaceShipWidth) {
		super(spaceShipHeight, spaceShipWidth);
		this.spaceShipHeight = super.spaceShipHeight;
		this.spaceShipWidth = super.spaceShipWidth;
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - this.spaceShipHeight;
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
	
	@Override
	public void printCoords() {
		System.out.println("ALPHA xCoord is: " + xCoord);
		System.out.println("ALPHA yCoord is: " + yCoord);
	}
}
