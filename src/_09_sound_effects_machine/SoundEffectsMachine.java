package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton harp = new JButton();
	JButton airHorn = new JButton();
	JPanel panel = new JPanel();
	JButton doorbell = new JButton();
	JButton drumRoll = new JButton();
	public void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		harp.setText("Harp");
		frame.add(harp);
		harp.addActionListener(this);
		airHorn.setText("Air Horn");
		airHorn.addActionListener(this);
		doorbell.setText("Doorbell");
		doorbell.addActionListener(this);
		drumRoll.setText("Drum Roll");
		drumRoll.addActionListener(this);
		panel.add(harp);
		panel.add(airHorn);
		panel.add(doorbell);
		panel.add(drumRoll);
		frame.add(panel);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource() == harp) {
		JOptionPane.showMessageDialog(null, "Harp noise");
		} else if(event.getSource() == airHorn) {
			JOptionPane.showMessageDialog(null, "Air Horn noise");
		} else if(event.getSource() == doorbell) {
			JOptionPane.showMessageDialog(null, "Doorbell");
		} else if(event.getSource() == drumRoll) {
			JOptionPane.showMessageDialog(null, "Drum Roll");
		}
	}
}