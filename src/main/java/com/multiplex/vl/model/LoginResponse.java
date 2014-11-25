/**
 * 
 */
package com.multiplex.vl.model;

/**
 * @author sharduls
 * 
 */
public class LoginResponse {

	String viewName;

	/**
	 * @return the viewName
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * @param viewName
	 *            the viewName to set
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	/**
	 * @return the congifData
	 */
	public String getCongifData() {
		return congifData;
	}

	/**
	 * @param congifData
	 *            the congifData to set
	 */
	public void setCongifData(String congifData) {
		this.congifData = congifData;
	}

	String congifData;

}
