import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class chars extends JFrame implements ActionListener{

JMenuBar menuBar;
	
	JMenu sukuna;
	JMenu gojo;
	JMenu kenjaku;
	//sukuna
	JMenuItem dismantle;
	JMenuItem fuga;
	JMenuItem DE;
	
	ImageIcon Tdismantle;
	ImageIcon Tfuga;
	ImageIcon domain;
	
	File file1;
	Clip clip1;
	
	File file2;
	Clip clip2;
	
	File file3;
	Clip clip3;
	
	
	
	//gojo
	JMenuItem blue;
	JMenuItem red;
	JMenuItem purple;
	
	ImageIcon Tblue;
	ImageIcon Tred;
	ImageIcon Tpurple;
	
	File file4;
	Clip clip4;
	
	File file5;
	Clip clip5;
	
	File file6;
	Clip clip6;
	
	//kenjaku
	JMenuItem idle;
	
	ImageIcon Tidle;
	
	File file7;
	Clip clip7;
	
	
	JPanel panel1;
	
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	
	JLayeredPane layer;
	
	
	chars(){
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		
		sukuna = new JMenu("Sukuna");
		gojo = new JMenu("Gojo");
		kenjaku = new JMenu("Kenjaku");
		
		//sukunas move set
		dismantle = new JMenuItem("Dismantle");
		fuga = new JMenuItem("Fuga");
		DE = new JMenuItem("Domain Expansion");
		
		Tdismantle = new ImageIcon("dismantle.png");
		Tfuga = new ImageIcon("fuga.png");
		domain = new ImageIcon("tenkai.png");
		
		label1 = new JLabel();
		label1.setIcon(Tdismantle);
		label1.setBounds(0,0,500,500);
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(500,450));
		panel1.setBackground(Color.black);
		
		
		label2 = new JLabel();
		label2.setBounds(0,0,500,450);
		
		
		
		
		label3 = new JLabel();
		label2.setIcon(Tfuga);
		label3.setIcon(domain);
		label3.setBounds(0,0,500,500);
		
	
		
		dismantle.addActionListener(this);
		fuga.addActionListener(this);
		DE.addActionListener(this);
		
		//gojos move set
		red = new JMenuItem("Reversal Red");
		blue = new JMenuItem("Amplification Blue");
		purple = new JMenuItem("Hollow Purple");
		
		Tred = new ImageIcon("blue.png");
		Tblue = new ImageIcon("Red.png");
		Tpurple = new ImageIcon("hollow.png");
		
		label4 = new JLabel();
		label4.setIcon(Tred);
		label4.setBounds(0,0,500,500);
		
		label5 = new JLabel();
		label5.setIcon(Tblue);
		label5.setBounds(0,0,500,500);
		
		
		label6 = new JLabel();
		label6.setIcon(Tpurple);
		label6.setBounds(0,0,500,500);
		
		
		red.addActionListener(this);
		blue.addActionListener(this);
		purple.addActionListener(this);
		
		//kenjaku move set
		idle = new JMenuItem("Idle Transfigaration");
		
		Tidle = new ImageIcon("idle.png");
		
		dismantle.addActionListener(this);
		
		
		sukuna.setMnemonic(KeyEvent.VK_F); //Alt + F for sukuna
		gojo.setMnemonic(KeyEvent.VK_E); //Alt + e for gojo
		kenjaku.setMnemonic(KeyEvent.VK_H); //Alt + h for kenjaku
		
		dismantle.setMnemonic(KeyEvent.VK_S); //s for dismantle
		fuga.setMnemonic(KeyEvent.VK_L); // l for fuga
		DE.setMnemonic(KeyEvent.VK_X); // x for DE 
		
		Tidle = new ImageIcon("idle.png");
		
		label7 = new JLabel();
		label7.setIcon(Tidle);
		label7.setBounds(0,0,500,500);
		
		
		
		
		
		
		
		
		
		menuBar.add(sukuna);
		menuBar.add(gojo);
		menuBar.add(kenjaku);
		
		sukuna.add(dismantle);
		sukuna.add(fuga);
		sukuna.add(DE);
		
		gojo.add(blue);
		gojo.add(red);
		gojo.add(purple);
		
		kenjaku.add(idle);
		
		
		
		
		this.setJMenuBar(menuBar);
		this.add(panel1);
		panel1.removeAll();
		this.setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    // Stop any playing clip before starting a new one
	    stopCurrentAudio();

	   
	    panel1.removeAll();

	    if (e.getSource() == dismantle) {
	        panel1.add(label1);  
	        playAudio("kai.wav", clip1);
	    } 
	    else if (e.getSource() == fuga) {
	        panel1.add(label2);  
	        playAudio("fuga.wav", clip2);
	    } 
	    else if (e.getSource() == DE) {
	        panel1.add(label3); 
	        playAudio("sdo.wav", clip3);
	    } 
	    else if (e.getSource() == blue) {
	        panel1.add(label4);  
	        playAudio("ampBlue.wav", clip4);
	    } 
	    else if (e.getSource() == red) {
	        panel1.add(label5);  
	        playAudio("Reverse.wav", clip5);
	    } 
	    else if (e.getSource() == purple) {
	        panel1.add(label6);  
	        playAudio("HolPurple.wav", clip6);
	    } 
	    else if (e.getSource() == idle) {
	        panel1.add(label7);  
	        playAudio("idleT.wav", clip7);
	    }

	    
	    panel1.revalidate();
	    panel1.repaint();
	    this.setVisible(true);
	}

	private void stopCurrentAudio() {
	   
	    if (clip1 != null && clip1.isRunning()) {
	        clip1.stop();
	        clip1.close();  
	    }
	    if (clip2 != null && clip2.isRunning()) {
	        clip2.stop();
	        clip2.close();
	    }
	    if (clip3 != null && clip3.isRunning()) {
	        clip3.stop();
	        clip3.close();
	    }
	    if (clip4 != null && clip4.isRunning()) {
	        clip4.stop();
	        clip4.close();
	    }
	    if (clip5 != null && clip5.isRunning()) {
	        clip5.stop();
	        clip5.close();
	    }
	    if (clip6 != null && clip6.isRunning()) {
	        clip6.stop();
	        clip6.close();
	    }
	    if (clip7 != null && clip7.isRunning()) {
	        clip7.stop();
	        clip7.close();
	    }
	}

	private void playAudio(String fileName, Clip clip) {
	    try {
	        File audioFile = new File(fileName);
	        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
	        
	        if (clip != null && clip.isOpen()) {
	            clip.stop();      
	            clip.close();      
	        }

	        clip = AudioSystem.getClip();
	        clip.open(audioStream);
	        clip.setFramePosition(0);  
	        clip.start();
	    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	        e.printStackTrace();
	    }
	}


	

	
	
	}


