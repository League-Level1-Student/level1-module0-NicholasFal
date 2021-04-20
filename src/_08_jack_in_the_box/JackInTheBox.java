package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener {
	public void jackInBox() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.setText("Surprise!");
		frame.pack();
		button.addActionListener(this);
	}
int counter = 0;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(counter == 5) {
			
		}
		counter++;
	}
}
