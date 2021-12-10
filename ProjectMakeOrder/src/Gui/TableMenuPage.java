package Gui;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 


public class TableMenuPage implements ActionListener {

	JButton StartOrderButton = new JButton("Start Order");
	JFrame frame = new JFrame();
	
	TableMenuPage(){
		
		StartOrderButton.setBounds(100,160,200,40);
		StartOrderButton.setFocusable(false);
		StartOrderButton.addActionListener((ActionListener) this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(StartOrderButton); {
}
	}
	//* denne event opstår når man klikker på Start Ordrer knappen

		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==StartOrderButton) {
			frame.dispose();
			 OrderPage OrderPage = new OrderPage();
			 } 
			}}
