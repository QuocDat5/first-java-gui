import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;



public class GUI implements ActionListener {
	
	private int count = 0;
	
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	
	
	public GUI() {
		
		frame = new JFrame();
		
		// the clickable button
		JButton button = new JButton("Click me!");
		button.addActionListener(this);
		
		label = new JLabel();
		
        // the panel with the button and text
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
        // set up the frame and display it
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Dat's first Java GUI");
		frame.pack();
		frame.setVisible(true);
		
}

	public static void main(String[] args) {
		new GUI();
	}

	@Override
    // process the button clicks
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		
		label.setText("Number of clicks: " + count);
	}

}
