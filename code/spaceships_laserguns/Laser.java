package spaceships_laserguns;

import MainPackage.MainClass;

public class Laser {
	public int x;
	public int y;
	
	Laser(int x, int y){
		this.x = x+MainClass.spaceShipWidth/2;
		this.y = y;
	}
}
