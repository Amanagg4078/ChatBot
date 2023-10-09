package chatbot.project;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	JLabel label=new JLabel();
	MyFrame(){
		this.setVisible(true);
		this.setSize(800,800);
		this.setTitle("ChatBot using java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		ImageIcon image=new ImageIcon("logo.png");
		this.setIconImage(image.getImage()); 
//		this.getContentPane().setBackground(new Color(236,161,255));
		label.setText("Hello how are you?");
		this.add(label);
	}
}
