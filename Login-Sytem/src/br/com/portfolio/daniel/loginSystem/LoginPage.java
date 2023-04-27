package br.com.portfolio.daniel.loginSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * 
 * Aqui temos o visual da caixa com todas as informações necessárias para tudo funcionar
 * 
 * @author Daniel Souza
 * 
 */
public class LoginPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIdLabel = new JLabel("User ID: ");
	JLabel userPasswordLabel = new JLabel("Password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	/**
	 * Caracteristicas da caixa e implementação
	 * @param loginInfoOriginal
	 */
	LoginPage(HashMap<String, String> loginInfoOriginal) {
		loginInfo = loginInfoOriginal;
		
		userIdLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		
		userIdField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
//		loginButton.setText("Login"); se não for declarado no construtor, implementamos esse setText
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
//		resetButton.setText("Reset"); o mesmo aqui
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIdField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userIdLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	/**
	 * Sobreescrição do metodo e implementação
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resetButton) {
			userIdField.setText("");
			userPasswordField.setText("");
		}
		
		if (e.getSource() == loginButton) {
			String userID = userIdField.getText();
			String userPassword = String.valueOf(userPasswordField.getPassword());
			
			if (loginInfo.containsKey(userID)) {
				if (loginInfo.get(userID).equals(userPassword)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Entrando");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				}else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Login ou Senha inválidos");
				}
			}else {
				messageLabel.setForeground(Color.red);
//				messageLabel.setText("Login ou Senha inválidos"); a fim de segurança, essa é a forma mais correta! quem está tentando invadir a conta, não pode saber se errou o login ou a senha.
				messageLabel.setText("Login inválido"); // a fim de testar o programa, usarei essa mensagem.
			}
			
		}
	}
	
}
