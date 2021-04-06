package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame dragon = new JFrame();
		dragon.setVisible(true);
		// This will make sure the program exits when you close the window
		dragon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String url = "https://yt3.ggpht.com/ytc/AAUvwnjPnBR5sgOeA3GfPBKBmvSaWegQcIpjemw5EdB7=s900-c-k-c0x00ffffff-no-rj";
		// 2. create a variable of type "Component" that will hold your image
		Component image; 
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(url);
		// 4. add the image to the quiz window
		dragon.add(image);
		// 5. call the pack() method on the quiz window
		dragon.pack();
		// 6. ask a question that relates to the image
		String animal = JOptionPane.showInputDialog("What mystical animal appears in this image?");
		// 7. print "CORRECT" if the user gave the right answer
		if(animal.equalsIgnoreCase("dragon")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect...");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		dragon.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		//JFrame pig = new JFrame ();
		//pig.setVisible(true);
		//pig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String urlTwo = "https://yt3.ggpht.com/ytc/AAUvwnhKhO96M4XntJfdMiRnq7U9GSQMloqMfPfvHFzj=s88-c-k-c0x00ffffff-no-rj";
		Component imageTwo;
		imageTwo = createImage(urlTwo);
		// 11. add the second image to the quiz window
		dragon.add(imageTwo);
		// 12. pack the quiz window
		dragon.pack();
		// 13. ask another question
		String animalAgain = JOptionPane.showInputDialog("What animal appears in this image?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(animalAgain.equalsIgnoreCase("pig")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect...");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
