package com.moonlight_academy.frappe_client_java;

import com.moonlight_academy.frappe_client_java.exception.AuthException;

/**
 * Hello world!
 *
 */
public class FrappeClientJava 
{
    private String url;
    private String username;
    private String password;

	public FrappeClientJava(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
    
    public void login(String username, String password) throws AuthException {
    	if (username.isBlank() || password.isEmpty()) {
    		throw new AuthException();
    	}
    }
    
    public String getUrl() {
    	return this.url;
    }
}