package br.com.portfolio.daniel.loginSystem;

/**
 * 
 * @author Daniel Souza
 *
 */
public class Main {

	/**
	 * 
	 * @param args do metodo main
	 */
	public static void main(String[] args) {

		IdAndPasswords idAndPasswords = new IdAndPasswords();
		
		LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());
	}

}