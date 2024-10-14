package megl;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class buts extends JFrame implements ActionListener{
	
	JComboBox combo;
	ImageIcon pic;
	buts(){
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"Dog","Cat","Bird"};		
		combo = new JComboBox(animals);
		combo.addActionListener(this);
		
		pic = new ImageIcon("laugh.png");
		
		
		this.add(combo);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combo) {
			JOptionPane.showMessageDialog(null, "You sure you a want "+ combo.getSelectedItem(), "Your choice", JOptionPane.OK_OPTION, pic);
		}
		
		}
		}
	

	
	
	

