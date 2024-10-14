package megl;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class fileope extends  JFrame implements ActionListener  {

	JButton button;
	
	fileope(){
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Filw Opener");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			
			JFileChooser chooser = new JFileChooser();
			
			chooser.setCurrentDirectory(new File("."));
			
			
			int response = chooser.showOpenDialog(chooser);
			
			if (response == chooser.APPROVE_OPTION) {
				File file = new File(chooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

	
}
