/**
 * 
 */
package com.multiplex.vl.model;

/**
 * @author sharduls
 * 
 */
public class ServiceResponseHolder {

	private boolean success = false;
	private String userNameError;
	private String passwordError;

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the userNameError
	 */
	public String getUserNameError() {
		return userNameError;
	}

	/**
	 * @param userNameError
	 *            the userNameError to set
	 */
	public void setUserNameError(String userNameError) {
		this.userNameError = userNameError;
	}

	/**
	 * @return the passwordError
	 */
	public String getPasswordError() {
		return passwordError;
	}

	/**
	 * @param passwordError
	 *            the passwordError to set
	 */
	public void setPasswordError(String passwordError) {
		this.passwordError = passwordError;
	}

}
