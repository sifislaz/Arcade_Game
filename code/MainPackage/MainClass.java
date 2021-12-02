package MainPackage;

import gui.SpaceFrame;



public class MainClass {
	
	// cosmos and spaceship characteristics
	
	public static int cosmosWidth = 800;  // cosmos O(0,0) upper left corner 
	public static int cosmosHeight = 600;
	public static int spaceShipWidth = 100;  // spaceship O(0,0) upper left corner
	public static int spaceShipHeight = 100;
	public static int yOffset = 30; 
	public static SpaceFrame arcadeGame;
	
	public static void main(String[] args) {
		arcadeGame = new SpaceFrame(cosmosWidth, cosmosHeight);  // create the game's frame
	}
	
}
