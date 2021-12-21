package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OrderPage implements ActionListener{

	JButton FinishOButton = new JButton("finish order");
	JButton WaiterButton = new JButton("Get Waiter");
	JFrame frame = new JFrame();
	JLabel label = new JLabel();

	OrderPage(){ 
	
		frame.add(WaiterButton);
		WaiterButton.setBounds(200,300,100,40);
		WaiterButton.setFocusable(false);
		WaiterButton.addActionListener((ActionListener) this);
		WaiterButton.setVisible(true);
		
	
		FinishOButton.setBounds(100,300,100,40);
		FinishOButton.setFocusable(false);
		FinishOButton.addActionListener((ActionListener) this);
		FinishOButton.setVisible(true);
		
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(FinishOButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 
		label.setText("salat m. kylling");
		label.setVisible(true);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBounds(400,350,200,40);
		frame.add(label); 
	} 
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==WaiterButton); 
		WaiterOnWayPage WaiterOnWayPage = new WaiterOnWayPage(); 
		
	}	
	



}



