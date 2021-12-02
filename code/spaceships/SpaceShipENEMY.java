package spaceships;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import MainPackage.MainClass;
import java.util.Random;

public class SpaceShipENEMY extends SpaceShip{
	
	public static Image img;
	static Random randomGen = new Random();
	
	static {
		try {
			SpaceShipENEMY.img = ImageIO.read(MainClass.class.getResource("../images/ENEMY.png"));  // read the spaceship's image
			SpaceShipENEMY.img = SpaceShipENEMY.img.getScaledInstance(MainClass.spaceShipWidth, MainClass.spaceShipHeight,0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public SpaceShipENEMY() {
		super(Color.WHITE);
		xPace = 15;
		yPace = 15;
		// put the spaceship at the upper right corner
		super.xCoord = MainClass.cosmosWidth - 100;
		super.yCoord = 0;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipENEMY.img);
	}
	
	public void huntUserSpaceship(SpaceShip userSpaceShip) {
		int trig = randomGen.nextInt(10);
		if(trig == 0) this.lasergun.fire(this.getX(), this.getY() + 100);
		if(userSpaceShip.xCoord > this.xCoord) this.moveRIGHT();
		else this.moveLEFT();
		
		int trig2 = randomGen.nextInt(4);
		if(trig2 == 1) this.moveLEFT();
		if(trig2 == 3) this.moveRIGHT();
	}
}
