package br.com.portfolio.daniel.loginSystem;

import java.util.HashMap;


/**
 * 
 * @author Daniel Souza
 *
 */
public class IdAndPasswords {
	
	private HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IdAndPasswords(){
		loginInfo.put("PowBretao", "money");
		loginInfo.put("PowBretas", "dindin");
		loginInfo.put("PowBretasso", "dinhairo");
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
}
