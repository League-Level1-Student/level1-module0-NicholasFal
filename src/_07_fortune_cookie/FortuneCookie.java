package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand == 0) {
		JOptionPane.showMessageDialog(null, "A lifetime friend shall soon be made!");
		}else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "Do not make extra work for yourself...");
		}else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "Good news will come to you by mail!");
		}else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "Now is time to try something new.");
		} else {
			JOptionPane.showMessageDialog(null, "Your talents will be recognized and suitably rewarded!");
		}
	}
}
