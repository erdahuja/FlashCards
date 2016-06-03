import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JToggleButton;

public class FirstScreen {
	private static JTextField nameField;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame fc=new JFrame();
		
		fc.setTitle("Flash Cards Reloaded");
		fc.setBounds(200, 200, 400, 400);
		fc.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Enter Your Name");
		lblName.setBounds(60, 60, 140, 25);
		fc.getContentPane().add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(236, 60, 140, 25);
		fc.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JButton btnCreateFc = new JButton("Create FC");
		btnCreateFc.setBounds(60, 260, 117, 25);
		btnCreateFc.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			
					
				String name=nameField.getText();
				          	
					//System.out.println("flag"); 
				if(name.equals("")){
            		JOptionPane.showMessageDialog(null, "Empty Field ", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null, "Welcome : "+name, null, JOptionPane.INFORMATION_MESSAGE);
					fc.setVisible(false);
					new FlashCards();		
				
				}
			}
			
			
		});
		fc.getContentPane().add(btnCreateFc);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(236, 260, 117, 25);
		
		btnPlay.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			
					
				String name=nameField.getText();
				          	
					//System.out.println("flag"); 
				if(name.equals("")){
            		JOptionPane.showMessageDialog(null, "Empty Field ", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null, "Welcome : "+name, null, JOptionPane.INFORMATION_MESSAGE);
					
					fc.setVisible(false);
					new FlashCardsPlay();		
				
				}
			}
			
			
		});
		
		
		fc.getContentPane().add(btnPlay);
		fc.setVisible(true);
	}
}
