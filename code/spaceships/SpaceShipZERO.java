package spaceships;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import MainPackage.MainClass;

public class SpaceShipZERO extends SpaceShip{
	
	public static Image img;
	
	static {
		try {
			SpaceShipZERO.img = ImageIO.read(MainClass.class.getResource("../images/ZERO.png"));  // read the spaceship's image
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public SpaceShipZERO() {
		super(Color.RED);
		xPace = 5;
		yPace = 5;
		// put the spaceship at the down left corner
		super.xCoord = 0;
		super.yCoord = MainClass.cosmosHeight - MainClass.spaceShipHeight - MainClass.yOffset;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipZERO.img);
	}
	
	
}
