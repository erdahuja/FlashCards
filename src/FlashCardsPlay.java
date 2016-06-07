import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class FlashCardsPlay {

	private JFrame frame;
	private int index = 0;
	private boolean isAnswer=false;
	private JTextPane textPane;
	JButton btn;
	ArrayList<FlashCardObject> fb;
	
	public static void main(String[] args) {
		new FlashCardsPlay();
		
	}


	public FlashCardsPlay() {
		initialize();
		
		
	}

	
	private void initialize()  {
		
		frame = new JFrame();
		frame.setBounds(100, 120, 453, 347);
		
		JPanel panel = new JPanel()	;		
		panel.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setBounds(47, 12, 324, 236);
		panel.add(textPane);
		
		btn=new JButton();
		btn.setLayout(null);
		btn.setBounds(170,253,116,35);
	btn.setText("Start");
		panel.add(btn);
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(index<fb.size()){
				FlashCardObject foc=fb.get(index);
				
				display(foc);
				}

				else
				{
					textPane.setText("No More Questions");
					btn.setVisible(false);
					index=0;
									
					
				}
			
				
			}
			
			
		});
		
		
	try {
		fb=ObjectLogic.readObject();
		
	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	frame.getContentPane().add(panel);
	
		frame.setVisible(true);
		
		
		
		
	}

	private void display(FlashCardObject foc) {
		
		
		if(isAnswer){
			//System.out.println(fb.size());
			if(index<fb.size()){
			textPane.setText("Answer is :"+foc.getAnswer());
			isAnswer=!isAnswer;
			btn.setText("Next");
			index++;
			}
			
			
		}
		else{
			
			
			textPane.setText("Question is :"+foc.getQuestion());
			isAnswer=!isAnswer;
			btn.setText("Show Answer");
			
			
			
			
			
		}
	}




	
	
}
