package spaceships;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import MainPackage.MainClass;

public class SpaceShipDELTA extends SpaceShip{
	
	public static Image img;
	
	static {
		try {
			SpaceShipDELTA.img = ImageIO.read(MainClass.class.getResource("../images/DELTA.png"));  // read the spaceship's image
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	
	public SpaceShipDELTA() {
		super(Color.YELLOW);
		xPace = 40;
		yPace = 40;
		// put the spaceship at the down left corner
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - MainClass.spaceShipHeight - MainClass.yOffset;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipDELTA.img);
	}
	
	
	
}
