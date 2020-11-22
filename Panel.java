//*********  Use of panel  ********** 

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {
	public static void main(String[] args) {
		JFrame f = new JFrame("Title Here");
		f.setSize(500,500);
		f.setResizable(true);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel p1=new JPanel();
		f.add(p1);
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		p1.setVisible(true);
		
	
	}
	}