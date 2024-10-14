package megl;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import javax.swing.*;

public class progressB implements ActionListener {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,1000);
	JButton button = new JButton(); 
	JButton button1 = new JButton(); 
	JButton button2 = new JButton(); 
	int Counter = 1000;
	AudioInputStream audio;
	File file;
	Clip clip;
	
	progressB(){
		
		//bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		bar.setFont(new Font("MV Boli", Font.BOLD,10));
		bar.setValue(Counter);
	
		button.setText("Cleave");
		button1.setText("Dismatle");
		button2.setText("Ryoiki Tenkai");
		
		button.setBounds(150,60,100,50);
		button1.setBounds(150,130,100,50);
		button2.setBounds(150,200,100,50);
		
		button.setFocusable(false);
		button1.setFocusable(false);
		button2.setFocusable(false);
		
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		
		frame.add(bar);
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.setSize(420,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	
	
	
	
	

public void fill() {
		
		
		while(Counter<=1000) {
			bar.setValue(Counter);
			
			try {
				Thread.sleep(190);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			Counter-=100;
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource()==button) {
			file = new File("kai.wav");
			try {
				audio = AudioSystem.getAudioInputStream(file);
				clip = AudioSystem.getClip();
				clip.open(audio);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			clip.start();
			
			Counter -=100;
			bar.setValue(Counter);
			
			
		}
		
		else if(e.getSource()==button1) {
			Counter -=300;
			bar.setValue(Counter);
		}
		else if (e.getSource()== button2) {
			
			
			for (int i = 0 ; i<=Counter; ++i) {
				
				try {
					Thread.sleep(80);
					bar.setValue(i);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
			
			
		}
	
		}
	
	
		
		
	} 



