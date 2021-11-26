package spaceships;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import MainPackage.MainClass;

public class SpaceShipBETA extends SpaceShip{
	
	public static Image img;
	
	static {
		try {
			SpaceShipBETA.img = ImageIO.read(MainClass.class.getResource("../images/BETA.png"));  // read the spaceship's image
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public SpaceShipBETA() {
		xPace = 20;
		yPace = 20;
		// put the spaceship at the down left corner
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - MainClass.spaceShipHeight - MainClass.yOffset;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipBETA.img);
	}
	
}
