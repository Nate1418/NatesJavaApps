package megl;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keyp extends JFrame implements KeyListener  {


	JLabel label;
	ImageIcon img;
	keyp(){
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		img = new ImageIcon("rock.png");
		
		label = new JLabel();
		label.setIcon(img);
		label.setBounds(0,0,100,100);
		
		
		this.add(label);
		this.getContentPane().setBackground(Color.black);;
		this.setVisible(true);
		
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 39: label.setLocation(label.getX()+11, label.getY());
			break;
		case 37: label.setLocation(label.getX()-11, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-11);
			break;
		case 40 : label.setLocation(label.getX(), label.getY()+11);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released key char: " + e.getKeyChar());
		
		System.out.println("You released key code: " + e.getKeyCode());
	}

}
