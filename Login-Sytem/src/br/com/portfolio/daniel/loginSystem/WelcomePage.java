package br.com.portfolio.daniel.loginSystem;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Daniel Souza
 *
 */
public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	
	/**
	 * 
	 * @param userID
	 */
	WelcomePage(String userID){
		welcomeLabel.setText("Bem Vindo " + userID + "!");
		welcomeLabel.setBounds(0, 0, 200, 50);
		
		frame.add(welcomeLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
