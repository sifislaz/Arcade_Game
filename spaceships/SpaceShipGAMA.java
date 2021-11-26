package spaceships;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import MainPackage.MainClass;

public class SpaceShipGAMA extends SpaceShip{
	
	public static Image img;
	
	static {
		try {
			SpaceShipGAMA.img = ImageIO.read(MainClass.class.getResource("../images/GAMA.png"));  // read the spaceship's image
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public SpaceShipGAMA() {
		xPace = 30;
		yPace = 30;
		// put the spaceship at the down left corner
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - MainClass.spaceShipHeight - MainClass.yOffset;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipGAMA.img);
	}
	

}
