import java.awt.EventQueue;

import javax.swing.JFrame;

public class FlashCardsPlay {

	private JFrame frame;

	
	public static void main(String[] args) {
		new FlashCardsPlay();
		
	}


	public FlashCardsPlay() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		
		ObjectLogic.readObject();
		frame.setVisible(true);
		
		
		
		
	}

}
