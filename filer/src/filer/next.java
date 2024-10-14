package filer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class next extends JFrame implements ActionListener{

	JButton nut;
	JButton nut1;
	JButton nut2;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLayeredPane layerPane;
	
	public next() {

		
		 nut = new JButton();
		nut.setText("nate");
		nut.setSize(60,30);
		nut.setBackground(Color.WHITE);
		nut.addActionListener(this);
		
		
		
		 nut1 = new JButton();
			nut1.setText("nate");
			nut1.setSize(60,30);
			nut1.setBackground(Color.WHITE);
			nut1.addActionListener(this);
			
			 nut2 = new JButton();
				nut2.setText("nate");
				nut2.setSize(60,30);
				nut2.setBackground(Color.WHITE);
				nut2.addActionListener(this);
		
		 layerPane = new JLayeredPane();
		layerPane.setBounds(0,0,500,500);
		
		
		
		 label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		label1.setLayout(new BorderLayout(100,0));
		label1.add(nut);
		
		
		
		 label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100,100,200,200);
		label2.setLayout(new BorderLayout(100,0));
		label2.add(nut1);
		
		
		
		
		 label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,200,200);
		label3.setLayout(new BorderLayout(100,0));
		label3.add(nut2);
		
		
		
		
		
		
		new JFrame("JLayeredPane");
		
		layerPane.add(label1, Integer.valueOf(0));
		layerPane.add(label2, Integer.valueOf(1));
		layerPane.add(label3, Integer.valueOf(2));
		this.add(layerPane);
		this.setTitle("Me");
		this.setSize(new Dimension(500, 500));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		
		
		
		
		
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== nut) {
			layerPane.removeAll();
			
			layerPane.add(label1, Integer.valueOf(2));
			layerPane.add(label2, Integer.valueOf(1));
			layerPane.add(label3, Integer.valueOf(0));
			
			this.setVisible(true);
		}
		
		else if(e.getSource()== nut1) {
			layerPane.removeAll();
			
			layerPane.add(label1, Integer.valueOf(1));
			layerPane.add(label2, Integer.valueOf(2));
			layerPane.add(label3, Integer.valueOf(0));
			
			this.setVisible(true);
		}
		else {
			layerPane.removeAll();
			
			layerPane.add(label1, Integer.valueOf(1));
			layerPane.add(label2, Integer.valueOf(0));
			layerPane.add(label3, Integer.valueOf(2));
			
			this.setVisible(true);
		}
		
	}
}
