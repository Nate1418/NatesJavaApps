package megl;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderDem implements ChangeListener{

	JFrame frame;
	JLabel label;
	JPanel panel;
	JSlider slider;
	
	sliderDem(){
		
		frame = new JFrame("Slider Demo");
		label = new JLabel();
		panel = new JPanel();
		slider = new JSlider(0,100,50);
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN,15));
		slider.addChangeListener(this);
		
		label.setText("C = "+ slider.getValue());
		
		panel.setPreferredSize(new Dimension(200,200));
		
		panel.add(label);
		panel.add(slider);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.setSize(450,400);
		frame.setVisible(true);
		
		
	}
	
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("C = "+ slider.getValue());
	}

}
