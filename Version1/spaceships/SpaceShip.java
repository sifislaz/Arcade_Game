package spaceships;

public abstract class SpaceShip implements Navigation{
	
	int xCoord = 0;
	int yCoord = 0;
	int spaceShipHeight;
	int spaceShipWidth;
	
	public SpaceShip(int spaceShipHeight, int spaceShipWidth) {
		this.spaceShipHeight = spaceShipHeight;
		this.spaceShipWidth = spaceShipWidth;
	}
	
	public abstract int moveUP();
	
	
	public abstract int moveDOWN();
	
	
	public abstract int moveLEFT();
	
	
	public abstract int moveRIGHT();

	
	public abstract void printCoords();
}
