package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		rob.setWindowColor(0, 0, 0);
		rob.setX(50);
		rob.setY(530);
		rob.setPenWidth(10);
		rob.setSpeed(200);
		Random rand = new Random();
		for (int homes = 0; homes < 9; homes++) {
			int randomHeight = rand.nextInt(3);
			String size = "unnamed";
			String colors = "unnamed";
			if (randomHeight == 0) {
				size = "small";
				colors = "orange";
			} else if (randomHeight == 1) {
				size = "medium";
				colors = "green";
			} else {
				size = "large";
				colors = "purple";
			}
			drawHouse(size, colors);
		}
	}

	void drawHouse(String height, String color) {
		int heightInt = 0;
		if(height.equalsIgnoreCase("small")) {
			heightInt = 60;
		} else if(height.equalsIgnoreCase("medium")) {
			heightInt = 120;
		} else if(height.equalsIgnoreCase("large")) {
			heightInt = 250;
		}
		rob.penDown();
		if(color.equals("orange")) {
			rob.setPenColor(255, 105, 1);
		} else if(color.equals("green")) {
			rob.setPenColor(25, 135, 35);
		} else {
			rob.setPenColor(127, 1, 127);
		}
		rob.move(heightInt);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof();
		} else {
			drawPeakedRoof();
		}
		rob.move(heightInt);
		rob.turn(270);
		rob.setPenColor(5, 255, 5);
		rob.move(60);
		rob.turn(270);
	}

	void drawPeakedRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
	}

	void drawFlatRoof() {
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
	}
}
