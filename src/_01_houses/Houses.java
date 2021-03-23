package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		rob.setX(50);
		rob.setY(530);
		Random rand = new Random();
	for(int homes = 0; homes < 9; homes++) {
	int randomHeight = rand.nextInt(2) + 1;
	drawHouse(randomHeight);
	}
	}
	
	void drawHouse(String height) {
		int heightInt = 0;
		if(height.equalsIgnoreCase("small")) {
			heightInt = 60;
		} else if(height.equalsIgnoreCase("medium")) {
			heightInt = 120;
		} else if(height.equalsIgnoreCase("large")) {
			heightInt = 250;
		}
		rob.penDown();
		rob.setPenColor(255, 5, 5);
		rob.setPenWidth(10);
		rob.setSpeed(200);
		rob.move(heightInt);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(heightInt);
		rob.turn(270);
		rob.setPenColor(5, 255, 5);
		rob.move(60);
		rob.turn(270);
	}
}
