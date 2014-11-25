/**
 * 
 */
package com.multiplex.vl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sharduls
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest {

	private String userName;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

}
