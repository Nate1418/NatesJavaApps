package megl;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseL extends JFrame implements MouseListener{

	ImageIcon pain;
	ImageIcon dizzy;
	ImageIcon eh;
	ImageIcon smile;
	
	JLabel label;
	
	mouseL(){
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setSize(500,500);
		
		
	label = new JLabel();
	label.addMouseListener(this);
	
	pain = new ImageIcon("pain.png");
	dizzy = new ImageIcon("dead.png");
	eh = new ImageIcon("eh.png");
	smile = new ImageIcon("smile.png");
	 
	label.setIcon(smile);
	
	this.add(label);
	this.pack();
	this.setLocationRelativeTo(null);
	this.setVisible(true);
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(pain);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(eh);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(smile);
	}

	
}
