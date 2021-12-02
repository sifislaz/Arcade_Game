package spaceships_laserguns;

import java.awt.Color;
import java.util.LinkedList;

public class Lasergun {
	public Color lasercolor;
	public LinkedList<Laser> laserShotsList = new LinkedList<Laser>();
	public Lasergun(Color lasercolor) {
		this.lasercolor = lasercolor;
	}
	
	public void fire(int x, int y) {
		laserShotsList.add(laserShotsList.size(),new Laser(x,y));
	}

}
