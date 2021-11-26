package spaceships;

import MainPackage.MainClass;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class SpaceShipALPHA extends SpaceShip{

	public static Image img;
	
	static {
		try {
			SpaceShipALPHA.img = ImageIO.read(MainClass.class.getResource("../images/ALPHA.png"));  // read the spaceship's image
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public SpaceShipALPHA() {
		xPace = 10;
		yPace = 10;
		// put the spaceship at the down left corner
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - MainClass.spaceShipHeight - MainClass.yOffset;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipALPHA.img);
	}
	

}
