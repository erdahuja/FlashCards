import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class FlashCards extends JWindow{
	public FlashCards() {
		JFrame fc=new JFrame();
		ArrayList<FlashCardObject> cardList=new ArrayList<>();
		fc.setTitle("Flash Cards Reloaded");
		fc.setBounds(500, 100, 500, 550);
		JPanel panel = new JPanel();
		
		
		
		fc.getContentPane().add(panel);
		panel.setLayout(null);
		
		

		JTextArea ansArea = new JTextArea();
		ansArea.setToolTipText("Add Question Here");
		ansArea.setBounds(90, 70, 330, 100);
		ansArea.setColumns(30);
		ansArea.setRows(10);
		panel.add(ansArea);
		
		JTextArea queArea = new JTextArea();
		queArea.setToolTipText("Add Answer Here ");
		queArea.setBounds(90, 200, 330, 100);
		queArea.setRows(10);
		//queArea.setTabSize(5);
		
		queArea.setColumns(30);
		panel.add(queArea);
		
		JLabel lblCreateFlashCard = new JLabel("Create Flash Card");
		lblCreateFlashCard.setFont(new Font("DialogInput", Font.BOLD, 15));
		lblCreateFlashCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateFlashCard.setBounds(90, 12, 330, 26);
		panel.add(lblCreateFlashCard);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(90, 416, 125, 50);
		btnSave.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
						

				String que=queArea.getText();
				String ans=ansArea.getText();
				
				if(!(que.equals("")||ans.equals( ""))){
					

					FlashCardObject fco=new FlashCardObject(que,ans+"\n");
					cardList.add(fco);
					System.out.println("Card Added to list......");
					            		
            	}
				else
				{
					
            		JOptionPane.showMessageDialog(null, "Empty Field", "Error", JOptionPane.ERROR_MESSAGE);
            		
				}
				
				
				ObjectLogic.writeObject(cardList);
				System.out.println("card created......");
				
				
				
			}
			
		});
		panel.add(btnSave);
		
		JLabel lblAddQuestion = new JLabel("Add Question");
		lblAddQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddQuestion.setBounds(120, 40, 235, 26);
		panel.add(lblAddQuestion);
		
		JLabel lblAddAnswer = new JLabel("Add Answer");
		lblAddAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAnswer.setBounds(133, 173, 189, 15);
		panel.add(lblAddAnswer);
		
		JButton btnNextCard = new JButton("Next Card");
		btnNextCard.setBounds(293, 416, 125, 50);
		
		btnNextCard.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			
				String que=queArea.getText();
				String ans=ansArea.getText();
				
				if(!(que.equals("")||ans.equals( ""))){
					

					FlashCardObject fco=new FlashCardObject(que,ans);
					cardList.add(fco);
					System.out.println("Card Added to list......");
					
					            		
            	}
				else
				{
					//System.out.println("flag"); 
            		JOptionPane.showMessageDialog(null, "Empty Field", "Error", JOptionPane.ERROR_MESSAGE);
            		
				}
				
				
				queArea.setText("");
				ansArea.setText("");
				
				
				
			}
			
			
		});
		
		
		
		
		panel.add(btnNextCard);
		fc.setVisible(true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		FlashCards fc=new FlashCards(); 
		
		
	}
}
