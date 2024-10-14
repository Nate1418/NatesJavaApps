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
		// TODO Auto-generated method stub
		panel1.removeAll();
		if(e.getSource()==dismantle) {
			panel1.removeAll();
			
			
			panel1.add(label1);
			this.setVisible(true);
			
			
			
			file1 = new File("kai.wav");
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file1);
				clip1 = AudioSystem.getClip();
				clip1.open(audio1);
				clip1.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
		
		else if(e.getSource()==fuga) {
			this.remove(panel1);
			
			file2 = new File("fuga.wav");
			
			
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file2);
				clip2 = AudioSystem.getClip();
				clip2.open(audio1);
				clip2.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
		
			
			
			this.add(panel1);
			panel1.add(label2);
			this.setVisible(true);
			
		}
		
		else if(e.getSource()==DE) {
			panel1.removeAll();
			file3 = new File("sdo.wav");
			
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file3);
				clip3 = AudioSystem.getClip();
				clip3.open(audio1);
				clip3.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
			panel1.add(label3);
			this.setVisible(true);
		}
		
		else if(e.getSource()==blue) {
			panel1.removeAll();
			file4 = new File("ampBlue.wav");
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file4);
				clip4 = AudioSystem.getClip();
				clip4.open(audio1);
				clip4.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
			
			
			
			panel1.add(label4);
			this.setVisible(true);
		}
		
		else if(e.getSource()==red) {
			panel1.removeAll();
			
			
			file5 = new File("Reverse.wav");
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file5);
				clip5 = AudioSystem.getClip();
				clip5.open(audio1);
				clip5.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
			
			panel1.add(label5);
			this.setVisible(true);
		}
		
		if(e.getSource()==purple) {
			panel1.removeAll();
			
			file6 = new File("HolPurple.wav");
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file6);
				clip6 = AudioSystem.getClip();
				clip6.open(audio1);
				clip6.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
			panel1.add(label6);
			this.setVisible(true);
		}
		
		else if(e.getSource()==idle) {
			panel1.removeAll();
		
			file7 = new File("idleT.wav");
			
			try {
				AudioInputStream audio1 = AudioSystem.getAudioInputStream(file7);
				clip7 = AudioSystem.getClip();
				clip7.open(audio1);
				clip7.start();
			}

			catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
			
			panel1.add(label7);
			this.setVisible(true);
		}
		
	}

}
