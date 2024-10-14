package megl;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class colorchoos extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	colorchoos(){
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Change color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("This Color can Change");
		label.setBackground(Color.white);
		label.setFont(new Font("MV Boli", Font.PLAIN,100));
		label.setOpaque(true);
		
		this.add(label);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if(e.getSource()==button) {
				JColorChooser colorchoose = new JColorChooser();
				
				Color color = JColorChooser.showDialog(null, "Choose a color...i guess", Color.black);
				//label.setForeground(color);
				label.setBackground(color);
				
			}
	}

}
