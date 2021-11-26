package MainPackage;

import java.util.LinkedList;
import java.util.Scanner;

import spaceships.*;

public class MainClass {
	
	// cosmos and spaceship characteristics
	
	public static int cosmosWidth = 800;  // cosmos O(0,0) upper left corner 
	public static int cosmosHeight = 600;
	public static int spaceShipWidth = 100;  // spaceship O(0,0) upper left corner
	public static int spaceShipHeight = 100;
	
	
	public static void main(String[] args) {
		LinkedList <SpaceShip> spaceShipList = new LinkedList<SpaceShip>();  // initialize spaceship catalog
		// create instances of the spaceships available
		SpaceShip z = new SpaceShipZERO(spaceShipHeight, spaceShipWidth);
		SpaceShip a = new SpaceShipALPHA(spaceShipHeight, spaceShipWidth);
		SpaceShip b = new SpaceShipBETA(spaceShipHeight, spaceShipWidth);
		SpaceShip g = new SpaceShipGAMA(spaceShipHeight, spaceShipWidth);
		SpaceShip d = new SpaceShipDELTA(spaceShipHeight, spaceShipWidth);
		SpaceShip e = new SpaceShipENEMY(spaceShipHeight, spaceShipWidth);
		
		// Add them to the list
		
		spaceShipList.add(z);
		spaceShipList.add(a);
		spaceShipList.add(b);
		spaceShipList.add(g);
		spaceShipList.add(d);
		spaceShipList.add(e);
		
		System.out.println("Enter command to check spaceship movements:");
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s1 = sc.next();  // get movement with WASD as strings
			System.out.println(s1);
			int i = 0;
			while(i < spaceShipList.size()) {
				if(s1.equals("w")) spaceShipList.get(i).moveUP();
				if(s1.equals("s")) spaceShipList.get(i).moveDOWN();
				if(s1.equals("a")) spaceShipList.get(i).moveLEFT();
				if(s1.equals("d")) spaceShipList.get(i).moveRIGHT();
				spaceShipList.get(i).printCoords();
				i++;
			}
		}
		
		sc.close();
	}

}
