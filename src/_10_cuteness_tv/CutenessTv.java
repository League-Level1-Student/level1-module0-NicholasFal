package _10_cuteness_tv;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton fluffyunicorn = new JButton();
	public void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(frog);
		panel.add(duck);
		panel.add(fluffyunicorn);
		duck.setText("Duck");
		duck.addActionListener(this);
		frog.setText("Frog");
		frog.addActionListener(this);
		fluffyunicorn.setText("Fluffly Unicorn");
		fluffyunicorn.addActionListener(this);
		frame.pack();
	
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     JOptionPane.showMessageDialog(null, videoID);
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == duck) {
			showDucks();
		} else if(event.getSource() == frog) {
			showFrog();
		} else if(event.getSource() == fluffyunicorn) {
			showFluffyUnicorns();
		}
	}
}
